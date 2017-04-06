package semantic;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic.gen.QB64v3Lexer;
import semantic.gen.QB64v3Parser;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by milderhc on 10/03/17.
 */
public class QBInterpreter {
    public void go (String inputFilename) throws IOException {
        ANTLRInputStream input;
        if (inputFilename == null)
            input = new ANTLRInputStream(System.in);
        else
            input = new ANTLRInputStream(new FileInputStream(inputFilename));
        QB64v3Lexer lexer = new QB64v3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QB64v3Parser parser = new QB64v3Parser(tokens);
        ParseTree tree = parser.qb();

        QBVisitor visitor = new QBVisitor();
        visitor.visit(tree);

        System.out.println("Functions");
        visitor.program.functions.forEach((k, v) -> System.out.println(k));
        System.out.println("Subs");
        visitor.program.subs.forEach((k, v) -> System.out.println(k));
        System.out.println("Static Memory");
        visitor.program.staticMemory.forEach((k, v) -> System.out.println(k));
        System.out.println("Dynamic Memory");
        visitor.program.dynamicMemory.forEach((k, v) -> System.out.println(k));

    }
}
