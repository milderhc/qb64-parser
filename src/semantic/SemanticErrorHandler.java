package semantic;

/**
 * Created by milderhc on 13/03/17.
 */
public class SemanticErrorHandler {

    private final String ERROR_PREFIX = ">>> Error semantico: ";

    public void error (String message) {
        System.err.println(ERROR_PREFIX + message);
        System.exit(0);
    }
}
