package com.ohgiraffers.section03.math;

public class Application02 {
    public static void main(String[] args) {
        //Chapter. 1. 0 ~ 9 random number generator

        int random1 = (int) (Math.random() * 10);
        System.out.println(random1);

        //Chapter. 2. 1 ~ 10 random generator

        random1 = (int) (Math.random() * 10) + 1;
        System.out.println("1 ~ 10 : "+random1);
        //Chapter. 3. 10 ~ 15 random generator
        random1 = (int) (Math.random() * 6) + 10;
        System.out.println("10~15 : " + random1);
        //Chapter. 4. -128 ~ 127 random generator
        random1 = (int) (Math.random() * 256) -128;
        System.out.println("-128~127 : " + random1);
        int x = 10;

    }
}
