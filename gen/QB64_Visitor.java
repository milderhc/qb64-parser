// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64_.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QB64_Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QB64_Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#qb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQb(QB64_Parser.QbContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(QB64_Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(QB64_Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#declaration1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration1(QB64_Parser.Declaration1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#dim_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_id(QB64_Parser.Dim_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(QB64_Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#single_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id(QB64_Parser.Single_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_numeric_id(QB64_Parser.Single_numeric_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QB64_Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffix(QB64_Parser.SuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#numeric_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_suffix(QB64_Parser.Numeric_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(QB64_Parser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#expression_list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list1(QB64_Parser.Expression_list1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#idinstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdinstruction(QB64_Parser.IdinstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#idinstruction1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdinstruction1(QB64_Parser.Idinstruction1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(QB64_Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#constdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstdeclaration(QB64_Parser.ConstdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QB64_Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(QB64_Parser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(QB64_Parser.IfblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(QB64_Parser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(QB64_Parser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#forblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForblock(QB64_Parser.ForblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(QB64_Parser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext(QB64_Parser.NextContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#nextid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextid(QB64_Parser.NextidContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#whileblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileblock(QB64_Parser.WhileblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#dowhileblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhileblock(QB64_Parser.DowhileblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#dountilblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDountilblock(QB64_Parser.DountilblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#selectblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectblock(QB64_Parser.SelectblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_list(QB64_Parser.Case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#case_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_else(QB64_Parser.Case_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#function_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_sub(QB64_Parser.Function_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#parameters_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list(QB64_Parser.Parameters_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#parameters_list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list1(QB64_Parser.Parameters_list1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#parameters_list2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list2(QB64_Parser.Parameters_list2Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#callsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallsub(QB64_Parser.CallsubContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list(QB64_Parser.Arguments_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#arguments_list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list1(QB64_Parser.Arguments_list1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QB64_Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(QB64_Parser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QB64_Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QB64_Parser.TypeContext ctx);
}