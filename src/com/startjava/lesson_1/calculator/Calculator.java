package com.startjava.lesson_1.calculator.Calculator;

public class Calculator {
    public static void main(String[] args) {
        char action = '^';
        int number1 = 2;
        int number2 = 10;

        if (action == '+') {
            System.out.println(number1 + number2);
        } else if (action == '-') {
            System.out.println(number1 - number2);
        } else if (action == '*') {
            System.out.println(number1 * number2);
        } else if (action == '/') {
            System.out.println(number1 / number2);
        } else if (action == '^') {
            int result = 1;
            for(int i = 0; i < number2; i++) {
                result *= number1;
            }
            System.out.println(result);
        } else if (action == '%') {
            System.out.println(number1 % number2);
        }
    }
}