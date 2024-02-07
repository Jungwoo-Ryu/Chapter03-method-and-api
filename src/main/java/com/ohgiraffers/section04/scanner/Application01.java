package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        // Goal. java.util.Scanner
        // Chapter. 1. Scanner initialization
        Scanner sc = new Scanner(System.in);
        // Chapter. 2. getting a line
        System.out.print("name : ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);

        // Chapter. 2-1. getting an int

        System.out.print("age : ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        System.out.print("boolean: ");
        boolean x = sc.nextBoolean();
        System.out.println("Boolean is " + x);

        System.out.print("random: ");
        sc.nextLine();
        String y = sc.nextLine();
        System.out.println("random is " + y);
    }
}
