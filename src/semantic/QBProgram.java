package semantic;

import org.antlr.v4.runtime.Token;
import semantic.gen.QB64v3Parser;

import java.util.*;

/**
 * Created by milderhc on 6/04/17.
 */
public class QBProgram {
    public Map<String, Sub> subs;
    public Map<String, Function> functions;

    public Stack<Map<String, Variable>> dynamicMemory, staticMemory;

    public SemanticErrorHandler errorHandler;
    private QBVisitor visitor;

    public QBProgram (QBVisitor visitor) {
        this.visitor = visitor;

        subs = new TreeMap<>();
        functions = new TreeMap<>();
        dynamicMemory = new Stack<>();
        staticMemory = new Stack<>();

        errorHandler = new SemanticErrorHandler();
        createNewScope();
    }

    public void createNewScope () {
        dynamicMemory.push(new TreeMap<>());
        staticMemory.push(new TreeMap<>());
    }

    public void deleteScope () {
        dynamicMemory.pop();
        staticMemory.pop();
    }

    public Variable getId (Variable v) {
        if (staticMemory.peek().containsKey(v.getName()))
            return staticMemory.peek().get(v.getName());

        if (!dynamicMemory.peek().containsKey(v.getName()))
            createDynamicVariable(v);

        return dynamicMemory.peek().get(v.getName());
    }

    public void createDynamicVariable(Variable v) {
        dynamicMemory.peek().put(v.getName(), v);
    }

    public void createStaticVariable(Variable v) {
        staticMemory.peek().put(v.getName(), v);
        v.addSuffix();
        createDynamicVariable(v);
    }

    public void addFunction (String name, Function f) {
        functions.put(name, f);
    }

    public void addSub (String name, Sub sub) {
        subs.put(name, sub);
    }

    public ArrayQB createArray (String arrayName, Value.Type type, List<Variable> pos, boolean shared, Token token) {
        List<Integer> dimensions = getRealPos(pos, token);
        switch (type) {
            case INTEGER:
                return new ArrayQB<Short>(arrayName, Value.Type.INTEGER, dimensions, shared);
            case LONG:
                return new ArrayQB<Integer>(arrayName, Value.Type.LONG, dimensions, shared);
            case SINGLE:
                return new ArrayQB<Float>(arrayName, Value.Type.SINGLE, dimensions, shared);
            case DOUBLE:
                return new ArrayQB<Double>(arrayName, Value.Type.DOUBLE, dimensions, shared);
            default:
                return new ArrayQB<String>(arrayName, Value.Type.STRING, dimensions, shared);
        }
    }

    public Variable createVariable (String name, Value.Type type, boolean shared) {
        switch (type) {
            case INTEGER:
                return new Variable<Short>(name, Variable.Type.INTEGER, false, shared);
            case LONG:
                return new Variable<Integer>(name, Variable.Type.LONG, false, shared);
            case SINGLE:
                return new Variable<Float>(name, Variable.Type.SINGLE, false, shared);
            case DOUBLE:
                return new Variable<Double>(name, Variable.Type.DOUBLE, false, shared);
            default:
                return new Variable<String>(name, Variable.Type.STRING, false, shared);
        }
    }

    public void createDimVariable (QB64v3Parser.DimIdContext ctx, Value.Type type, boolean shared) {
        String name = ctx.ID().getText();
        Token token = ctx.getStart();

        if (functions.containsKey(name) || subs.containsKey(name))
            errorHandler.idAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

        String suffix = Variable.getSuffix(type);

        if (ctx.array() != null) {
            String arrayName = ArrayQB.getArrayId(name);
            if (staticMemory.peek().containsKey(arrayName))
                errorHandler.arrayAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

            if (dynamicMemory.peek().containsKey(arrayName + suffix))
                errorHandler.arrayAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

            createStaticVariable(createArray(arrayName, type, (List<Variable>) visitor.visit(ctx.array()), shared, token));
        } else {
            if (staticMemory.peek().containsKey(name))
                errorHandler.idAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

            if (dynamicMemory.peek().containsKey(name + suffix))
                errorHandler.idAlreadyDeclaredError(token.getLine(), token.getCharPositionInLine(), name);

            createStaticVariable(createVariable(name, type, shared));
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

        var.setValue(Value.createValue(val, var.getType()));
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
            realPos.add(new Integer(String.valueOf(v.getValue())));
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
        return dynamicMemory.peek().containsKey(name);
    }

    public boolean containsStaticVariable (String name) {
        return staticMemory.peek().containsKey(name);
    }

    public Variable getDynamicVariable (String name) {
        return dynamicMemory.peek().get(name);
    }

    public Variable getStaticVariable (String name) {
        return staticMemory.peek().get(name);
    }

    public Variable getStaticVariable (String name, List<Variable> pos, Token token) {
        return ((ArrayQB) staticMemory.peek().get(name)).get(getRealPos(pos, token));
    }

    public Variable callFunction (Variable f, List<Variable> params) {
        return new Variable(null, Value.Type.INTEGER, 1);
    }

    public void callSub (Variable s, List<Variable> params) {

    }

    public boolean eval (Variable v, Token token) {
        if (v.getType() == Value.Type.STRING)
            errorHandler.incompatibleNumericError(token.getLine(), token.getCharPositionInLine());
        return v.doubleValue() != 0;
    }
}
