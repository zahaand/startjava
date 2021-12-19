package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    
    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();
        firstWolf.setSex(true);
        firstWolf.setName("First");
        firstWolf.setWeight(100);
        firstWolf.setAge(10);
        firstWolf.setColor("Black");

        if (firstWolf.isSex()) {
            System.out.println("Это волк!");
        } else {
            System.out.println("Это волчица!");
        }

        System.out.println("Кличка волка - " + firstWolf.getName());
        System.out.println("Вес волка - " + firstWolf.getWeight() + " кг.");
        System.out.println("Возраст волка - " + firstWolf.getAge() + " лет");
        System.out.println("Цвет волка - " + firstWolf.getColor());

        firstWolf.walk();
        firstWolf.sit();
        firstWolf.run();
        firstWolf.howl();
        firstWolf.hunt();
    }
}