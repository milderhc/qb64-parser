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
        errorMessage.append("; se encontro: " + typeString(found) + ".");
        error(line, column, errorMessage.toString());
    }

    public void incompatibleIntegerError (int line, int column, Value.Type found) {
        List<Value.Type> expectedList = new ArrayList<>();
        expectedList.add(Value.Type.INTEGER);
        expectedList.add(Value.Type.LONG);
        incompatibleTypesError(line, column, expectedList, found);
    }

    public void incompatibleNumericError (int line, int column) {
        List<Value.Type> expectedList = new ArrayList<>();
        expectedList.add(Value.Type.DOUBLE);
        expectedList.add(Value.Type.INTEGER);
        expectedList.add(Value.Type.LONG);
        expectedList.add(Value.Type.SINGLE);
        incompatibleTypesError(line, column, expectedList, Value.Type.STRING);
    }

    public void callingSub (int line, int column, String name) {
        error(line, column, name + " es un procedimiento, no tiene valor de retorno.");
    }

    public void incompatibleStringError (int line, int column, Value.Type found) {
        List<Value.Type> expectedList = new ArrayList<>();
        expectedList.add(Value.Type.STRING);
        incompatibleTypesError(line, column, expectedList, found);
    }

    public void idAlreadyDeclaredError (int line, int column, String name) {
        error(line, column, name + " ya ha sido declarado.");
    }

    public void arrayAlreadyDeclaredError (int line, int column, String name) {
        error(line, column, "El arreglo " + name + " ya ha sido declarado.");
    }

    public void constAssignmentError (int line, int column, String name) {
        error(line, column, name + " no puede ser modificado.");
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

