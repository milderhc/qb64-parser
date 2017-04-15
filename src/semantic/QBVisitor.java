package semantic;

import org.antlr.v4.runtime.Token;
import semantic.gen.QB64v3BaseVisitor;
import semantic.gen.QB64v3Lexer;
import semantic.gen.QB64v3Parser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        QB64v3Parser.InstructionBlockContext instructionBlockContext = ctx.instructionBlock();
        List<QB64v3Parser.FunprocContext> funproc = ctx.funproc();

        for (QB64v3Parser.FunprocContext f : funproc)
            visit(f);

        visit(instructionBlockContext);

        return null;
    }

    private Value.Type getType (int type) {
        switch (type) {
            case QB64v3Lexer.INTEGER:
                return Value.Type.INTEGER;
            case QB64v3Lexer.LONG:
                return Value.Type.LONG;
            case QB64v3Lexer.SINGLE:
                return Value.Type.SINGLE;
            case QB64v3Lexer.DOUBLE:
                return Value.Type.DOUBLE;
            default:
                return Value.Type.STRING;
        }
    }

    @Override
    public T visitDeclaration (QB64v3Parser.DeclarationContext ctx) {
        List<QB64v3Parser.DimIdContext> dimIdContexts = ctx.dimId();
        dimIdContexts.forEach(dimIdContext -> {
            program.createDimVariable(dimIdContext, getType(ctx.type.getType()), ctx.SHARED() != null);
        });

        return null;
    }

    @Override
    public T visitConstDeclaration (QB64v3Parser.ConstDeclarationContext ctx) {
        List<QB64v3Parser.SingleIdContext> singleIdContexts = ctx.singleId();
        List<QB64v3Parser.ExpressionContext> expressions = ctx.expression();
        for (int i = 0; i < singleIdContexts.size(); ++i)
            program.createConst((Variable) visit(singleIdContexts.get(i)),
                    (Variable) visit(expressions.get(i)), expressions.get(i).getStart());

        return null;
    }

    @Override
    public T visitAssignment (QB64v3Parser.AssignmentContext ctx) {
        Variable var = (Variable) visit(ctx.id());
        Variable val = (Variable) visit(ctx.expression());
        program.assign(var, val, ctx.expression().getStart());

        return (T) var;
    }

    @Override
    public T visitArray (QB64v3Parser.ArrayContext ctx) {
        List<QB64v3Parser.ExpressionContext> expressions = ctx.expression();
        List<Variable> dim = new ArrayList<>();
        expressions.forEach(expr -> {
            dim.add((Variable) visit(expr));
        });
        return (T) dim;
    }

    @Override
    public T visitCallSub (QB64v3Parser.CallSubContext ctx) {
        String name = ctx.ID().getText();
        if (!program.containsSub(name)) {
            Token token = ctx.getStart();
            program.errorHandler.subNotDeclared(token.getLine(), token.getCharPositionInLine(), name);
        }

        Token token = ctx.getStart();
        Sub sub = program.getSub(name);
        List<Variable> parameters = sub.getParameters();
        List<QB64v3Parser.ArgExpressionContext> argExpressionContexts = ctx.argExpression();
        if (parameters.size() != argExpressionContexts.size())
            program.errorHandler.incorrectNumberOfParametersSub(token.getLine(), token.getCharPositionInLine(), name);

        for (int i = 0; i < parameters.size(); ++i) {
            Variable arg = (Variable) visit(argExpressionContexts.get(i));
            program.assign(parameters.get(i), arg, argExpressionContexts.get(i).getStart());
        }

        program.callSub(name);
        return null;
    }

    @Override
    public T visitArgArr (QB64v3Parser.ArgArrContext ctx) {
        String name = ArrayQB.getArrayId(ctx.ID().getText());
        if (program.containsStaticVariable(name)) {
            return (T) program.getStaticVariable(name);
        }

        Token token = ctx.getStart();
        program.errorHandler.arrayNotDeclared(token.getLine(), token.getCharPositionInLine(), ctx.ID().getText());
        return null;
    }

    @Override
    public T visitParenArgExpr (QB64v3Parser.ParenArgExprContext ctx) {
        return visit(ctx.argExpression());
    }


    /* Expressions */
    @Override
    public T visitValueExpr (QB64v3Parser.ValueExprContext ctx) {
        int type = ctx.value.getType();

        switch (type) {
            case QB64v3Lexer.INTEGERV:
                return (T) new Variable<>(null, Variable.Type.INTEGER, Short.parseShort(ctx.value.getText()));
            case QB64v3Lexer.LONGV:
                return (T) new Variable<>(null, Variable.Type.LONG, Integer.parseInt(ctx.value.getText()));
            case QB64v3Lexer.SINGLEV:
                return (T) new Variable<>(null, Variable.Type.SINGLE, Float.parseFloat(ctx.value.getText()));
            case QB64v3Lexer.DOUBLEV:
                return (T) new Variable<>(null, Variable.Type.DOUBLE, Double.parseDouble(ctx.value.getText()));
            default:
                return (T) new Variable<>(null, Variable.Type.STRING, ctx.value.getText());
        }
    }

    @Override
    public T visitId (QB64v3Parser.IdContext ctx) {
        Variable v = (Variable) visit(ctx.singleId());
        Token token = ctx.getStart();

        if (ctx.array() != null) {
            String arrayName = ArrayQB.getArrayId(v.getName());
            List<Variable> pos = (List<Variable>) visit(ctx.array());

            if (!v.isDynamic()) {
                if (program.containsStaticVariable(arrayName))
                    return (T) program.getStaticVariable(arrayName, pos, token);
            }

            v = program.createArray(arrayName, v.getType(), pos, false, token);
            v.addSuffix();
            if (!program.containsDynamicVariable(v.getName())) {
                if (program.containsFunction(v.getProperName()) ||
                        program.containsSub(v.getProperName()))
                    program.errorHandler.idAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), v.getProperName());

                program.createDynamicVariable(v);
            }

            return (T) program.getStaticVariable(arrayName, pos, token);
        } else {
            if (!v.isDynamic()) {
                if (program.containsStaticVariable(v.getName()))
                    return (T) program.getStaticVariable(v.getName());
            }

            v.addSuffix();
            if (!program.containsDynamicVariable(v.getName())) {
                if (program.containsFunction(v.getProperName()) ||
                        program.containsSub(v.getProperName()))
                    program.errorHandler.idAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), v.getProperName());

                program.createDynamicVariable(v);
            }

            return (T) program.getDynamicVariable(v.getName());
        }
    }

    @Override
    public T visitCallId (QB64v3Parser.CallIdContext ctx) {
        Variable v = (Variable) visit(ctx.singleId());
        Token token = ctx.getStart();

        if (ctx.argArray() != null) {
            String arrayName = ArrayQB.getArrayId(v.getName());
            List<Variable> pos = (List<Variable>) visit(ctx.argArray());

            if (!v.isDynamic()) {
                if (program.containsSub(v.getName()))
                    program.errorHandler.callingSub(token.getLine(), token.getCharPositionInLine(), v.getName());

                if (program.containsStaticVariable(arrayName))
                    return (T) program.getStaticVariable(arrayName, pos, token);
            }

            if (program.containsFunction(v.getProperName()))
                return (T) program.callFunction(v, pos);

            v = program.createArray(arrayName, v.getType(), pos, false, token);
            v.addSuffix();
            if (!program.containsDynamicVariable(v.getName()))
                program.createDynamicVariable(v);

            return (T) program.getStaticVariable(arrayName, pos, token);
        } else {
            if (!v.isDynamic()) {
                if (program.containsSub(v.getName()))
                    program.errorHandler.callingSub(token.getLine(), token.getCharPositionInLine(), v.getName());

                if (program.containsStaticVariable(v.getName()))
                    return (T) program.getStaticVariable(v.getName());
            }

            if (program.containsFunction(v.getProperName()))
                return (T) program.callFunction(v, null);

            v.addSuffix();
            if (!program.containsDynamicVariable(v.getName()))
                program.createDynamicVariable(v);

            return (T) program.getDynamicVariable(v.getName());
        }
    }

    @Override
    public T visitParenExpr (QB64v3Parser.ParenExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public T visitUnaryExpr (QB64v3Parser.UnaryExprContext ctx) {
        Variable expr = (Variable) visit(ctx.expression());

        if (expr.getType() == Variable.Type.STRING) {
            Token token = ctx.expression().getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        if (ctx.op.getType() == QB64v3Lexer.NOT)
            return (T) Variable.createValue(~expr.intValue(), expr.intType());

        return (T) Variable.createValue(-expr.intValue(), expr.getType());
    }

    @Override
    public T visitPotExpr (QB64v3Parser.PotExprContext ctx) {
        Variable left = (Variable) visit(ctx.expression(0));
        Variable right = (Variable) visit(ctx.expression(1));

        if (left.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(0).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }
        if (right.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(1).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        return (T) Variable.createValue(Math.pow(left.doubleValue(), right.doubleValue()),
                Variable.getType(left.getType(), right.getType()));
    }

    @Override
    public T visitMulExpr (QB64v3Parser.MulExprContext ctx) {
        Variable left = (Variable) visit(ctx.expression(0));
        Variable right = (Variable) visit(ctx.expression(1));

        if (left.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(0).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }
        if (right.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(1).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }
        if (ctx.op.getType() == QB64v3Lexer.MOD) {
            if (left.getType() != Variable.Type.INTEGER && left.getType() != Variable.Type.LONG) {
                Token token = ctx.expression(0).getStart();
                program.errorHandler.incompatibleIntegerError(token.getLine(), token.getCharPositionInLine(), left.getType());
            }
            if (right.getType() != Variable.Type.INTEGER && right.getType() != Variable.Type.LONG) {
                Token token = ctx.expression(1).getStart();
                program.errorHandler.incompatibleIntegerError(token.getLine(), token.getCharPositionInLine(), right.getType());
            }

            return (T) Variable.createValue(left.intValue() % right.intValue(),
                    Variable.getType(left.getType(), right.getType()));
        }

        if (ctx.op.getType() == QB64v3Lexer.DIV)
            return (T) Variable.createValue(left.doubleValue() / right.doubleValue(),
                    Variable.getType(left.getType(), right.getType()));
        return (T) Variable.createValue(left.doubleValue() * right.doubleValue(),
                Variable.getType(left.getType(), right.getType()));
    }

    @Override
    public T visitAddExpr (QB64v3Parser.AddExprContext ctx) {
        Variable left = (Variable) visit(ctx.expression(0));
        Variable right = (Variable) visit(ctx.expression(1));

        if (left.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(0).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }
        if (right.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(1).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        if (ctx.op.getType() == QB64v3Lexer.ADD)
            return (T) Variable.createValue(left.doubleValue() + right.doubleValue(),
                    Variable.getType(left.getType(), right.getType()));
        return (T) Variable.createValue(left.doubleValue() - right.doubleValue(),
                Variable.getType(left.getType(), right.getType()));
    }

    @Override
    public T visitCmpExpr (QB64v3Parser.CmpExprContext ctx) {
        Variable left = (Variable) visit(ctx.expression(0));
        Variable right = (Variable) visit(ctx.expression(1));

        if (left.getType() == Variable.Type.STRING) {
            if (right.getType() != Variable.Type.STRING) {
                Token token = ctx.expression(1).getStart();
                program.errorHandler.incompatibleStringError(token.getLine(), token.getCharPositionInLine(), right.getType());
            }

            String l = (String) left.getValue();
            String r = (String) right.getValue();

            int cmp = l.compareTo(r);
            if (ctx.op.getType() == QB64v3Lexer.LESS) return (T) Variable.createValue(cmp < 0);
            if (ctx.op.getType() == QB64v3Lexer.LESSOREQUAL) return (T) Variable.createValue(cmp <= 0);
            if (ctx.op.getType() == QB64v3Lexer.GREATER) return (T) Variable.createValue(cmp > 0);
            return (T) Variable.createValue(cmp >= 0);
        }

        if (right.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(1).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        double cmp = left.doubleValue() - right.doubleValue();

        if (ctx.op.getType() == QB64v3Lexer.LESS) return (T) Variable.createValue(cmp < 0);
        if (ctx.op.getType() == QB64v3Lexer.LESSOREQUAL) return (T) Variable.createValue(cmp <= 0);
        if (ctx.op.getType() == QB64v3Lexer.GREATER) return (T) Variable.createValue(cmp > 0);
        return (T) Variable.createValue(cmp >= 0);
    }

    @Override
    public T visitEqExpr (QB64v3Parser.EqExprContext ctx) {
        Variable left = (Variable) visit(ctx.expression(0));
        Variable right = (Variable) visit(ctx.expression(1));

        if (left.getType() == Variable.Type.STRING) {
            if (right.getType() != Variable.Type.STRING) {
                Token token = ctx.expression(1).getStart();
                program.errorHandler.incompatibleStringError(token.getLine(), token.getCharPositionInLine(), right.getType());
            }

            String l = (String) left.getValue();
            String r = (String) right.getValue();

            boolean cmp = l.equals(r);
            if (ctx.op.getType() == QB64v3Lexer.EQUAL) return (T) Variable.createValue(cmp);
            return (T) Variable.createValue(!cmp);
        }

        if (right.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(1).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        double cmp = left.doubleValue() - right.doubleValue();

        if (ctx.op.getType() == QB64v3Lexer.EQUAL) return (T) Variable.createValue(cmp == 0);
        return (T) Variable.createValue(cmp != 0);
    }

    @Override
    public T visitAndExpr (QB64v3Parser.AndExprContext ctx) {
        Variable left = (Variable) visit(ctx.expression(0));
        Variable right = (Variable) visit(ctx.expression(1));

        if (left.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(0).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }
        if (right.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(1).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        return (T) Variable.createValue(left.intValue() & right.intValue(),
                Variable.getType(left.intType(), right.intType()));
    }

    @Override
    public T visitOrExpr (QB64v3Parser.OrExprContext ctx) {
        Variable left = (Variable) visit(ctx.expression(0));
        Variable right = (Variable) visit(ctx.expression(1));

        if (left.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(0).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }
        if (right.getType() == Variable.Type.STRING) {
            Token token = ctx.expression(1).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        if (ctx.op.getType() == QB64v3Lexer.OR)
            return (T) Variable.createValue(left.intValue() | right.intValue(),
                    Variable.getType(left.intType(), right.intType()));
        return (T) Variable.createValue(left.intValue() ^ right.intValue(),
                Variable.getType(left.intType(), right.intType()));
    }


    @Override
    public T visitIfBlock (QB64v3Parser.IfBlockContext ctx) {
        List<QB64v3Parser.ExpressionContext> expression = ctx.expression();
        List<QB64v3Parser.InstructionBlockContext> instructionBlockContexts = ctx.instructionBlock();

        boolean ifExecuted = false;
        for (int i = 0; i < expression.size(); ++i) {
            Variable v = (Variable) visit(expression.get(i));
            if (program.eval(v, expression.get(i).getStart())) {
                visit(instructionBlockContexts.get(i));

                ifExecuted = true;
                break;
            }
        }

        if (!ifExecuted && instructionBlockContexts.size() > expression.size()) {
            visit(instructionBlockContexts.get(expression.size()));
        }

        return null;
    }

    @Override
    public T visitWhileBlock (QB64v3Parser.WhileBlockContext ctx) {
        while (program.eval((Variable) visit(ctx.expression()), ctx.expression().getStart())) {
            visit(ctx.instructionBlock());
        }

        return null;
    }

    @Override
    public T visitDoWhileBlock (QB64v3Parser.DoWhileBlockContext ctx) {
        do {
            visit(ctx.instructionBlock());
        } while (program.eval((Variable) visit(ctx.expression()), ctx.expression().getStart()));

        return null;
    }

    @Override
    public T visitDoUntilBlock (QB64v3Parser.DoUntilBlockContext ctx) {
        do {
            visit(ctx.instructionBlock());
        } while (!program.eval((Variable) visit(ctx.expression()), ctx.expression().getStart()));

        return null;
    }

    @Override
    public T visitForBlock (QB64v3Parser.ForBlockContext ctx) {
        Variable from = (Variable) visit(ctx.assignment());
        Variable to = (Variable) visit(ctx.expression(0));
        Variable step = (ctx.expression().size() > 1 ?
                (Variable) visit(ctx.expression(1)) :
                new Variable("step", Value.Type.INTEGER, new Short("1")));


        if (to.getType() == Value.Type.STRING) {
            Token token = ctx.expression(0).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        if (step.getType() == Value.Type.STRING) {
            Token token = ctx.expression(1).getStart();
            program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        }

        double diff = from.doubleValue() - to.doubleValue();
        if (diff <= 0) {
            while (diff <= 0) {
                visit(ctx.instructionBlock());

                program.assign(from, Value.createValue(from.doubleValue() + step.doubleValue(), from.getType()), null);
                diff = from.doubleValue() - to.doubleValue();
            }
        } else {
            while (diff >= 0) {
                visit(ctx.instructionBlock());

                program.assign(from, Value.createValue(from.doubleValue() + step.doubleValue(), from.getType()), null);
                diff = from.doubleValue() - to.doubleValue();
            }
        }

        return null;
    }


    @Override
    public T visitSelectBlock (QB64v3Parser.SelectBlockContext ctx) {
        Variable v = (Variable) visit(ctx.callId());

        List<QB64v3Parser.ExpressionContext> expression = ctx.expression();
        List<QB64v3Parser.InstructionBlockContext> instructionBlockContexts = ctx.instructionBlock();

        boolean caseExecuted = false;
        for (int i = 0; i < expression.size(); ++i) {
            Variable expr = (Variable) visit(expression.get(i));
            Token token = expression.get(i).getStart();

            double cmp;
            if (v.getType() != Value.Type.STRING) {
                if (expr.getType() == Value.Type.STRING)
                    program.errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
                cmp = v.doubleValue() - expr.doubleValue();
            } else {
                if (expr.getType() != Value.Type.STRING)
                    program.errorHandler.incompatibleStringError(token.getLine(), token.getCharPositionInLine(), expr.getType());
                cmp = ((String) v.getValue()).compareTo((String) expr.getValue());
            }

            if (cmp == 0) {
                visit(instructionBlockContexts.get(i));

                caseExecuted = true;
                break;
            }
        }

        if (!caseExecuted && instructionBlockContexts.size() > expression.size()) {
            visit(instructionBlockContexts.get(expression.size()));
        }

        return null;
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
        List<QB64v3Parser.FunprocParContext> funprocParContexts = ctx.funprocPar();
        List<Variable> parameters = new LinkedList<>();
        funprocParContexts.forEach(par -> {
            Variable currentPar = (Variable) visit(par);
            if (!(currentPar instanceof ArrayQB))
                currentPar.addSuffix();
            parameters.add(currentPar);
        });

        Sub s = new Sub(ctx.instructionBlock(), parameters);
        program.addSub(name, s);

        return null;
    }

    @Override
    public T visitArrayPar (QB64v3Parser.ArrayParContext ctx) {
        String name = ctx.ID().getText();
        Value.Type type = getType(ctx.type.getType());
        ArrayQB arr = program.createArray(name, type, new LinkedList<>(), false, null);
        return (T) arr;
    }



    @Override
    public T visitSingleId(QB64v3Parser.SingleIdContext ctx) {
        String id = ctx.ID().getText();
        int suffix;
        boolean dynamic = false;
        if (ctx.suffix() != null) {
            suffix = (Integer) visit(ctx.suffix());
            dynamic = true;
        } else
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

        Variable v = Value.createValue(null, type);
        v.setName(id);
        v.setProperName(id);
        if (dynamic)
            v.setDynamic(true);
        return (T) v;
    }

    @Override
    public T visitSuffix(QB64v3Parser.SuffixContext ctx) {
        return (T) (Integer) ctx.suffixType.getType();
    }

    @Override
    public T visitPrint (QB64v3Parser.PrintContext ctx) {
        List<QB64v3Parser.ExpressionContext> expression = ctx.expression();

        for (int i = 0; i < expression.size(); ++i) {
            Variable v = (Variable) visit(expression.get(i));
            if (i > 0) System.out.print(" ");
            switch (v.getType()) {
                case INTEGER:
                case LONG:
                    System.out.print(v.getValue());
                    break;
                case SINGLE:
                    System.out.printf("%.6f", new Float(String.valueOf(v.getValue())));
                    break;
                case DOUBLE:
                    System.out.printf("%.15f", new Double(String.valueOf(v.getValue())));
                    break;
                default:
                    System.out.print(new String(String.valueOf(v.getValue())).replaceAll("\"", ""));
            }
        }
        System.out.println();

        return null;
    }
}
