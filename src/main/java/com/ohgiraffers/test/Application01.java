package com.ohgiraffers.test;

public class Application01 {
    public static void main(String[] args) {
        System.out.println("main running...");
        Application01 app1 = new Application01();
        app1.testMethod01();
        System.out.println("main ending...");
    }

    public void testMethod01(){
        System.out.println("testMethod01 running...");
        testMethod02();
        System.out.println("testMethod01 ending...");
    }

    public void testMethod02(){
        System.out.println("testMethod02 running...");
        System.out.println("testMethod02 ending...");
    }
}
