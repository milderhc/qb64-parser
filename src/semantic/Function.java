package semantic;

import semantic.gen.QB64v3Parser;

import java.util.List;

/**
 * Created by milderhc on 10/03/17.
 */
public class Function {
    private QB64v3Parser.InstructionBlockContext ctx;
    private Variable.Type returnType;
    private List<Variable> parameters;

    public Function(QB64v3Parser.InstructionBlockContext ctx, List<Variable> parameters, Variable.Type returnType) {
        this.ctx = ctx;
        this.parameters = parameters;
        this.returnType = returnType;
    }

    public QB64v3Parser.InstructionBlockContext getCtx() {
        return ctx;
    }

    public void setCtx(QB64v3Parser.InstructionBlockContext ctx) {
        this.ctx = ctx;
    }

    public List<Variable> getParameters() {
        return parameters;
    }

    public void setParameters(List<Variable> parameters) {
        this.parameters = parameters;
    }

    public Variable.Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Variable.Type returnType) {
        this.returnType = returnType;
    }
}
