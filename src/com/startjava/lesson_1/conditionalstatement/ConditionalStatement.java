package com.startjava.lesson_1.conditionalstatement;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 33;
        if(age > 20) {
            System.out.println("Взрослый");
        }

        boolean male = true;
        if(male) {
            System.out.println("Мужик");
        }

        if(!male) {
            System.out.println("Прекрасная дама");
        }

        double height = 1.98;
        if(height < 1.80) {
            System.out.println("Невысокий");
        } else {
            System.out.println("Высокий");
        }

        char firstLetterOfName = 'A';
        if(firstLetterOfName == 'M') {
            System.out.println("Миша или Маша");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Иван или Ира");
        } else {
            System.out.println("И всё-таки это Андрей!");
        }
    }
}