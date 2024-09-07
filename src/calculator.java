public class calculator {

    public static <T extends Number, U extends Number> double sum(T a, U b){
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, U extends Number> double sub(T a, U b){
        return a.doubleValue() - b .doubleValue();
    }

    public static <T extends Number, U extends Number> double mult(T a, U b){
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, U extends Number> double div(T a, U b){
        if (b.doubleValue() == 0){
            throw new ArithmeticException("Division by zero");
        }
        return a.doubleValue() / b.doubleValue();
    }

}
