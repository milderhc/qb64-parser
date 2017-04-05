package semantic;

import semantic.gen.QB64v3BaseVisitor;
import semantic.gen.QB64v3Lexer;
import semantic.gen.QB64v3Parser;
import java.util.*;

/**
 * Created by milderhc on 10/03/17.
 */
public class QBVisitor<T> extends QB64v3BaseVisitor<T> {

    public Map<String, Sub> subs;
    public Map<String, Function> functions;
    public Map<String, Variable> dynamicMemory, staticMemory;

    private SemanticErrorHandler errorHandler;

    public QBVisitor() {
        subs = new TreeMap<>();
        functions = new TreeMap<>();
        dynamicMemory = new TreeMap<>();
        staticMemory = new TreeMap<>();

        errorHandler = new SemanticErrorHandler();
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

    @Override
    public T visitConstDeclaration (QB64v3Parser.ConstDeclarationContext ctx) {

        return null;
    }



    @Override
    public T visitArray (QB64v3Parser.ArrayContext ctx) {
        List<QB64v3Parser.ExpressionContext> expressions = ctx.expression();
        List<Integer> dim = new ArrayList<>();
        expressions.forEach(expr -> {
            semantic.Value value = (Value) visit(expr);
            if (value.getType() == Value.Type.STRING) {
                errorHandler.error("Se esparaba valor numerico, se encontro string");
            }
            if (value.getValue() instanceof Integer)
                dim.add((Integer)value.getValue());
            else
                dim.add((int)(double)value.getValue());
        });
        return (T) dim;
    }

    @Override
    public T visitMulExpr (QB64v3Parser.MulExprContext ctx) {

        return null;
    }
    @Override
    public T visitAddExpr (QB64v3Parser.AddExprContext ctx) {
        return null;
    }
    @Override
    public T visitUnaryExpr (QB64v3Parser.UnaryExprContext ctx) {
        return null;
    }
    @Override
    public T visitParenExpr (QB64v3Parser.ParenExprContext ctx) {
        return null;
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
    public T visitId (QB64v3Parser.IdContext ctx) {
        Variable v = (Variable) visit(ctx.singleId());
        if (ctx.array() != null) {
            List<Integer> dimensions = (List<Integer>) visit(ctx.array());
            v.setName(ArrayQB.getArrayId(v.getName()));
            if (staticMemory.containsKey(v.getName())) {
                return (T) staticMemory.get(v.getName());
            }
            v.addSuffix();
            v.setName(v.getName() + ArrayQB.posAlias(dimensions));

            if (!dynamicMemory.containsKey(v.name))
                createDynamicVariable(v);
            return (T) dynamicMemory.get(v.getName());
        } else {
            if (staticMemory.containsKey(v.getName())) {
                return (T) staticMemory.get(v.getName());
            }
            v.addSuffix();
            if (!dynamicMemory.containsKey(v.name))
                createDynamicVariable(v);
            return (T) dynamicMemory.get(v.getName());
        }
    }

    private void createDynamicVariable(Variable v) {
        dynamicMemory.put(v.getName(), v);
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

    private void createDimVariable (QB64v3Parser.DimIdContext ctx, int type) {
        String name = ctx.ID().getText();

        if (ctx.array() != null) {
            name = ArrayQB.getArrayId(name);
            List<Integer> dimensions = (List<Integer>) visit(ctx.array());
            switch (type) {
                case QB64v3Lexer.INTEGER:
                    addNewStaticVariable(new ArrayQB<Short>(name, Value.Type.INTEGER, dimensions));
                    break;
                case QB64v3Lexer.LONG:
                    addNewStaticVariable(new ArrayQB<Integer>(name, Value.Type.LONG, dimensions));
                    break;
                case QB64v3Lexer.SINGLE:
                    addNewStaticVariable(new ArrayQB<Float>(name, Value.Type.SINGLE, dimensions));
                    break;
                case QB64v3Lexer.DOUBLE:
                    addNewStaticVariable(new ArrayQB<Double>(name, Value.Type.DOUBLE, dimensions));
                    break;
                case QB64v3Lexer.STRING:
                    addNewStaticVariable(new ArrayQB<String>(name, Value.Type.STRING, dimensions));
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
        if (staticMemory.containsKey(v.getName())) {
            errorHandler.error("La variable " + v.getName() + " ya ha sido declarada");
        }
        staticMemory.put(v.getName(), v);
    }
}
