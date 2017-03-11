package semantic;

import semantic.gen.QB64v3Parser;

import java.util.List;

/**
 * Created by milderhc on 10/03/17.
 */
public class Function {
    private QB64v3Parser.FunctionContext ctx;
    private Variable.Type returnType;

    public Function(QB64v3Parser.FunctionContext ctx, Variable.Type returnType) {
        this.ctx = ctx;
        this.returnType = returnType;
    }

    public QB64v3Parser.FunctionContext getCtx() {
        return ctx;
    }

    public void setCtx(QB64v3Parser.FunctionContext ctx) {
        this.ctx = ctx;
    }

    public Variable.Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Variable.Type returnType) {
        this.returnType = returnType;
    }
}
