import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.PrintWriter;

/**
 * Created by milderhc on 2/03/17.
 */

public class SyntaxPractice {

    private String inputFilename, outputFilename;

    public void generateOutput() throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFilename));
        QB64Lexer lexer = new QB64Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QB64Parser parser = new QB64Parser(tokens);
        ParseTree tree = parser.qb();

        StringBuilder output = new StringBuilder();
        output.append(tree.getText());

//        PrintWriter writer = new PrintWriter(outputFilename, "UTF-8");
//        writer.print(output);
//        writer.close();


        System.out.println(output);
    }

    public void setNewFiles (String inputFilename, String outputFilename) {
        this.inputFilename = inputFilename;
        this.outputFilename = outputFilename;
    }

    private final static int[] SAMPLES = {5, 5, 4, 4, 7};
    private final static String directory = "syntax-test-cases/";
    private final static String inputPrefix = "in0";
    private final static String outputPrefix = "out0";
    private final static String extension = ".txt";

    public static void main(String[] args) throws Exception {
        String testInput = "syntax-test-cases/test-input.txt";

        SyntaxPractice syntaxPractice = new SyntaxPractice();
        syntaxPractice.setNewFiles(testInput, "");

        syntaxPractice.generateOutput();
    }

}
