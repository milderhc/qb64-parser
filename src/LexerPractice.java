/**
 * Created by milderhc on 26/02/17.
 */

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import qb64parsing.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LexerPractice {

    private Set<String> keywords;
    private Map<String, String> operators;
    private Map<String, String> other_token;
    private String inputFilename, outputFilename;

    private void fillKeywords() {
        keywords = new TreeSet<>();
        keywords.add("input");
        keywords.add("print");
        keywords.add("if");
        keywords.add("then");
        keywords.add("else");
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
        keywords.add("end");
        keywords.add("sub");
        keywords.add("function");
        keywords.add("shared");
    }

    private void fillOperators() {
        operators = new TreeMap<>();
        operators.put("not", "token_neg");
        operators.put("=", "token_igual");
        operators.put("<>", "token_dif");
        operators.put("<", "token_menor");
        operators.put(">", "token_mayor");
        operators.put("<=", "token_menor_igual");
        operators.put(">=", "token_mayor_igual");
        operators.put("+", "token_mas");
        operators.put("-", "token_menos");
        operators.put("/", "token_div");
        operators.put("*", "token_mul");
        operators.put("mod", "token_mod");
        operators.put("(", "token_par_izq");
        operators.put(")", "token_par_der");
        operators.put("or", "token_o");
        operators.put("and", "token_y");
        operators.put("xor", "token_xor");
        operators.put(";", "token_pyc");
        operators.put(",", "token_coma");
        operators.put("^", "token_pot");

        operators.put("%", "token_porcentaje");
        operators.put("&", "token_ampersand");
        operators.put("!", "token_admiracion");
        operators.put("#", "token_numeral");
        operators.put("$", "token_pesos");
    }

    private void fillExtratokens() {
        other_token = new TreeMap<>();
        other_token.put("INTEGERVALUE", "token_integer");
        other_token.put("LONGVALUE", "token_long");
        other_token.put("SINGLEVALUE", "token_single");
        other_token.put("DOUBLEVALUE", "token_double");
        other_token.put("STRINGVALUE", "token_string");
        other_token.put("IDPREFIX", "id");
    }

    private String getToken(String str) throws Exception {
        if (other_token.containsKey(str))
            return other_token.get(str);

        throw new Exception("Undefined token, impossible to parse " + str);
    }

    private String identify(int type, Map<String, Integer> tokenType) throws Exception {
        for (Map.Entry<String, Integer> e : tokenType.entrySet()) {
            if (type == e.getValue())
                return getToken(e.getKey());
        }
        return "eof";
    }

    public void setNewFiles (String inputFilename, String outputFilename) {
        this.inputFilename = inputFilename;
        this.outputFilename = outputFilename;
    }

    public LexerPractice() {
        fillKeywords();
        fillOperators();
        fillExtratokens();
    }

    public void generateOutput() throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFilename));
        QB64Lexer lexer = new QB64Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QB64Parser parser = new QB64Parser(tokens);
        parser.qb();

        StringBuilder output = new StringBuilder();

        TokenStream inputStream = parser.getInputStream();
        for (int i = 0; i < inputStream.size(); ++i) {
            Token token = inputStream.get(i);

            //EOF type
            if (token.getType() == -1)
                break;

            String lexema = token.getText();
            String lexemaLower = lexema.toLowerCase();
            if (keywords.contains(lexemaLower))
                output.append("<" + lexemaLower);
            else if (operators.containsKey(lexemaLower))
                output.append("<" + operators.get(lexemaLower));
            else {
                try {
                    String tokenType = identify(token.getType(), parser.getTokenTypeMap());
                    output.append("<" + tokenType + "," +
                            (tokenType.equals("token_string") ? lexema.replaceAll("\"", "") : lexemaLower));
                } catch (Exception e) {
                    output.append(">>> Error lexico " +
                            "(linea: " + token.getLine() + ", posicion: " + (token.getCharPositionInLine() + 1) + ")");

                    PrintWriter writer = new PrintWriter(outputFilename, "UTF-8");
                    writer.print(output);
                    writer.close();

                    //Abort analysis
                    return;
                }
            }

            output.append("," + token.getLine() + "," + (token.getCharPositionInLine() + 1) + ">");
            output.append("\n");
        }

        PrintWriter writer = new PrintWriter(outputFilename, "UTF-8");
        writer.print(output);
        writer.close();
//        System.out.println(output);
    }

    private final static int SAMPLES = 8;
    private final static String directory = "input";
    private final static String inputPrefix = "input";
    private final static String outputPrefix = "output";
    private final static String extension = ".txt";

    public static void main(String[] args) throws Exception {
        LexerPractice lexerPractice = new LexerPractice();
        for (int i = 8; i <= SAMPLES; ++i) {
            lexerPractice.setNewFiles(directory + "/" + inputPrefix + i + extension,
                                      directory + "/" + outputPrefix + i + extension );
            lexerPractice.generateOutput();
        }
    }
}
