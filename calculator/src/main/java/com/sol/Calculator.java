package com.sol;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java -jar solution.jar <number1> <operator> <number2>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);
        String operator = args[1];

        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Error! Dividing by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Unsupported operation.");
                break;
        }
    }
}
