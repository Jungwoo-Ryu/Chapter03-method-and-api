package com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {
        // Goal. getting more arguments
        Application04 app4 = new Application04();
        app4.testMethod("Ken", 24, 'M');
    }
    public void testMethod(String name, int age, final char gender){
        System.out.println("My name is " + name + ". I am " + age + " years old. I am " + gender + '.');
    }
}
