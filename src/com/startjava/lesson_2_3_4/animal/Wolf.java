package com.startjava.lesson_2_3_4.animal;

public class Wolf {
    
    private boolean sex;
    private String name;
    private int weight;
    private int age;
    private String color;

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean walk() {
        System.out.println("Идёт");
        return false;
    }

    public boolean sit() {
        System.out.println("Сидит");
        return false;
    }

    public boolean run() {
        System.out.println("Бежит");
        return true;
    }

    public String howl() {
        System.out.println("Воет");
        return "Boo-ooo-ooo!";
    }

    public Boolean hunt() {
        System.out.println("Охотится");
        return true;
    }
}