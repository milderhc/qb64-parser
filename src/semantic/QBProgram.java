package semantic;

import org.antlr.v4.runtime.Token;
import semantic.gen.QB64v3Lexer;
import semantic.gen.QB64v3Parser;

import java.util.*;

/**
 * Created by milderhc on 6/04/17.
 */
public class QBProgram {
    public Map<String, Sub> subs;
    public Map<String, Function> functions;

    public Stack<Map<String, Variable>> dynamicMemory, staticMemory;
    public Stack<List<String>> dynamicMemoryIds, staticMemoryIds;

    public SemanticErrorHandler errorHandler;
    private QBVisitor visitor;

    public QBProgram (QBVisitor visitor) {
        this.visitor = visitor;

        subs = new TreeMap<>();
        functions = new TreeMap<>();
        dynamicMemory = new Stack<>();
        staticMemory = new Stack<>();
        dynamicMemoryIds = new Stack<>();
        staticMemoryIds = new Stack<>();

        errorHandler = new SemanticErrorHandler();
        createNewScope();
    }

    public void createNewScope () {
        dynamicMemory.push(new TreeMap<>());
        staticMemory.push(new TreeMap<>());
        addNewScope();
    }

    public void addNewScope () {
        dynamicMemoryIds.push(new LinkedList<>());
        staticMemoryIds.push(new LinkedList<>());
    }

    public void deleteScope () {
        dynamicMemory.pop();
        staticMemory.pop();
        System.out.println("aslkdjfaklsdfj");
        eraseScope();
    }

    public void eraseScope () {
        for (String id : dynamicMemoryIds.peek())
            dynamicMemory.peek().remove(id);
        for (String id : staticMemoryIds.peek())
            staticMemory.peek().remove(id);

        dynamicMemoryIds.pop();
        staticMemoryIds.pop();
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
        dynamicMemoryIds.peek().add(v.getName());
    }

    public void createStaticVariable(Variable v) {
        staticMemory.peek().put(v.getName(), v);
        staticMemoryIds.peek().add(v.getName());
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
            if (staticMemory.peek().containsKey(arrayName))
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
            if (staticMemory.peek().containsKey(name))
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
