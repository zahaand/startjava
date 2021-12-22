package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while (!answer.equalsIgnoreCase("no")) {
            System.out.print("Введите математическое выражение: ");
            Calculator calculator = new Calculator(scanner.nextLine().split(" "));

            System.out.println(calculator.calculate());

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