package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игрок 1 введите имя:");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Игрок 2 введите имя:");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        String answer = "yes";

        while(!answer.equals("no")) {
            guessNumber.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scanner.nextLine();
                if (!answer.equals("yes") && !answer.equals("no")) {
                    System.out.println("Некорректный ответ!");
                }
            } while(!answer.equals("yes") && !answer.equals("no"));
        }
        scanner.close();
    }
}