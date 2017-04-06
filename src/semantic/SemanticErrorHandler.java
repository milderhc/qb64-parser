package semantic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by milderhc on 13/03/17.
 */
public class SemanticErrorHandler {

    private final String ERROR_PREFIX = " Error semantico: ";

    public void error (int line, int column, String message) {
        ++column;
        System.err.println("<" + line + "," + column + ">" + ERROR_PREFIX + message);
        System.exit(-1);
    }

    public void incompatibleTypesError (int line, int column, List<Value.Type> expected, Value.Type found) {
        StringBuilder errorMessage = new StringBuilder("tipos de datos incompatibles. Se esperaba: ");
        for (int i = 0; i < expected.size(); ++i) {
            if (i > 0) errorMessage.append(", ");
            errorMessage.append(typeString(expected.get(i)));
        }
        errorMessage.append("; Se encontro: " + typeString(found) + ".");
        error(line, column, errorMessage.toString());
    }

    public void incompatibleIntegerError (int line, int column, Value.Type found) {
        List<Value.Type> expectedList = new ArrayList<>();
        expectedList.add(Value.Type.INTEGER);
        expectedList.add(Value.Type.LONG);
        incompatibleTypesError(line, column, expectedList, found);
    }

    public String typeString (Value.Type type) {
        switch (type) {
            case INTEGER:
                return "integer";
            case LONG:
                return "long";
            case SINGLE:
                return "single";
            case DOUBLE:
                return "double";
            case STRING:
                return "string";
            default:
                return "TYPE NOT SUPPORTED";
        }
    }
}

