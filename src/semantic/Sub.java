package semantic;

import semantic.gen.QB64v3Parser;

import java.util.List;

/**
 * Created by milderhc on 10/03/17.
 */
public class Sub {
    private QB64v3Parser.InstructionBlockContext ctx;
    private List<Variable> parameters;

    public Sub(QB64v3Parser.InstructionBlockContext ctx, List<Variable> parameters) {
        this.ctx = ctx;
        this.parameters = parameters;
    }

    public QB64v3Parser.InstructionBlockContext getCtx() {
        return ctx;
    }

    public List<Variable> getParameters() {
        return parameters;
    }

    public void setParameters(List<Variable> parameters) {
        this.parameters = parameters;
    }
}
