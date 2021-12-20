package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игрок 1 введите имя:");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Игрок 2 введите имя:");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);

        String answer = "yes";

        while(!answer.equals("no")) {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
                if (!answer.equals("yes") && !answer.equals("no")) {
                    System.out.println("Некорректный ответ!");
                }
            } while(!answer.equals("yes") && !answer.equals("no"));
        }
        scanner.close();
    }
}