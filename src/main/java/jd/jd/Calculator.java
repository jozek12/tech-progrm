package jd.jd;

public class Calculator {
    private final Operations operations = new Operations();

    public double calculate(double a, String symbol, double b) {
        switch (symbol) {
            case "+":
                return operations.add(a, b);
            case "-":
                return operations.subtract(a, b);
            case "*":
                return operations.multiply(a, b);
            case "/":
                return operations.divide(a, b);
            default:
                throw new IllegalArgumentException("Nieznany znak: " + symbol);
        }
    }
}
