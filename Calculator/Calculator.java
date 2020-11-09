package Calculator;

import java.util.Scanner;

public class Calculator {
    private static double result;

    private static void multiplication(double a, double b) {
        result = a * b;
    }

    private static void division(double a, double b) {
        result = a / b;
    }

    private static void addition(double a, double b) {
        result = a + b;
    }

    private static void subtraction(double a, double b) {
        result = a - b;
    }

    public static void main(String[] args) {
        AppFactory appFactory = new AppFactory();
        System.out.println("Введите выражение умножения *, деления/,вычитания - или сложения + через пробел");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        String operator = scanner.next();
        double b = scanner.nextDouble();
        switch (operator) {
            case "*":
                appFactory.message = "multiplication";
                multiplication(a, b);
                AppFactory.loger(args);
                System.out.println(result);
                break;
            case "/":
                appFactory.message = "division";
                division(a, b);
                AppFactory.loger(args);
                System.out.println(result);
                break;
            case "+":
                appFactory.message = "addition";
                addition(a, b);
                AppFactory.loger(args);
                System.out.println(result);
                break;
            case "-":
                appFactory.message = "subtraction";
                subtraction(a, b);
                AppFactory.loger(args);
                System.out.println(result);
                break;
        }
    }
}