// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v3.g4 by ANTLR 4.6
package semantic.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QB64v3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QB64v3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#qb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQb(QB64v3Parser.QbContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(QB64v3Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(QB64v3Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#dimId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimId(QB64v3Parser.DimIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QB64v3Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#singleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleId(QB64v3Parser.SingleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(QB64v3Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(QB64v3Parser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(QB64v3Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callId}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallId(QB64v3Parser.CallIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinExpr(QB64v3Parser.BinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(QB64v3Parser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(QB64v3Parser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(QB64v3Parser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFunctionExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunctionExpr(QB64v3Parser.CallFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putValue}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutValue(QB64v3Parser.PutValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link QB64v3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(QB64v3Parser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#callSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSub(QB64v3Parser.CallSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(QB64v3Parser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuePar}
	 * labeled alternative in {@link QB64v3Parser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuePar(QB64v3Parser.ValueParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referencePar}
	 * labeled alternative in {@link QB64v3Parser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencePar(QB64v3Parser.ReferenceParContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#funprocArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunprocArg(QB64v3Parser.FunprocArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(QB64v3Parser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QB64v3Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#printList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintList(QB64v3Parser.PrintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(QB64v3Parser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(QB64v3Parser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#doWhileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileBlock(QB64v3Parser.DoWhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#doUntilBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoUntilBlock(QB64v3Parser.DoUntilBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(QB64v3Parser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#selectBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectBlock(QB64v3Parser.SelectBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#casesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasesList(QB64v3Parser.CasesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#funprocPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunprocPar(QB64v3Parser.FunprocParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QB64v3Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link QB64v3Parser#funproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(QB64v3Parser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QB64v3Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v3Parser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffix(QB64v3Parser.SuffixContext ctx);
}