package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private int randomNumber;
    boolean winner;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private int askNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        return scanner.nextInt();
    }

    void checkAnswer(Player player, int answerIndex) {
        if (player.numbers[answerIndex] == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + player.getTryCount() + " попытки");
            winner = true;
        } else if (player.numbers[answerIndex] > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
    }

    public void start() {
        winner = false;
        player1.setTryCount(0);
        player2.setTryCount(0);
        randomNumber = random.nextInt(100 + 1);
        System.out.println("Начало игры! У каждого игрока по 10 попыток!");

        for (int i = 0; i < 10; i++) {
            player1.setTryCount(i + 1);
            player1.numbers[i] = askNumber(player1);
            checkAnswer(player1, i);

            if (winner) {
                break;
            } else if (i == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }

            player2.setTryCount(i + 1);
            player2.numbers[i] = askNumber(player2);
            checkAnswer(player2, i);

            if (winner) {
                break;
            } else if (i == 9) {
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
        }

        System.out.print("Варианты ответов игрока " + player1.getName() + ": ");
        for (int i = 0; i < player1.getTryCount(); i++) {
            System.out.print(player1.numbers[i] + " ");
        }
        System.out.println("");

        System.out.print("Варианты ответов игрока " + player2.getName() + ": ");
        for (int i = 0; i < player2.getTryCount(); i++) {
            System.out.print(player2.numbers[i] + " ");
        }
        System.out.println("");

        Arrays.fill(player1.numbers, 0, player1.getTryCount(), 0);
        Arrays.fill(player2.numbers, 0, player2.getTryCount(), 0);
    }
}