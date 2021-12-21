package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    String[] strings = new String[3];

    static int calculate(String[] strings) {
        int number1 = Integer.parseInt(strings[0]);
        int number2 = Integer.parseInt(strings[2]);
        String operation = strings[1];
        int answer = 0;

        switch (operation) {
            case "+" -> answer = number1 + number2;
            case "-" -> answer = number1 - number2;
            case "*" -> answer = number1 * number2;
            case "/" -> answer = number1 / number2;
            case "^" -> answer = (int) Math.pow(number1, number2);
            case "%" -> answer = number1 % number2;
            default -> System.out.println("Incorrect arithmetic operation!");
        }
        return answer;
    }
}