package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String[] mathTerms = new String[3];

    public Calculator(String[] mathTerms) {
        this.mathTerms = mathTerms;
    }

    public int calculate() {
        int number1 = Integer.parseInt(mathTerms[0]);
        int number2 = Integer.parseInt(mathTerms[2]);
        String operation = mathTerms[1];

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