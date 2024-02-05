package com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {
        // Chapter. 1. Argument
        Application03 app3 = new Application03();
        app3.testMethod(20);

        // Chapter. 2. using field
        int age = 40;
        app3.testMethod(age);
    }
    public void testMethod(int age){
        System.out.println("Your are " + age + " years old.");
    }
}
