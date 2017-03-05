// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64_.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QB64_Parser}.
 */
public interface QB64_Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#qb}.
	 * @param ctx the parse tree
	 */
	void enterQb(QB64_Parser.QbContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#qb}.
	 * @param ctx the parse tree
	 */
	void exitQb(QB64_Parser.QbContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(QB64_Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(QB64_Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(QB64_Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(QB64_Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#declaration1}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration1(QB64_Parser.Declaration1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#declaration1}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration1(QB64_Parser.Declaration1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#dim_id}.
	 * @param ctx the parse tree
	 */
	void enterDim_id(QB64_Parser.Dim_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#dim_id}.
	 * @param ctx the parse tree
	 */
	void exitDim_id(QB64_Parser.Dim_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(QB64_Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(QB64_Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#single_id}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id(QB64_Parser.Single_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#single_id}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id(QB64_Parser.Single_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 */
	void enterSingle_numeric_id(QB64_Parser.Single_numeric_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 */
	void exitSingle_numeric_id(QB64_Parser.Single_numeric_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QB64_Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QB64_Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffix(QB64_Parser.SuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffix(QB64_Parser.SuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#numeric_suffix}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_suffix(QB64_Parser.Numeric_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#numeric_suffix}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_suffix(QB64_Parser.Numeric_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(QB64_Parser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(QB64_Parser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#expression_list1}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list1(QB64_Parser.Expression_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#expression_list1}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list1(QB64_Parser.Expression_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#idinstruction}.
	 * @param ctx the parse tree
	 */
	void enterIdinstruction(QB64_Parser.IdinstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#idinstruction}.
	 * @param ctx the parse tree
	 */
	void exitIdinstruction(QB64_Parser.IdinstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#idinstruction1}.
	 * @param ctx the parse tree
	 */
	void enterIdinstruction1(QB64_Parser.Idinstruction1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#idinstruction1}.
	 * @param ctx the parse tree
	 */
	void exitIdinstruction1(QB64_Parser.Idinstruction1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(QB64_Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(QB64_Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#constdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstdeclaration(QB64_Parser.ConstdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#constdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstdeclaration(QB64_Parser.ConstdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QB64_Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QB64_Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(QB64_Parser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(QB64_Parser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(QB64_Parser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(QB64_Parser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(QB64_Parser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(QB64_Parser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(QB64_Parser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(QB64_Parser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#forblock}.
	 * @param ctx the parse tree
	 */
	void enterForblock(QB64_Parser.ForblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#forblock}.
	 * @param ctx the parse tree
	 */
	void exitForblock(QB64_Parser.ForblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(QB64_Parser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(QB64_Parser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#next}.
	 * @param ctx the parse tree
	 */
	void enterNext(QB64_Parser.NextContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#next}.
	 * @param ctx the parse tree
	 */
	void exitNext(QB64_Parser.NextContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#nextid}.
	 * @param ctx the parse tree
	 */
	void enterNextid(QB64_Parser.NextidContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#nextid}.
	 * @param ctx the parse tree
	 */
	void exitNextid(QB64_Parser.NextidContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#whileblock}.
	 * @param ctx the parse tree
	 */
	void enterWhileblock(QB64_Parser.WhileblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#whileblock}.
	 * @param ctx the parse tree
	 */
	void exitWhileblock(QB64_Parser.WhileblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#dowhileblock}.
	 * @param ctx the parse tree
	 */
	void enterDowhileblock(QB64_Parser.DowhileblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#dowhileblock}.
	 * @param ctx the parse tree
	 */
	void exitDowhileblock(QB64_Parser.DowhileblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#dountilblock}.
	 * @param ctx the parse tree
	 */
	void enterDountilblock(QB64_Parser.DountilblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#dountilblock}.
	 * @param ctx the parse tree
	 */
	void exitDountilblock(QB64_Parser.DountilblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#selectblock}.
	 * @param ctx the parse tree
	 */
	void enterSelectblock(QB64_Parser.SelectblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#selectblock}.
	 * @param ctx the parse tree
	 */
	void exitSelectblock(QB64_Parser.SelectblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#case_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_list(QB64_Parser.Case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#case_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_list(QB64_Parser.Case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#case_else}.
	 * @param ctx the parse tree
	 */
	void enterCase_else(QB64_Parser.Case_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#case_else}.
	 * @param ctx the parse tree
	 */
	void exitCase_else(QB64_Parser.Case_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#function_sub}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sub(QB64_Parser.Function_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#function_sub}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sub(QB64_Parser.Function_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list(QB64_Parser.Parameters_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list(QB64_Parser.Parameters_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#parameters_list1}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list1(QB64_Parser.Parameters_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#parameters_list1}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list1(QB64_Parser.Parameters_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#parameters_list2}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list2(QB64_Parser.Parameters_list2Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#parameters_list2}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list2(QB64_Parser.Parameters_list2Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#callsub}.
	 * @param ctx the parse tree
	 */
	void enterCallsub(QB64_Parser.CallsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#callsub}.
	 * @param ctx the parse tree
	 */
	void exitCallsub(QB64_Parser.CallsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list(QB64_Parser.Arguments_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list(QB64_Parser.Arguments_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#arguments_list1}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list1(QB64_Parser.Arguments_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#arguments_list1}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list1(QB64_Parser.Arguments_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QB64_Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QB64_Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(QB64_Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(QB64_Parser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64_Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QB64_Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64_Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QB64_Parser.TypeContext ctx);
}