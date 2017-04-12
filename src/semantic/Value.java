package semantic;

public class Value<T> {
    public enum Type {INTEGER, LONG, SINGLE, DOUBLE, STRING};
    protected Type type;
    protected T value;

    public static Short INTEGER_DEFAULT = 0;
    public static Integer LONG_DEFAULT = 0;
    public static Float SINGLE_DEFAULT = 0.0f;
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
        if (type == Type.INTEGER) return (int) (Short) value;
        return (int) (Integer) value;
    }

    public double doubleValue () {
        if (type == Type.DOUBLE) return (double) (Double) value;
        if (type == Type.SINGLE) return (double) (float) (Float) value;
        if (type == Type.INTEGER) return (double) (Short) value;
        return (double) (Integer) value;
    }

    public Type intType () {
        return getIntegerType(this.type);
    }

    public Type getIntegerType (Type a) {
        if (a == Type.INTEGER || a == Type.SINGLE) return Type.INTEGER;
        return Type.LONG;
    }

    public static Type getType (Type a, Type b) {
        if (a == Type.DOUBLE || b == Type.DOUBLE) return Type.DOUBLE;
        if (a == Type.SINGLE || b == Type.SINGLE) return Type.SINGLE;
        if (a == Type.LONG || b == Type.LONG) return Type.LONG;
        return Type.INTEGER;
    }

    @Override
    public String toString () {
        return value + "";
    }

    public static Value createValue (Object value, Type type) {
        String number = String.valueOf(value);
        if (type == Type.INTEGER) return new Value((short) Double.parseDouble(number), Type.INTEGER);
        if (type == Type.LONG) return new Value((int) Double.parseDouble(number), Type.LONG);
        if (type == Type.SINGLE) return new Value((float) Double.parseDouble(number), Type.SINGLE);
        if (type == Type.DOUBLE) return new Value(Double.parseDouble(number), Type.DOUBLE);
        return new Value(number, Type.STRING);
    }

    public static Value createValue (boolean b) {
        return (b ? new Value(-1, Type.INTEGER) : new Value(0, Type.INTEGER));
    }
}
