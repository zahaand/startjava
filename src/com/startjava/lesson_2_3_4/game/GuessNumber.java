package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private int randomNumber;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.setTryCount(0);
        player2.setTryCount(0);
        randomNumber = random.nextInt(100 + 1);
        System.out.println("Начало игры! У каждого игрока по 10 попыток!");

        for (int i = 0; i < 10; i++) {
            player1.setTryCount(i + 1);
            player1.setNumber(i, inputNumber(player1));

            if (checkNumber(player1)) {
                break;
            } else if (i == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }

            player2.setTryCount(i + 1);
            player2.setNumber(i, inputNumber(player2));

            if (checkNumber(player2)) {
                break;
            } else if (i == 9) {
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
        }

        printAllNumbers(player1);
        printAllNumbers(player2);

        Arrays.fill(player1.getNumbers(), 0, player1.getTryCount(), 0);
        Arrays.fill(player2.getNumbers(), 0, player2.getTryCount(), 0);
    }

    private int inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        return scanner.nextInt();
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber(player.getTryCount() - 1) == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + player.getTryCount() + " попытки");
            return true;
        } else if (player.getNumber(player.getTryCount() - 1) > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return false;
    }

    private void printAllNumbers(Player player) {
        for (int i: player.getNumbers()) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}