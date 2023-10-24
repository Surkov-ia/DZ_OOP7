package Data;

public class Calculator {
    public Calculator() {}

    public double sum(double number1, double number2) {
        return number1 + number2;
    }
    public double subtract(double number1, double number2) {
        return number1 - number2;
    }
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }
    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    @Override
    public String toString() {
        return "Calculator";
    }
}

