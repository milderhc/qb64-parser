package semantic;

/**
 * Created by milderhc on 10/03/17.
 */
public class Variable<T> implements Comparable<Variable<T>> {
    public enum Type {INTEGER, LONG, SINGLE, DOUBLE, STRING};
    protected Type type;
    protected String name;
    private T value;

    public Variable (String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Variable (String name, Type type, T value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public int compareTo (Variable v) {
        return name.compareTo(v.name);
    }
}

