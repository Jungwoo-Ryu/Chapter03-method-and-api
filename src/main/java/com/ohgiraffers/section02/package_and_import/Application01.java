package com.ohgiraffers.section02.package_and_import;

public class Application01 {
    public static void main(String[] args) {
        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(1,2);
    }
}
