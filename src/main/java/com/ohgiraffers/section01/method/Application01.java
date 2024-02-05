package com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args) {
        // Goal. Calling methods
        System.out.println("main() method running...");
        Application01 a1 = new Application01();
        a1.methodA();
//        a1.methodB();


        System.out.println("main() method ending...");
    }
    public void methodA() {
        System.out.println("methodA() running");
        methodB();
        System.out.println("methodA() ending");
    }

    public void methodB() {
        System.out.println("methodB() running");
        methodA();
        System.out.println("methodB() ending");
    }
}
