package semantic;

import java.util.List;

/**
 * Created by milderhc on 10/03/17.
 */
public class Variable<T> extends Value<T> implements Comparable<Variable<T>> {
    protected String name;
    protected String properName;
    private boolean constType;
    protected boolean shared;
    private boolean dynamic;

    public static String INTEGER_SUFFIX = "%";
    public static String LONG_SUFFIX = "&";
    public static String SINGLE_SUFFIX = "!";
    public static String DOUBLE_SUFFIX = "#";
    public static String STRING_SUFFIX = "$";


    public Variable (String name, Type type) {
        this(name, type, false, false);
    }

    public Variable (String name, Type type, boolean constVariable, boolean shared) {
        this.name = name;
        this.properName = name;
        this.type = type;
        this.constType = constVariable;
        this.shared = shared;
        switch (this.type) {
            case INTEGER: value = (T) INTEGER_DEFAULT; break;
            case LONG: value = (T) LONG_DEFAULT; break;
            case SINGLE: value = (T) SINGLE_DEFAULT; break;
            case DOUBLE: value = (T) DOUBLE_DEFAULT; break;
            default: value = (T) STRING_DEFAULT; break;
        }
    }

    public Variable (String name, Type type, T value) {
        this(name, type, value, false, false);
    }

    public Variable(String name, Type type, T value, boolean constVariable, boolean shared) {
        this.type = type;
        this.properName = name;
        this.name = name;
        this.value = value;
        this.constType = constVariable;
        this.shared = shared;
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

    public boolean isConstType() {
        return constType;
    }

    public void setConstType(boolean constType) {
        this.constType = constType;
    }

    public void addSuffix () {
        switch (this.type) {
            case INTEGER: name += INTEGER_SUFFIX; break;
            case LONG: name += LONG_SUFFIX; break;
            case SINGLE: name += SINGLE_SUFFIX; break;
            case DOUBLE: name += DOUBLE_SUFFIX; break;
            default: name += STRING_SUFFIX;
        }
    }

    public void addSpecificAlias (List<Variable> pos) {
        StringBuilder s = new StringBuilder();
        for (Variable i : pos)
            s.append(i.getValue() + "-");
        name += s.toString();
    }

    @Override
    public int compareTo (Variable v) {
        return name.compareTo(v.name);
    }

    public void setDynamic (boolean dynamic) {
        this.dynamic = dynamic;
    }

    public boolean isDynamic () {
        return dynamic;
    }

    public String getProperName () {
        return properName;
    }
}

