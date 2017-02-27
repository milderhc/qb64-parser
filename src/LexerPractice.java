/**
 * Created by milderhc on 26/02/17.
 */
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import qb64parsing.*;

import java.io.FileInputStream;
import java.io.IOException;

public class LexerPractice {

    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("test.txt"));
        QB64Lexer lexer = new QB64Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QB64Parser parser = new QB64Parser(tokens);
        ParseTree parseTree = parser.qb();

        LexerVisitor<Object> loader = new LexerVisitor<>();
        try {
            loader.visit(parseTree);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Main visitor error");
        }
    }
}
