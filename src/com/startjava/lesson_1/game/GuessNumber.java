package com.startjava.lesson_1.game.GuessNumber;

public class GuessNumber {
    public static void main(String[] args) {
        int hiddenNumber = 50;
        int answer = 5;

        do {
            if(answer > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                answer--;
            } else if(answer < hiddenNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                answer++;
            }
        } while(answer != hiddenNumber);

        System.out.println("Поздравляю, число угадано!");
    }
}