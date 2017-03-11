package semantic;

import semantic.gen.QB64v3BaseVisitor;
import semantic.gen.QB64v3Lexer;
import semantic.gen.QB64v3Parser;

import javax.print.DocFlavor;
import java.util.*;

/**
 * Created by milderhc on 10/03/17.
 */
public class QBVisitor<T> extends QB64v3BaseVisitor<T> {

    public Map<String, Sub> subs;
    public Map<String, Function> functions;

    public Set<Variable> dynamicMemory, staticMemory;

    public QBVisitor() {
        subs = new TreeMap<>();
        functions = new TreeMap<>();
        dynamicMemory = new TreeSet<>();
        staticMemory = new TreeSet<>();
    }

    @Override
    public T visitQb(QB64v3Parser.QbContext ctx) {
        List<QB64v3Parser.InstructionContext> instruction = ctx.instruction();
        List<QB64v3Parser.FunprocContext> funproc = ctx.funproc();

        for (QB64v3Parser.FunprocContext f : funproc)
            visit(f);

        for (QB64v3Parser.InstructionContext i : instruction)
            visit(i);

        return null;
    }

    @Override
    public T visitDeclaration (QB64v3Parser.DeclarationContext ctx) {
        List<QB64v3Parser.DimIdContext> dimIdContexts = ctx.dimId();
        dimIdContexts.forEach(dimIdContext -> {
            createDimVariable(dimIdContext, ctx.type.getType());
        });
        return null;
    }

    private void createDimVariable (QB64v3Parser.DimIdContext ctx, int type) {
        String name = ctx.ID().getText();

        if (ctx.array() != null) {
            name += "@";
            List<Integer> dimensions = (List<Integer>) visit(ctx.array());
            switch (type) {
                case QB64v3Lexer.INTEGER:
                    addNewStaticVariable(new ArrayQB<Short>(name, Variable.Type.INTEGER, dimensions));
                    break;
                case QB64v3Lexer.LONG:
                    addNewStaticVariable(new ArrayQB<Integer>(name, Variable.Type.LONG, dimensions));
                    break;
                case QB64v3Lexer.SINGLE:
                    addNewStaticVariable(new ArrayQB<Float>(name, Variable.Type.SINGLE, dimensions));
                    break;
                case QB64v3Lexer.DOUBLE:
                    addNewStaticVariable(new ArrayQB<Double>(name, Variable.Type.DOUBLE, dimensions));
                    break;
                case QB64v3Lexer.STRING:
                    addNewStaticVariable(new ArrayQB<String>(name, Variable.Type.STRING, dimensions));
                    break;
            }
        } else {
            switch (type) {
                case QB64v3Lexer.INTEGER:
                    addNewStaticVariable(new Variable<Short>(name, Variable.Type.INTEGER));
                    break;
                case QB64v3Lexer.LONG:
                    addNewStaticVariable(new Variable<Integer>(name, Variable.Type.LONG));
                    break;
                case QB64v3Lexer.SINGLE:
                    addNewStaticVariable(new Variable<Float>(name, Variable.Type.SINGLE));
                    break;
                case QB64v3Lexer.DOUBLE:
                    addNewStaticVariable(new Variable<Double>(name, Variable.Type.DOUBLE));
                    break;
                case QB64v3Lexer.STRING:
                    addNewStaticVariable(new Variable<String>(name, Variable.Type.STRING));
                    break;
            }
        }
    }

    private void addNewStaticVariable (Variable v) {
        if (staticMemory.contains(v)) {
            System.err.println("This variable is already created");
            System.exit(0);
        }
        staticMemory.add(v);
    }

    @Override
    public T visitArray (QB64v3Parser.ArrayContext ctx) {
        List<QB64v3Parser.ExpressionContext> expression = ctx.expression();

        List<Integer> dim = new ArrayList<>();

        //@TODO FIX THIS
        expression.forEach(expr -> dim.add(5));
        return (T) dim;
    }

    @Override
    public T visitAssignment (QB64v3Parser.AssignmentContext ctx) {
//        Variable temp = visit(ctx.id());

        return null;
    }


    @Override
    public T visitIfBlock (QB64v3Parser.IfBlockContext ctx) {

        return null;
    }


    @Override
    public T visitFunction(QB64v3Parser.FunctionContext ctx) {
        Variable functionName = (Variable) visit(ctx.singleId());
        Function f = new Function(ctx, functionName.type);
        functions.put(functionName.name, f);

        return null;
    }

    @Override
    public T visitSub(QB64v3Parser.SubContext ctx) {
        String name = ctx.ID().getText();
        Sub s = new Sub(ctx);
        subs.put(name, s);

        return null;
    }

    @Override
    public T visitId (QB64v3Parser.IdContext ctx) {
        Variable tmp = (Variable) visit(ctx.singleId());

        return null;
    }

    @Override
    public T visitSingleId(QB64v3Parser.SingleIdContext ctx) {
        String id = ctx.ID().getText();
        int suffix;
        if (ctx.suffix() != null)
            suffix = (Integer) visit(ctx.suffix());
        else
            suffix = QB64v3Lexer.SINGLESUFFIX;

        Variable.Type type;
        switch (suffix) {
            case QB64v3Lexer.SINGLESUFFIX:
                type = Variable.Type.SINGLE;
                break;
            case QB64v3Lexer.DOUBLESUFFIX:
                type = Variable.Type.DOUBLE;
                break;
            case QB64v3Lexer.INTEGERSUFFIX:
                type = Variable.Type.INTEGER;
                break;
            case QB64v3Lexer.LONGSUFFIX:
                type = Variable.Type.LONG;
                break;
            default:
                type = Variable.Type.STRING;
        }

        Variable var = new Variable(id, type);
        return (T) var;
    }

    @Override
    public T visitSuffix(QB64v3Parser.SuffixContext ctx) {
        return (T) (Integer) ctx.suffixType.getType();
    }
}
