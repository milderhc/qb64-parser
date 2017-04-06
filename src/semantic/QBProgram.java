package semantic;

import org.antlr.v4.runtime.Token;
import semantic.gen.QB64v3Lexer;
import semantic.gen.QB64v3Parser;

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

    public void createStaticVariable(Variable v, Token token) {
        if (staticMemory.containsKey(v.getName())) {
            errorHandler.error(token.getLine(), token.getCharPositionInLine(),  v.getName() + " ya ha sido declarado");
        }
        staticMemory.put(v.getName(), v);
    }

    public void addFunction (String name, Function f) {
        functions.put(name, f);
    }

    public void addSub (String name, Sub sub) {
        subs.put(name, sub);
    }

    public void createDimVariable (QB64v3Parser.DimIdContext ctx, int type) {
        String name = ctx.ID().getText();

        if (ctx.array() != null) {
            name = ArrayQB.getArrayId(name);
            List<Integer> dimensions = (List<Integer>) visitor.visit(ctx.array());
            switch (type) {
                case QB64v3Lexer.INTEGER:
                    createStaticVariable(new ArrayQB<Short>(name, Value.Type.INTEGER, dimensions), ctx.getStart());
                    break;
                case QB64v3Lexer.LONG:
                    createStaticVariable(new ArrayQB<Integer>(name, Value.Type.LONG, dimensions), ctx.getStart());
                    break;
                case QB64v3Lexer.SINGLE:
                    createStaticVariable(new ArrayQB<Float>(name, Value.Type.SINGLE, dimensions), ctx.getStart());
                    break;
                case QB64v3Lexer.DOUBLE:
                    createStaticVariable(new ArrayQB<Double>(name, Value.Type.DOUBLE, dimensions), ctx.getStart());
                    break;
                case QB64v3Lexer.STRING:
                    createStaticVariable(new ArrayQB<String>(name, Value.Type.STRING, dimensions), ctx.getStart());
                    break;
            }
        } else {
            switch (type) {
                case QB64v3Lexer.INTEGER:
                    createStaticVariable(new Variable<Short>(name, Variable.Type.INTEGER), ctx.getStart());
                    break;
                case QB64v3Lexer.LONG:
                    createStaticVariable(new Variable<Integer>(name, Variable.Type.LONG), ctx.getStart());
                    break;
                case QB64v3Lexer.SINGLE:
                    createStaticVariable(new Variable<Float>(name, Variable.Type.SINGLE), ctx.getStart());
                    break;
                case QB64v3Lexer.DOUBLE:
                    createStaticVariable(new Variable<Double>(name, Variable.Type.DOUBLE), ctx.getStart());
                    break;
                case QB64v3Lexer.STRING:
                    createStaticVariable(new Variable<String>(name, Variable.Type.STRING), ctx.getStart());
                    break;
            }
        }
    }

    public void createConst (Variable v) {
        v.setConstType(true);
        createDynamicVariable(v);
    }
}
