import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic.QBInterpreter;
import semantic.QBVisitor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class SemanticPractice {
    public static void main(String[] args) throws IOException {
        QBInterpreter interpreter = new QBInterpreter();
        interpreter.go("semantic-test-cases/test-input.txt");
    }
}






