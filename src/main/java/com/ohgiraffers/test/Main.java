package com.ohgiraffers.test;

class Main{
    public static void main(String[] args){
        int radius =  54321; // 반지름이 123456일때
        method(radius);
    }
    public static void method(int radius){
        System.out.println((long)(radius*radius*Math.PI));
    }
}
