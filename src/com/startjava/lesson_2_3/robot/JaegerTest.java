package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger mark1 = new Jaeger(2015, "Mark-1", false, "Japan", 280, 2.312, 5, 7, 4);
        Jaeger mark4 = new Jaeger(2018, "Mark-4", false, "China", 250, 1.722, 9, 8, 6);

        mark1.greet();
        mark1.saySpecification();
        mark1.fly();
        mark1.killKaiju();
        mark1.liftWeights();

        mark4.greet();
        mark4.saySpecification();
        mark4.fly();
        mark4.killKaiju();
        mark4.liftWeights();
    }
}