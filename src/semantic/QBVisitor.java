package semantic;

import org.antlr.v4.runtime.Token;
import semantic.gen.QB64v3BaseVisitor;
import semantic.gen.QB64v3Lexer;
import semantic.gen.QB64v3Parser;
import java.util.*;

/**
 * Created by milderhc on 10/03/17.
 */
public class QBVisitor<T> extends QB64v3BaseVisitor<T> {

    public QBProgram program;

    public QBVisitor() {
        program = new QBProgram(this);
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
            program.createDimVariable(dimIdContext, ctx.type.getType(), ctx.SHARED() != null);
        });

        return null;
    }

    @Override
    public T visitConstDeclaration (QB64v3Parser.ConstDeclarationContext ctx) {
        List<QB64v3Parser.SingleIdContext> singleIdContexts = ctx.singleId();
        List<QB64v3Parser.ExpressionContext> expressions = ctx.expression();
        for (int i = 0; i < singleIdContexts.size(); ++i)
            program.createConst((Variable) visit(singleIdContexts.get(i)),
                    (Value) visit(expressions.get(i)), expressions.get(i).getStart());

        return null;
    }

    @Override
    public T visitAssignment (QB64v3Parser.AssignmentContext ctx) {
        Variable var = (Variable) visit(ctx.id());
        Value val = (Value) visit(ctx.expression());
        program.assign(var, val, ctx.expression().getStart());

        return null;
    }

    @Override
    public T visitArray (QB64v3Parser.ArrayContext ctx) {
        List<QB64v3Parser.ExpressionContext> expressions = ctx.expression();
        List<Integer> dim = new ArrayList<>();
        expressions.forEach(expr -> {
            semantic.Value value = (Value) visit(expr);
            if (value.getType() != Value.Type.INTEGER &&
                    value.getType() != Value.Type.LONG) {

                final Token start = expr.getStart();
                program.errorHandler.incompatibleIntegerError(start.getLine(), start.getCharPositionInLine(), value.getType());
            }

            dim.add((Integer)value.getValue());
        });
        return (T) dim;
    }


    /* Expressions */
    @Override
    public T visitOrExpr (QB64v3Parser.OrExprContext ctx) {
        int op = ctx.op.getType();

        Value left = (Value) visit(ctx.expression(0));
        Value right = (Value) visit(ctx.expression(1));

        if (left.getType() == Value.Type.STRING) {
            Token token = ctx.expression(0).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }
        if (right.getType() == Value.Type.STRING) {
            Token token = ctx.expression(1).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        if (op == QB64v3Lexer.OR)
            return (T) new Value(left.intValue() | right.intValue(), Value.Type.INTEGER);
        return (T) new Value(left.intValue() ^ right.intValue(), Value.Type.INTEGER);
    }


    @Override
    public T visitAndExpr (QB64v3Parser.AndExprContext ctx) {
        Value left = (Value) visit(ctx.expression(0));
        Value right = (Value) visit(ctx.expression(1));

        if (left.getType() == Value.Type.STRING) {
            Token token = ctx.expression(0).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }
        if (right.getType() == Value.Type.STRING) {
            Token token = ctx.expression(1).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        return (T) new Value(left.intValue() & right.intValue(), Value.Type.INTEGER);
    }



    @Override
    public T visitValueExpr (QB64v3Parser.ValueExprContext ctx) {
        int type = ctx.value.getType();

        //TODO create proper values
        switch (type) {
            case QB64v3Lexer.INTEGERV:
                return (T) new Value(Integer.parseInt(ctx.value.getText()), Value.Type.LONG);
            case QB64v3Lexer.DOUBLEV:
                return (T) new Value(Double.parseDouble(ctx.value.getText()), Value.Type.DOUBLE);
            default:
                return (T) new Value(ctx.value.getText(), Value.Type.STRING);
        }
    }



    @Override
    public T visitIfBlock (QB64v3Parser.IfBlockContext ctx) {

        return null;
    }

    @Override
    public T visitId (QB64v3Parser.IdContext ctx) {
//        Variable v = (Variable) visit(ctx.singleId());
//        if (ctx.array() != null) {
//            List<Integer> dimensions = (List<Integer>) visit(ctx.array());
//            v.setName(ArrayQB.getArrayId(v.getName()));
//            if (staticMemory.containsKey(v.getName())) {
//                return (T) staticMemory.get(v.getName());
//            }
//
//            v.addSuffix();
//            v.setName(v.getName() + ArrayQB.posAlias(dimensions));
//
//            if (!dynamicMemory.containsKey(v.name))
//                createDynamicVariable(v);
//        } else {
//            if (staticMemory.containsKey(v.getName())) {
//                return (T) staticMemory.get(v.getName());
//            }
//
//            v.addSuffix();
//            if (!dynamicMemory.containsKey(v.name))
//                createDynamicVariable(v);
//        }
//
//        return (T) dynamicMemory.get(v.getName());

        return  null;
    }



    @Override
    public T visitFunction(QB64v3Parser.FunctionContext ctx) {
        Variable functionName = (Variable) visit(ctx.singleId());
        Function f = new Function(ctx, functionName.type);
        program.addFunction(functionName.name, f);

        return null;
    }

    @Override
    public T visitSub(QB64v3Parser.SubContext ctx) {
        String name = ctx.ID().getText();
        Sub s = new Sub(ctx);
        program.addSub(name, s);

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

        Variable v = new Variable(id, type);
        return (T) v;
    }

    @Override
    public T visitSuffix(QB64v3Parser.SuffixContext ctx) {
        return (T) (Integer) ctx.suffixType.getType();
    }

    @Override
    public T visitPrint (QB64v3Parser.PrintContext ctx) {
        List<QB64v3Parser.ExpressionContext> expression = ctx.expression();
        expression.forEach(expressionContext -> {
            System.out.println(visit(expressionContext));
        });

        return null;
    }
}
