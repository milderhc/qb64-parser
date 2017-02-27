/**
 * Created by milderhc on 26/02/17.
 */
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import qb64parsing.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LexerPractice {

    private static Set<String> keywords;
    private static Map<String, String> operators;

    private static void fillKeywords () {
        keywords = new TreeSet<>();
        keywords.add("input");
        keywords.add("print");
        keywords.add("if");
        keywords.add("then");
        keywords.add("else");
        keywords.add("endif");
        keywords.add("while");
        keywords.add("wend");
        keywords.add("do");
        keywords.add("loop");
        keywords.add("until");
        keywords.add("for");
        keywords.add("to");
        keywords.add("step");
        keywords.add("next");
        keywords.add("integer");
        keywords.add("single");
        keywords.add("double");
        keywords.add("long");
        keywords.add("string");
        keywords.add("dim");
        keywords.add("as");
        keywords.add("end if");
    }

    private static void fillOperators () {
        operators = new TreeMap<>();
        operators.put("not", "token_neg");
        operators.put("or", "token_o");
        operators.put("and", "token_y");
        operators.put("xor", "token_xor");
        operators.put("mod", "token_mod");
        operators.put("=", "token_igual");
        operators.put("<>", "token_dif");
        operators.put("<", "token_menor");
        operators.put(">", "token_mayor");
        operators.put("<=", "token_menor_igual");
        operators.put(">=", "token_mayor_igual");
        operators.put("+", "token_mayor_mas");
        operators.put("-", "token_mayor_menos");
        operators.put("/", "token_mayor_div");
        operators.put("*", "token_mayor_mul");
        operators.put("(", "token_par_izq");
        operators.put(")", "token_par_der");
        operators.put(";", "token_pyc");
        operators.put(",", "token_coma");
        operators.put("^", "token_pot");

        operators.put("%", "token_porcentaje");
        operators.put("&", "token_ampersand");
        operators.put("!", "token_admiracion");
        operators.put("#", "token_numeral");
        operators.put("$", "token_pesos");
    }

    private static String identify (int type, Map<String, Integer> tokenType) {
        for (Map.Entry<String, Integer> e : tokenType.entrySet()) {
            if (type == e.getValue())
                return e.getKey();
        }
        return "eof";
    }

    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("input/input1.txt"));
        QB64Lexer lexer = new QB64Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QB64Parser parser = new QB64Parser(tokens);
        ParseTree parseTree = parser.qb();

        fillKeywords();
        fillOperators();

        StringBuilder output = new StringBuilder();

        TokenStream inputStream = parser.getInputStream();
        for (int i = 0; i < inputStream.size(); ++i) {
            Token token = inputStream.get(i);

            String lexema = token.getText().toLowerCase();
            output.append("<");
            if (keywords.contains(lexema))
                output.append(lexema);
            else if (operators.containsKey(lexema))
                output.append(operators.get(lexema));
            else
                output.append(identify(token.getType(), parser.getTokenTypeMap())
                + "," + lexema);

            output.append("," + (token.getLine() + 1) + "," + (token.getCharPositionInLine() + 1) + ">" );
            output.append("\n");
        }

        System.out.println(output);
    }
}
