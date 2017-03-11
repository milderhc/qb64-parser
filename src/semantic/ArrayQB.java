package semantic;

import java.rmi.UnexpectedException;
import java.util.List;
import java.util.Map;

/**
 * Created by milderhc on 11/03/17.
 */
public class ArrayQB<T> extends Variable<T> {
    private List<Integer> dimensions;
    Map<String, T> values;

    public ArrayQB(String name, Type type, List<Integer> dimensions) {
        super(name, type);
        this.dimensions = dimensions;
    }

    public T get (List<Integer> pos) {
        if (check(pos)) {
            String stringPos = posAlias(pos);
            if (!values.containsKey(stringPos)) {
                System.err.println("Fix this");
                return null;
            }
            return values.get(stringPos);
        }
        return null;
    }

    public Variable set (List<Integer> pos, T newValue) {
        if (check(pos)) {
            String stringPos = posAlias(pos);
            values.put(stringPos, newValue);
        }
        return null;
    }

    private boolean check (List<Integer> pos) {
        if (pos.size() != dimensions.size())
            throw new IndexOutOfBoundsException("Dimensions are wrong");
        for (int i = 0; i < pos.size(); ++i)
            if (pos.get(i) > dimensions.get(i))
                throw new IndexOutOfBoundsException("Invalid position");
        return true;
    }

    private String posAlias (List<Integer> pos) {
        StringBuilder build = new StringBuilder();
        pos.forEach(p -> build.append(pos + "@"));
        return build.toString();
    }
}
