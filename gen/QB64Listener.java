// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QB64Parser}.
 */
public interface QB64Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QB64Parser#qb}.
	 * @param ctx the parse tree
	 */
	void enterQb(QB64Parser.QbContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#qb}.
	 * @param ctx the parse tree
	 */
	void exitQb(QB64Parser.QbContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(QB64Parser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(QB64Parser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(QB64Parser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(QB64Parser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(QB64Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(QB64Parser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(QB64Parser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(QB64Parser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(QB64Parser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(QB64Parser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(QB64Parser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(QB64Parser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#do_until}.
	 * @param ctx the parse tree
	 */
	void enterDo_until(QB64Parser.Do_untilContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#do_until}.
	 * @param ctx the parse tree
	 */
	void exitDo_until(QB64Parser.Do_untilContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(QB64Parser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(QB64Parser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(QB64Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(QB64Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(QB64Parser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(QB64Parser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QB64Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QB64Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#numeric_asignment}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_asignment(QB64Parser.Numeric_asignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#numeric_asignment}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_asignment(QB64Parser.Numeric_asignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#numeric_id}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_id(QB64Parser.Numeric_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#numeric_id}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_id(QB64Parser.Numeric_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#id_int}.
	 * @param ctx the parse tree
	 */
	void enterId_int(QB64Parser.Id_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#id_int}.
	 * @param ctx the parse tree
	 */
	void exitId_int(QB64Parser.Id_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#id_long}.
	 * @param ctx the parse tree
	 */
	void enterId_long(QB64Parser.Id_longContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#id_long}.
	 * @param ctx the parse tree
	 */
	void exitId_long(QB64Parser.Id_longContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#id_single}.
	 * @param ctx the parse tree
	 */
	void enterId_single(QB64Parser.Id_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#id_single}.
	 * @param ctx the parse tree
	 */
	void exitId_single(QB64Parser.Id_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#id_double}.
	 * @param ctx the parse tree
	 */
	void enterId_double(QB64Parser.Id_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#id_double}.
	 * @param ctx the parse tree
	 */
	void exitId_double(QB64Parser.Id_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QB64Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QB64Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#numeric_value}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_value(QB64Parser.Numeric_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#numeric_value}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_value(QB64Parser.Numeric_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void enterFunproc(QB64Parser.FunprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void exitFunproc(QB64Parser.FunprocContext ctx);
}