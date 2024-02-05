package com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {
        // Goal. intermediate method
        // Chapter. 1. build methodA(), methodB(), methodC()
        // Chapter. 2. print those methods
        // Chapter. 3. print main method

        System.out.println("main() starting...");

        Application02 app2 = new Application02();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() ending...");
    }
    public void methodA(){
        System.out.println("methodA() running");
        System.out.println("methodA() ending");
    }

    public void methodB(){

        System.out.println("methodB() running");
        System.out.println("methodB() ending");
    }

    public void methodC(){

        System.out.println("methodC() running");
        System.out.println("methodC() ending");
    }
}
