package com.startjava.lesson_2_3.calculator;

public class Calculator {
private int firstNumber;
    private int secondNumber;
    private char operation;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        switch(operation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '^':
                pow();
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.println("Incorrect arithmetic operation!\nTry again!");
        }
    }

    private void pow() {
        int result = 1;
            for(int i = 0; i < secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println(result);
    }
}