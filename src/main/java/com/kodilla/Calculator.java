package com.kodilla;

public class Calculator {

    public long addAToB(int a, int b) {
        return a + b;
    }

    public long substractAFromB(int a, int b){
        return b - a;
    }

    public static void main (String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.addAToB(5, 4));
        System.out.println(calculator.substractAFromB(8,2));
    }
}
