package semantic;

/**
 * Created by milderhc on 10/03/17.
 */
public class Variable<T> extends Value<T> implements Comparable<Variable<T>> {
    protected String name;
    private boolean constVariable;

    public Variable (String name, Type type) {
        this(name, type, false);
    }

    public Variable (String name, Type type, boolean constVariable) {
        this.name = name;
        this.type = type;
        this.constVariable = constVariable;
    }

    public Variable (String name, Type type, T value) {
        this(name, type, value, false);
    }

    public Variable(String name, Type type, T value, boolean constVariable) {
        this.type = type;
        this.name = name;
        this.value = value;
        this.constVariable = constVariable;
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

    public boolean isConstVariable() {
        return constVariable;
    }

    public void setConstVariable(boolean constVariable) {
        this.constVariable = constVariable;
    }

    @Override
    public int compareTo (Variable v) {
        return name.compareTo(v.name);
    }
}

