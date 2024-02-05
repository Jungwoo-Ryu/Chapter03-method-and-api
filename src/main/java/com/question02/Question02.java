package com.question02;

public class Question02 {
    public static void main(String[] args) {

        /* Application01
         * 문자형 변수를 하나 선언 후 'a'를 대입한 후
         * 출력은 문자 'a'가 가지는 유니코드값을 출력하도록 하세요
         *
         * -- 출력 예시 --
         * 문자 a의 unicode : 97
         * */
        char x = 'a';
        System.out.println((int)x);

        /* Application02
         * 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */
        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;
        System.out.println("Total: " + (int)(korean + math + english));
        System.out.println("Average: " + (int)(korean + math + english)/3);
    }
}
