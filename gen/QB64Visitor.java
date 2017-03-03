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
	 * Visit a parse tree produced by {@link QB64Parser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(QB64Parser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(QB64Parser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(QB64Parser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QB64Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#print_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_list(QB64Parser.Print_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(QB64Parser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(QB64Parser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(QB64Parser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#do_until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_until(QB64Parser.Do_untilContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(QB64Parser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#select_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_(QB64Parser.Select_Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#cases_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases_list(QB64Parser.Cases_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(QB64Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(QB64Parser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#const_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_declaration(QB64Parser.Const_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#const_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_declaration_list(QB64Parser.Const_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(QB64Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#single_numeric_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_numeric_assignment(QB64Parser.Single_numeric_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#array_numeric_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_numeric_assignment(QB64Parser.Array_numeric_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QB64Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#single_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id(QB64Parser.Single_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_numeric_id(QB64Parser.Single_numeric_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#array_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id(QB64Parser.Array_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#array_numeric_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_numeric_id(QB64Parser.Array_numeric_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#array_id_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id_int(QB64Parser.Array_id_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#array_id_long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id_long(QB64Parser.Array_id_longContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#array_id_single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id_single(QB64Parser.Array_id_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#array_id_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id_double(QB64Parser.Array_id_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#array_id_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id_string(QB64Parser.Array_id_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#single_id_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id_int(QB64Parser.Single_id_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#single_id_long}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id_long(QB64Parser.Single_id_longContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#single_id_single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id_single(QB64Parser.Single_id_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#single_id_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id_double(QB64Parser.Single_id_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#single_id_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id_string(QB64Parser.Single_id_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(QB64Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(QB64Parser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QB64Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QB64Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#numeric_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_value(QB64Parser.Numeric_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#string_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value(QB64Parser.String_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QB64Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#funproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunproc(QB64Parser.FunprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_sub(QB64Parser.Call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(QB64Parser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#parameters_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list(QB64Parser.Parameters_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#negop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegop(QB64Parser.NegopContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#compop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompop(QB64Parser.CompopContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(QB64Parser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64Parser#proop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProop(QB64Parser.ProopContext ctx);
}