package com.startjava.lesson_2_3_4.game;

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
        return numbers;
    }

    public int getNumbers(int index) {
        return numbers[index];
    }

    public void setNumbers(int index, int value) {
        this.numbers[index] = value;
    }
}