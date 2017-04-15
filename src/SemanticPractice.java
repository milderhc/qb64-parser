import semantic.QBInterpreter;

import java.io.IOException;

public class SemanticPractice {
    public static void main(String[] args) throws IOException {
        QBInterpreter interpreter = new QBInterpreter();
        interpreter.go("semantic-test-cases/test-input.txt");
    }
}






