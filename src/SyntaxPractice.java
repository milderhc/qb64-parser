import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by milderhc on 2/03/17.
 */

public class SyntaxPractice {

    private String inputFilename, outputFilename;
    private boolean syntaxErrorFound;

    public void generateOutput() throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFilename));
        QB64v2Lexer lexer = new QB64v2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QB64v2Parser parser = new QB64v2Parser(tokens);

        final PrintWriter writer = new PrintWriter(outputFilename, "UTF-8");

        parser.setErrorHandler(new DefaultErrorStrategy(){
            @Override
            protected void reportUnwantedToken(Parser recognizer) {
                if(!this.inErrorRecoveryMode(recognizer)) {
                    this.beginErrorCondition(recognizer);
                    Token token = recognizer.getCurrentToken();
                    String tokenName = this.getTokenErrorDisplay(token);
                    IntervalSet expecting = this.getExpectedTokens(recognizer);

                    String msg = "<" + token.getLine() + "," + token.getCharPositionInLine() + "> Error sintactico: " +
                                 "se encontro: " + tokenName + "; se esperaba: " + expecting.toString(recognizer.getVocabulary());

                    if (!syntaxErrorFound) {
                        syntaxErrorFound = true;
                        writer.print(msg);
                        writer.close();
                    }

                    recognizer.notifyErrorListeners(token, msg, (RecognitionException)null);
                }
            }
        });

        ParseTree tree = parser.qb();
        if (!syntaxErrorFound) {
            writer.print("El analisis sintactico ha finalizado correctamente.");
            writer.close();
        }
    }

    public void setNewFiles (String inputFilename, String outputFilename) {
        this.inputFilename = inputFilename;
        this.outputFilename = outputFilename;
        syntaxErrorFound = false;
    }

    private final static int[] SAMPLES = {2, 0, 3, 4, 0};
    private final static String directory = "syntax-test-cases/";
    private final static String inputPrefix = "in0";
    private final static String outputPrefix = "out0";
    private final static String extension = ".txt";

    public static void main(String[] args) throws Exception {
        String testInput = "syntax-test-cases/test-input.txt";

        SyntaxPractice syntaxPractice = new SyntaxPractice();
        syntaxPractice.setNewFiles(testInput, "");

        for (char c = 'A'; c <= 'E'; ++c) {
            for (int i = 0; i < SAMPLES[(int)(c - 'A')]; ++i) {
                syntaxPractice.setNewFiles(directory + "/" + String.valueOf(c) + "/"
                                + inputPrefix + i + extension,
                        directory + "/" + String.valueOf(c) + "/"
                                + outputPrefix + i + extension);
                syntaxPractice.generateOutput();
            }
        }
    }

}
