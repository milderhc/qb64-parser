package semantic;

public class Value<T> {
    public enum Type {INTEGER, LONG, SINGLE, DOUBLE, STRING};
    protected Type type;
    protected T value;

    public static Integer INTEGER_DEFAULT = 0;
    public static Integer LONG_DEFAULT = 0;
    public static Double SINGLE_DEFAULT = 0.0;
    public static Double DOUBLE_DEFAULT = 0.0;
    public static String STRING_DEFAULT = "";

    public Value () {}

    public Value(T value, Type type) {
        this.value = value;
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int intValue () {
        if (type == Type.DOUBLE) return (int) (double) (Double) value;
        if (type == Type.SINGLE) return (int) (float) (Float) value;
        return (int) (Integer) value;
    }


    @Override
    public String toString () {
        return value + "";
    }

}
