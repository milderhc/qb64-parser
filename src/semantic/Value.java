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
        return new Integer(String.valueOf(value));
    }

    public double doubleValue () {
        return new Double(String.valueOf(value));
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

    public static Variable createValue(Object value, Type type) {
        if (value == null) {
            switch (type) {
                case INTEGER: value = INTEGER_DEFAULT; break;
                case LONG: value = LONG_DEFAULT; break;
                case SINGLE: value = SINGLE_DEFAULT; break;
                case DOUBLE: value = DOUBLE_DEFAULT; break;
                default: value = STRING_DEFAULT; break;
            }
        }
        String number = String.valueOf(value);
        if (type == Type.INTEGER) return new Variable<>(null, Type.INTEGER, (short) Double.parseDouble(number));
        if (type == Type.LONG) return new Variable<>(null, Type.LONG, (int) Double.parseDouble(number));
        if (type == Type.SINGLE) return new Variable<>(null, Type.SINGLE, (float) Double.parseDouble(number));
        if (type == Type.DOUBLE) return new Variable<>(null, Type.DOUBLE, Double.parseDouble(number));
        return new Variable<>(null, Type.STRING, number);
    }

    public static Variable createValue(boolean b) {
        return (b ? new Variable(null, Type.INTEGER, -1) : new Variable(null, Type.INTEGER, 0));
    }
}
