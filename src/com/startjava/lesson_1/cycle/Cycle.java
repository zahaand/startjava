package com.startjava.lesson_1.cycle;

public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int counter = -6;
        while(counter <= 6) {
            System.out.println(counter);
            counter += 2;
        }

        int j = 10;
        int sum = 0;
        do {
            if(j % 2 != 0) {
                sum += j;
            }
            j++;
        } while(j <= 20);
        System.out.println(sum);
    }
}