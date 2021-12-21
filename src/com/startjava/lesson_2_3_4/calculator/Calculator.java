package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String[] strings = new String[3];

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public int calculate() {
        int number1 = Integer.parseInt(strings[0]);
        int number2 = Integer.parseInt(strings[2]);
        String operation = strings[1];

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