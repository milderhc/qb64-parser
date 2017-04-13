package semantic;

import org.antlr.v4.runtime.Token;
import semantic.gen.QB64v3Lexer;
import semantic.gen.QB64v3Parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by milderhc on 6/04/17.
 */
public class QBProgram {
    public Map<String, Sub> subs;
    public Map<String, Function> functions;
    public Map<String, Variable> dynamicMemory, staticMemory;

    public SemanticErrorHandler errorHandler;
    private QBVisitor visitor;

    public QBProgram (QBVisitor visitor) {
        this.visitor = visitor;

        subs = new TreeMap<>();
        functions = new TreeMap<>();
        dynamicMemory = new TreeMap<>();
        staticMemory = new TreeMap<>();

        errorHandler = new SemanticErrorHandler();
    }

    public Variable getId (Variable v) {
        if (staticMemory.containsKey(v.getName()))
            return staticMemory.get(v.getName());

        if (!dynamicMemory.containsKey(v.getName()))
            createDynamicVariable(v);

        return dynamicMemory.get(v.getName());
    }

    public void createDynamicVariable(Variable v) {
        dynamicMemory.put(v.getName(), v);
    }

    public void createStaticVariable(Variable v) {
        staticMemory.put(v.getName(), v);
    }

    public void addFunction (String name, Function f) {
        functions.put(name, f);
    }

    public void addSub (String name, Sub sub) {
        subs.put(name, sub);
    }

    public void createDimVariable (QB64v3Parser.DimIdContext ctx, int type, boolean shared) {
        String name = ctx.ID().getText();
        Token token = ctx.getStart();

        if (functions.containsKey(name) || subs.containsKey(name))
            errorHandler.idAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

        if (ctx.array() != null) {
            String arrayName = ArrayQB.getArrayId(name);
            if (staticMemory.containsKey(arrayName))
                errorHandler.arrayAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

            List<Integer> dimensions = getRealPos((List<Variable>) visitor.visit(ctx.array()), token);
            switch (type) {
                case QB64v3Lexer.INTEGER:
                    createStaticVariable(new ArrayQB<Short>(arrayName, Value.Type.INTEGER, dimensions, shared));
                    break;
                case QB64v3Lexer.LONG:
                    createStaticVariable(new ArrayQB<Integer>(arrayName, Value.Type.LONG, dimensions, shared));
                    break;
                case QB64v3Lexer.SINGLE:
                    createStaticVariable(new ArrayQB<Float>(arrayName, Value.Type.SINGLE, dimensions, shared));
                    break;
                case QB64v3Lexer.DOUBLE:
                    createStaticVariable(new ArrayQB<Double>(arrayName, Value.Type.DOUBLE, dimensions, shared));
                    break;
                case QB64v3Lexer.STRING:
                    createStaticVariable(new ArrayQB<String>(arrayName, Value.Type.STRING, dimensions, shared));
                    break;
            }
        } else {
            if (staticMemory.containsKey(name))
                errorHandler.idAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

            switch (type) {
                case QB64v3Lexer.INTEGER:
                    createStaticVariable(new Variable<Short>(name, Variable.Type.INTEGER, false, shared));
                    break;
                case QB64v3Lexer.LONG:
                    createStaticVariable(new Variable<Integer>(name, Variable.Type.LONG, false, shared));
                    break;
                case QB64v3Lexer.SINGLE:
                    createStaticVariable(new Variable<Float>(name, Variable.Type.SINGLE, false, shared));
                    break;
                case QB64v3Lexer.DOUBLE:
                    createStaticVariable(new Variable<Double>(name, Variable.Type.DOUBLE, false, shared));
                    break;
                case QB64v3Lexer.STRING:
                    createStaticVariable(new Variable<String>(name, Variable.Type.STRING, false, shared));
                    break;
            }
        }
    }

    public void assign (Variable var, Value val, Token token) {
        if (var.isConstType()) {
            errorHandler.constAssignmentError(token.getLine(), token.getCharPositionInLine(), var.getName());
        }

        if (var.getType() != Value.Type.STRING &&
                val.getType() == Value.Type.STRING)
            errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());

        if (var.getType() == Value.Type.STRING &&
                val.getType() != Value.Type.STRING)
            errorHandler.incompatibleStringError(token.getLine(), token.getCharPositionInLine(), val.getType());

        var.setValue(val);
    }

    public void createConst (Variable var, Value val, Token token) {
        assign(var, val, token);
        var.setConstType(true);
        createDynamicVariable(var);
    }

    public List<Integer> getRealPos (List<Variable> pos, Token token) {
        List<Integer> realPos = new ArrayList<>();
        for (Variable v : pos) {
            if (v.getType() != Value.Type.INTEGER && v.getType() != Value.Type.LONG)
                errorHandler.incompatibleIntegerError(token.getLine(), token.getCharPositionInLine(), v.getType());
            if (v.getType() == Value.Type.INTEGER)
                realPos.add((int)(short) v.getValue());
            else
                realPos.add((int) v.getValue());
        }
        return realPos;
    }

    public boolean containsFunction (String name) {
        return functions.containsKey(name);
    }

    public boolean containsSub (String name) {
        return subs.containsKey(name);
    }

    public boolean containsDynamicVariable (String name) {
        return dynamicMemory.containsKey(name);
    }

    public boolean containsStaticVariable (String name) {
        return staticMemory.containsKey(name);
    }

    public Variable getDynamicVariable (String name) {
        return dynamicMemory.get(name);
    }

    public Variable getStaticVariable (String name) {
        return staticMemory.get(name);
    }

    public Variable getStaticVariable (String name, List<Variable> pos, Token token) {
        return ((ArrayQB) staticMemory.get(name)).get(getRealPos(pos, token));
    }

    public Value callFunction (Variable f, List<Variable> params) {

        return null;
    }

    public void callSub (Variable s, List<Variable> params) {

    }
}
