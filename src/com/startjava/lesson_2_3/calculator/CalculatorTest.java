package com.startjava.lesson_2_3.calcucator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while(!answer.equalsIgnoreCase("no")) {
            System.out.println("Введите первое число:");
            calculator.setFirstNumber(scanner.nextInt());

            System.out.println("Введите знак математической операции:");
            calculator.setOperation(scanner.next().charAt(0));

            System.out.println("Введите второе число:");
            calculator.setSecondNumber(scanner.nextInt());
            scanner.nextLine();

            calculator.calculate();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                    System.out.println("Некорректный ответ! Попробуйте снова!");
                }
            } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
        }

        scanner.close();
    }
}