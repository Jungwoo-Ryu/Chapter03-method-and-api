package com.ohgiraffers.section01.method;

public class Application07 {
    public static void main(String[] args) {
        // Goal. applying parameter and return value
        int first = 20;
        int second = 10;
        Application07 app7 = new Application07();
        System.out.println(app7.plusTwoNumbers(first, second));
        System.out.println(app7.minusTwoNumbers(first, second));
        System.out.println(app7.multipleTwoNumbers(first, second));
        System.out.println(app7.divideTwoNumbers(first, second));
    }

    /**
     * <pre>
     *     Hello World!
     * </pre>
     * @param first1 First variable
     *
     * @param second1 Second variable
     * @return the summation of two variables
     *
     * */
    public int plusTwoNumbers(int first1, int second1){
        return first1 + second1;
    }
    public int minusTwoNumbers(int first1, int second1){
        return first1 - second1;
    }
    public int multipleTwoNumbers(int first1, int second1){
        return first1 * second1;
    }
    public int divideTwoNumbers(int first1, int second1){
        return first1 / second1;
    }
}
