// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64.g4 by ANTLR 4.6
package qb64parsing;
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
	 * Enter a parse tree produced by {@link QB64Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(QB64Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(QB64Parser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QB64Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QB64Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#print_list}.
	 * @param ctx the parse tree
	 */
	void enterPrint_list(QB64Parser.Print_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#print_list}.
	 * @param ctx the parse tree
	 */
	void exitPrint_list(QB64Parser.Print_listContext ctx);
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
	 * Enter a parse tree produced by {@link QB64Parser#select_}.
	 * @param ctx the parse tree
	 */
	void enterSelect_(QB64Parser.Select_Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#select_}.
	 * @param ctx the parse tree
	 */
	void exitSelect_(QB64Parser.Select_Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#cases_list}.
	 * @param ctx the parse tree
	 */
	void enterCases_list(QB64Parser.Cases_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#cases_list}.
	 * @param ctx the parse tree
	 */
	void exitCases_list(QB64Parser.Cases_listContext ctx);
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
	 * Enter a parse tree produced by {@link QB64Parser#const_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConst_declaration(QB64Parser.Const_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#const_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConst_declaration(QB64Parser.Const_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#const_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterConst_declaration_list(QB64Parser.Const_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#const_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitConst_declaration_list(QB64Parser.Const_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(QB64Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(QB64Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#single_numeric_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSingle_numeric_assignment(QB64Parser.Single_numeric_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#single_numeric_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSingle_numeric_assignment(QB64Parser.Single_numeric_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#array_numeric_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_numeric_assignment(QB64Parser.Array_numeric_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#array_numeric_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_numeric_assignment(QB64Parser.Array_numeric_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QB64Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QB64Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#single_id}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id(QB64Parser.Single_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#single_id}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id(QB64Parser.Single_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 */
	void enterSingle_numeric_id(QB64Parser.Single_numeric_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 */
	void exitSingle_numeric_id(QB64Parser.Single_numeric_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(QB64Parser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(QB64Parser.Array_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#array_numeric_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_numeric_id(QB64Parser.Array_numeric_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#array_numeric_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_numeric_id(QB64Parser.Array_numeric_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#array_id_int}.
	 * @param ctx the parse tree
	 */
	void enterArray_id_int(QB64Parser.Array_id_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#array_id_int}.
	 * @param ctx the parse tree
	 */
	void exitArray_id_int(QB64Parser.Array_id_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#array_id_long}.
	 * @param ctx the parse tree
	 */
	void enterArray_id_long(QB64Parser.Array_id_longContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#array_id_long}.
	 * @param ctx the parse tree
	 */
	void exitArray_id_long(QB64Parser.Array_id_longContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#array_id_single}.
	 * @param ctx the parse tree
	 */
	void enterArray_id_single(QB64Parser.Array_id_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#array_id_single}.
	 * @param ctx the parse tree
	 */
	void exitArray_id_single(QB64Parser.Array_id_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#array_id_double}.
	 * @param ctx the parse tree
	 */
	void enterArray_id_double(QB64Parser.Array_id_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#array_id_double}.
	 * @param ctx the parse tree
	 */
	void exitArray_id_double(QB64Parser.Array_id_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#array_id_string}.
	 * @param ctx the parse tree
	 */
	void enterArray_id_string(QB64Parser.Array_id_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#array_id_string}.
	 * @param ctx the parse tree
	 */
	void exitArray_id_string(QB64Parser.Array_id_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#single_id_int}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id_int(QB64Parser.Single_id_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#single_id_int}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id_int(QB64Parser.Single_id_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#single_id_long}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id_long(QB64Parser.Single_id_longContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#single_id_long}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id_long(QB64Parser.Single_id_longContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#single_id_single}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id_single(QB64Parser.Single_id_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#single_id_single}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id_single(QB64Parser.Single_id_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#single_id_double}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id_double(QB64Parser.Single_id_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#single_id_double}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id_double(QB64Parser.Single_id_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#single_id_string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id_string(QB64Parser.Single_id_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#single_id_string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id_string(QB64Parser.Single_id_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(QB64Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(QB64Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(QB64Parser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(QB64Parser.Expression_listContext ctx);
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
	 * Enter a parse tree produced by {@link QB64Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QB64Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QB64Parser.ValueContext ctx);
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
	 * Enter a parse tree produced by {@link QB64Parser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(QB64Parser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(QB64Parser.String_valueContext ctx);
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
	 * Enter a parse tree produced by {@link QB64Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void enterFunproc(QB64Parser.FunprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void exitFunproc(QB64Parser.FunprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#call_sub}.
	 * @param ctx the parse tree
	 */
	void enterCall_sub(QB64Parser.Call_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#call_sub}.
	 * @param ctx the parse tree
	 */
	void exitCall_sub(QB64Parser.Call_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(QB64Parser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(QB64Parser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list(QB64Parser.Parameters_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list(QB64Parser.Parameters_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#negop}.
	 * @param ctx the parse tree
	 */
	void enterNegop(QB64Parser.NegopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#negop}.
	 * @param ctx the parse tree
	 */
	void exitNegop(QB64Parser.NegopContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(QB64Parser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(QB64Parser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(QB64Parser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(QB64Parser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64Parser#proop}.
	 * @param ctx the parse tree
	 */
	void enterProop(QB64Parser.ProopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64Parser#proop}.
	 * @param ctx the parse tree
	 */
	void exitProop(QB64Parser.ProopContext ctx);
}