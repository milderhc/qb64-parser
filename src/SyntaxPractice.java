import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

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

            protected String elementName(Vocabulary vocabulary, int a) {
                return a == -1?"<EOF>":(a == -2?"<EPSILON>":vocabulary.getDisplayName(a));
            }

            private String reportSyntaxError (Token token, Parser recognizer) {
                String tokenName = this.getTokenErrorDisplay(token);
                IntervalSet expecting = this.getExpectedTokens(recognizer);
                TreeSet<String> expectedTokens = new TreeSet<>();

                //Adapted from org.antlr.v4.runtime.misc.IntervalSet.toString(Vocabulary)
                if(expecting.getIntervals() != null && !expecting.getIntervals().isEmpty()) {
                    Iterator iter = expecting.getIntervals().iterator();
                    while(iter.hasNext()) {
                        Interval I = (Interval)iter.next();
                        int a = I.a;
                        int b = I.b;
                        for(int i = a; i <= b; ++i) {
                            String name = elementName(recognizer.getVocabulary(), i);
                            if (name.indexOf('\'') == -1) {
                                if (name.equals("ID"))
                                    name = "IDENTIFICADOR";
                                name = "\'" + name + "\'";
                            }
                            expectedTokens.add(name);
                        }
                    }
                }

                StringBuilder expectedBuffer = new StringBuilder();
                boolean comma = false;
                for (String tokenString : expectedTokens) {
                    if (comma) expectedBuffer.append(", ");
                    expectedBuffer.append(tokenString.toLowerCase());
                    comma = true;
                }

                String msg = "<" + token.getLine() + "," + (token.getCharPositionInLine() + 1) + "> Error sintactico: " +
                        "se encontro: " + tokenName + "; se esperaba: " +
                        expectedBuffer + ".";

                if (!syntaxErrorFound) {
                    syntaxErrorFound = true;
                    writer.print(msg);
                    writer.close();
                }

                return msg;
            }

            @Override
            protected void reportUnwantedToken(Parser recognizer) {
                if(!this.inErrorRecoveryMode(recognizer)) {
                    this.beginErrorCondition(recognizer);
                    Token token = recognizer.getCurrentToken();
                    String msg = reportSyntaxError(token, recognizer);
                    recognizer.notifyErrorListeners(token, msg, (RecognitionException)null);
                }
            }

            @Override
            protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
                String msg = reportSyntaxError(e.getOffendingToken(), recognizer);
                recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
            }

            @Override
            protected void reportMissingToken(Parser recognizer) {
                if(!this.inErrorRecoveryMode(recognizer)) {
                    this.beginErrorCondition(recognizer);
                    Token token = recognizer.getCurrentToken();
                    String msg = reportSyntaxError(token, recognizer);
                    recognizer.notifyErrorListeners(token, msg, (RecognitionException)null);
                }
            }
        });

        parser.qb();
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

    private final static int[] SAMPLES = {2, 0, 3, 4, 0, 8};
    private final static String directory = "syntax-test-cases/";
    private final static String inputPrefix = "in0";
    private final static String outputPrefix = "out0";
    private final static String extension = ".txt";

    public static void main(String[] args) throws Exception {
        SyntaxPractice syntaxPractice = new SyntaxPractice();
        syntaxPractice.setNewFiles("syntax-test-cases/test-input.txt",
                "syntax-test-cases/test-ouput.txt");
        syntaxPractice.generateOutput();


        for (char c = 'F'; c <= 'F'; ++c) {
            for (int i = 1; i <= SAMPLES[(int)(c - 'A')]; ++i) {
                syntaxPractice.setNewFiles(directory + "/" + String.valueOf(c) + "/"
                                + inputPrefix + i + extension,
                        directory + "/" + String.valueOf(c) + "/"
                                + outputPrefix + i + extension);
                syntaxPractice.generateOutput();
            }
        }
    }

}
