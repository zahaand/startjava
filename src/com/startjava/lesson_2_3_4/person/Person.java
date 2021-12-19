package com.startjava.lesson_2_3_4.person;

public class Person {
    
    boolean sex = true;
    String name = "Andrey";
    int height = 198;
    int weight = 85;
    int age = 33;

    boolean walk() {
        System.out.println(name + " вышел на прогулку");
        return false;
    }

    boolean sit() {
        System.out.println(name + " решил присесть отдохнуть");
        return false;
    }

    boolean run() {
        System.out.println(name + " вышел на пробежку");
        return true;
    }

    String talk() {
        return "никаких bla bla bla";
    }

    boolean learnJava() {
        return true;
    }
}