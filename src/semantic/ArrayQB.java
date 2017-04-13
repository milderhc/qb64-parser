package semantic;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by milderhc on 11/03/17.
 */
public class ArrayQB<T> extends Variable<T> {
    private List<Integer> dimensions;
    private Map<String, Variable<T>> values;

    public ArrayQB(String name, Type type, List<Integer> dimensions, boolean shared) {
        super(name, type, false, shared);
        this.dimensions = dimensions;
        this.values = new TreeMap<>();
    }

    public Variable<T> get (List<Integer> pos) {
        if (check(pos)) {
            String stringPos = posAlias(pos);
            if (!values.containsKey(stringPos)) {
                switch (this.type) {
                    case INTEGER: set(pos, (T) Value.INTEGER_DEFAULT); break;
                    case LONG: set(pos, (T) Value.LONG_DEFAULT); break;
                    case SINGLE: set(pos, (T) Value.SINGLE_DEFAULT); break;
                    case DOUBLE: set(pos, (T) Value.DOUBLE_DEFAULT); break;
                    default: set(pos, (T) Value.STRING_DEFAULT);
                }
            }
            return values.get(stringPos);
        }
        return null;
    }

    public void set (List<Integer> pos, T newValue) {
        if (check(pos)) {
            String stringPos = posAlias(pos);
            values.put(stringPos, new Variable<T>(stringPos, this.type, newValue));
        }
    }

    private boolean check (List<Integer> pos) {
        if (pos.size() != dimensions.size())
            throw new IndexOutOfBoundsException("Dimensions are wrong");
        for (int i = 0; i < pos.size(); ++i) {
            if (pos.get(i) > dimensions.get(i))
                throw new IndexOutOfBoundsException("Invalid position");
        }
        return true;
    }

    public static String posAlias (List<Integer> pos) {
        StringBuilder build = new StringBuilder();
        pos.forEach(p -> build.append(pos + "@"));
        return build.toString();
    }

    public List<Integer> getDimensions() {
        return dimensions;
    }

    public Map<String, Variable<T>> getValues() {
        return values;
    }

    public static String getArrayId (String id) {
        return id + "@";
    }
}
