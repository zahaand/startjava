package com.startjava.lesson_2_3_4.game;

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
        initGame();
        System.out.println("Начало игры! У каждого игрока по 10 попыток!");

        for (int i = 0; i < 10; i++) {
            if (makeMove(player1)) {
                break;
            }

            if (makeMove(player2)) {
                break;
            }
        }

        printAllNumbers(player1);
        printAllNumbers(player2);
    }

    private void initGame() {
        player1.fill();
        player2.fill();
        player1.setTryCount(0);
        player2.setTryCount(0);
        randomNumber = random.nextInt(100 + 1);
    }

    private boolean makeMove(Player player) {
        player.setNumber(inputNumber(player));
        player.setTryCount(player.getTryCount() + 1);

        if (checkNumber(player)) {
            return true;
        }

        if (player.getTryCount() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private int inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        return scanner.nextInt();
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + (player.getTryCount()) + " попытки");
            return true;
        } else if (player.getNumber() > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return false;
    }

    private void printAllNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}