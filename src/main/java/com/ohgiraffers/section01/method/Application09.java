package com.ohgiraffers.section01.method;

public class Application09 {
    public static void main(String[] args) {
        // Goal. calling method from different class

        int first = 100;
        int second = 50;
        Calculator calc = new Calculator();
        System.out.println("min : " + calc.minNumberOf(first,second));


        // Goal. calling static method
        int max = Calculator.maxNumberOf(first, second);
        System.out.println("max : " + max);
    }
}
