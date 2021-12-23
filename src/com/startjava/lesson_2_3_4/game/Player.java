package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private int tryCount;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void setTryCount(int tryCount) {
        this.tryCount = tryCount;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, tryCount);
    }

    public int getNumber() {
        return numbers[tryCount];
    }

    public void setNumber(int index, int number) {
        numbers[index] = number;
    }

    public void fill() {
        Arrays.fill(numbers, 0, tryCount, 0);
    }
}