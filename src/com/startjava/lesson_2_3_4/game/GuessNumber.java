package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Random random = new Random();

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int randomNumber = random.nextInt(100 + 1);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Начало игры! У каждого игрока по 10 попыток!");
        int try1 = 0;
        int try2 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Игрок 1 введите число: ");
            player1.numbers[i] = scanner.nextInt();
            scanner.nextLine();
            try1++;

            if (player1.numbers[i] == randomNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + randomNumber + " с " + (i + 1) + " попытки");
                break;
            } else if (player1.numbers[i] > randomNumber) {
                System.out.println("Игрок 1: Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Игрок 1: Данное число меньше того, что загадал компьютер");
            }

            if (i == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }

            System.out.print("Игрок 2 введите число: ");
            player2.numbers[i] = scanner.nextInt();
            scanner.nextLine();
            try2++;

            if (player2.numbers[i] == randomNumber) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + randomNumber + " с " + (i + 1) + " попытки");
                break;
            } else if (player2.numbers[i] > randomNumber) {
                System.out.println("Игрок 2: Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Игрок 2: Данное число меньше того, что загадал компьютер");
            }

            if (i == 9) {
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
        }
        System.out.println("Варианты ответов игрока " + player1.getName() + " " + Arrays.toString(Arrays.copyOfRange(player1.numbers, 0, try1)));
        System.out.println("Варианты ответов игрока " + player2.getName() + " " + Arrays.toString(Arrays.copyOfRange(player2.numbers, 0, try2)));

        Arrays.fill(player1.numbers, 0, try1, 0);
        Arrays.fill(player2.numbers, 0, try2, 0);
    }
}