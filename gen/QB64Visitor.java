// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QB64Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QB64Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QB64Parser#qb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQb(QB64Parser.QbContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(QB64Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#funproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunproc(QB64Parser.FunprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QB64Parser.ExpressionContext ctx);
}