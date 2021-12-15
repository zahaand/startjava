package com.startjava.lesson_2_3.game;

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
        int randomNumber = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;

        while(true) {
            System.out.println("Игрок 1 введите число:");
            player1.setNumber(scanner.nextInt());
            number1 = player1.getNumber();
            scanner.nextLine();

            if (number1 == randomNumber) {
                System.out.println("Победил Игрок 1!");
                break;
            } else if (number1 > randomNumber) {
                System.out.println("Игрок 1: Данное число больше того, что загадал компьютер");
            } else if (number1 < randomNumber) {
                System.out.println("Игрок 1: Данное число меньше того, что загадал компьютер");
            }

            System.out.println("Игрок 2 введите число:");
            player2.setNumber(scanner.nextInt());
            number2 = player2.getNumber();
            scanner.nextLine();

            if (number2 == randomNumber) {
                System.out.println("Победил Игрок 2!");
                break;
            } else if (number2 > randomNumber) {
                System.out.println("Игрок 2: Данное число больше того, что загадал компьютер");
            } else if (number2 < randomNumber) {
                System.out.println("Игрок 2: Данное число меньше того, что загадал компьютер");
            }
        }
    }
}