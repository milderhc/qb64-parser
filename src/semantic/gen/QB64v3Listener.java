// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v3.g4 by ANTLR 4.6
package semantic.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QB64v3Parser}.
 */
public interface QB64v3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#qb}.
	 * @param ctx the parse tree
	 */
	void enterQb(QB64v3Parser.QbContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#qb}.
	 * @param ctx the parse tree
	 */
	void exitQb(QB64v3Parser.QbContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(QB64v3Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(QB64v3Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(QB64v3Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(QB64v3Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#dimId}.
	 * @param ctx the parse tree
	 */
	void enterDimId(QB64v3Parser.DimIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#dimId}.
	 * @param ctx the parse tree
	 */
	void exitDimId(QB64v3Parser.DimIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QB64v3Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QB64v3Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#singleId}.
	 * @param ctx the parse tree
	 */
	void enterSingleId(QB64v3Parser.SingleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#singleId}.
	 * @param ctx the parse tree
	 */
	void exitSingleId(QB64v3Parser.SingleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(QB64v3Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(QB64v3Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(QB64v3Parser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(QB64v3Parser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(QB64v3Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(QB64v3Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callId}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallId(QB64v3Parser.CallIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callId}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallId(QB64v3Parser.CallIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinExpr(QB64v3Parser.BinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinExpr(QB64v3Parser.BinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(QB64v3Parser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(QB64v3Parser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(QB64v3Parser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(QB64v3Parser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(QB64v3Parser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(QB64v3Parser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callFunctionExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionExpr(QB64v3Parser.CallFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callFunctionExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionExpr(QB64v3Parser.CallFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code putValue}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPutValue(QB64v3Parser.PutValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code putValue}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPutValue(QB64v3Parser.PutValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(QB64v3Parser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(QB64v3Parser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#callSub}.
	 * @param ctx the parse tree
	 */
	void enterCallSub(QB64v3Parser.CallSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#callSub}.
	 * @param ctx the parse tree
	 */
	void exitCallSub(QB64v3Parser.CallSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(QB64v3Parser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(QB64v3Parser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuePar}
	 * labeled alternative in {@link QB64v3Parser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterValuePar(QB64v3Parser.ValueParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuePar}
	 * labeled alternative in {@link QB64v3Parser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitValuePar(QB64v3Parser.ValueParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referencePar}
	 * labeled alternative in {@link QB64v3Parser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterReferencePar(QB64v3Parser.ReferenceParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referencePar}
	 * labeled alternative in {@link QB64v3Parser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitReferencePar(QB64v3Parser.ReferenceParContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#funprocArg}.
	 * @param ctx the parse tree
	 */
	void enterFunprocArg(QB64v3Parser.FunprocArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#funprocArg}.
	 * @param ctx the parse tree
	 */
	void exitFunprocArg(QB64v3Parser.FunprocArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(QB64v3Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(QB64v3Parser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QB64v3Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QB64v3Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#printList}.
	 * @param ctx the parse tree
	 */
	void enterPrintList(QB64v3Parser.PrintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#printList}.
	 * @param ctx the parse tree
	 */
	void exitPrintList(QB64v3Parser.PrintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(QB64v3Parser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(QB64v3Parser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(QB64v3Parser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(QB64v3Parser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileBlock(QB64v3Parser.DoWhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileBlock(QB64v3Parser.DoWhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#doUntilBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoUntilBlock(QB64v3Parser.DoUntilBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#doUntilBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoUntilBlock(QB64v3Parser.DoUntilBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(QB64v3Parser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(QB64v3Parser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#selectBlock}.
	 * @param ctx the parse tree
	 */
	void enterSelectBlock(QB64v3Parser.SelectBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#selectBlock}.
	 * @param ctx the parse tree
	 */
	void exitSelectBlock(QB64v3Parser.SelectBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#casesList}.
	 * @param ctx the parse tree
	 */
	void enterCasesList(QB64v3Parser.CasesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#casesList}.
	 * @param ctx the parse tree
	 */
	void exitCasesList(QB64v3Parser.CasesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#funprocPar}.
	 * @param ctx the parse tree
	 */
	void enterFunprocPar(QB64v3Parser.FunprocParContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#funprocPar}.
	 * @param ctx the parse tree
	 */
	void exitFunprocPar(QB64v3Parser.FunprocParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void enterFunction(QB64v3Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void exitFunction(QB64v3Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void enterSub(QB64v3Parser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void exitSub(QB64v3Parser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v3Parser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffix(QB64v3Parser.SuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v3Parser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffix(QB64v3Parser.SuffixContext ctx);
}