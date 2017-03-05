// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v2.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QB64v2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QB64v2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#qb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQb(QB64v2Parser.QbContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(QB64v2Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(QB64v2Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#declaration1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration1(QB64v2Parser.Declaration1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#dim_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_id(QB64v2Parser.Dim_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(QB64v2Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#single_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id(QB64v2Parser.Single_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_numeric_id(QB64v2Parser.Single_numeric_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QB64v2Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffix(QB64v2Parser.SuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#non_empty_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_empty_suffix(QB64v2Parser.Non_empty_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#numeric_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_suffix(QB64v2Parser.Numeric_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(QB64v2Parser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#expression_list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list1(QB64v2Parser.Expression_list1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#constdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstdeclaration(QB64v2Parser.ConstdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#idblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdblock(QB64v2Parser.IdblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#idblock1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdblock1(QB64v2Parser.Idblock1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#idblock2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdblock2(QB64v2Parser.Idblock2Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#idblock3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdblock3(QB64v2Parser.Idblock3Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#idblock4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdblock4(QB64v2Parser.Idblock4Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#idblock5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdblock5(QB64v2Parser.Idblock5Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#idblock6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdblock6(QB64v2Parser.Idblock6Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#idblock7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdblock7(QB64v2Parser.Idblock7Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#idblock8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdblock8(QB64v2Parser.Idblock8Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QB64v2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(QB64v2Parser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(QB64v2Parser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(QB64v2Parser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(QB64v2Parser.IfblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(QB64v2Parser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#elseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseblock(QB64v2Parser.ElseblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#forblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForblock(QB64v2Parser.ForblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(QB64v2Parser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext(QB64v2Parser.NextContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#nextid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextid(QB64v2Parser.NextidContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#whileblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileblock(QB64v2Parser.WhileblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#dowhileblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhileblock(QB64v2Parser.DowhileblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#dountilblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDountilblock(QB64v2Parser.DountilblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#selectblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectblock(QB64v2Parser.SelectblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_list(QB64v2Parser.Case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#case_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_else(QB64v2Parser.Case_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#function_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_sub(QB64v2Parser.Function_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#parameters_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list(QB64v2Parser.Parameters_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#parameters_list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list1(QB64v2Parser.Parameters_list1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#parameters_list2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list2(QB64v2Parser.Parameters_list2Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list(QB64v2Parser.Arguments_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#arguments_list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list1(QB64v2Parser.Arguments_list1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(QB64v2Parser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#input1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput1(QB64v2Parser.Input1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QB64v2Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#print1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint1(QB64v2Parser.Print1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#print2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint2(QB64v2Parser.Print2Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QB64v2Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(QB64v2Parser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(QB64v2Parser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64v2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QB64v2Parser.TypeContext ctx);
}