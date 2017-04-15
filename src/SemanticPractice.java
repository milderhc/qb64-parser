import semantic.QBInterpreter;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class SemanticPractice {
    public static void main(String[] args) throws IOException {
        QBInterpreter interpreter = new QBInterpreter();

        String input = "semantic-test-cases/samples/in09.txt";
        interpreter.go(input);
        System.setOut(new PrintStream(new File("semantic-test-cases/samples/out09.txt")));
        interpreter.go(input);
    }
}






