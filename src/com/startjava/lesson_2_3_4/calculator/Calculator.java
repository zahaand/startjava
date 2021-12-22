package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String[] expression;

    public Calculator(String[] expression) {
        this.expression = expression;
    }

    public int calculate() {
        int number1 = Integer.parseInt(expression[0]);
        int number2 = Integer.parseInt(expression[2]);
        String operation = expression[1];

        return switch (operation) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            case "^" -> (int) Math.pow(number1, number2);
            case "%" -> number1 % number2;
            default -> {
                System.out.println("Incorrect arithmetic operation!");
                yield 0;
            }
        };
    }
}