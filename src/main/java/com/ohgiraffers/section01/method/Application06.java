package com.ohgiraffers.section01.method;

public class Application06 {
    // Goal. method return
    public static void main(String[] args) {
        System.out.println("main() running...");
        Application06 app6 = new Application06();
        String hi = app6.testMethod01();
        System.out.println(app6.testMethod01());
        System.out.println("main() ending...");

    }

    public String testMethod01(){
        return "Hello";
    }
}
