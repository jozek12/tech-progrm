package jd.jd;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Wpisz np. 2 + 3, 'exit' konczy.");

        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if ("exit".equals(line)) {
                    break;
                }

                String[] parts = line.split(" ");
                if (parts.length != 3) {
                    System.out.println("Blad: wpisz np. 2 + 3");
                    continue;
                }

                try {
                    double a = Double.parseDouble(parts[0]);
                    double b = Double.parseDouble(parts[2]);
                    double result = calculator.calculate(a, parts[1], b);
                    System.out.println("= " + result);
                } catch (IllegalArgumentException | ArithmeticException e) {
                    System.out.println("Blad: " + e.getMessage());
                }
            }
        }
    }
}
