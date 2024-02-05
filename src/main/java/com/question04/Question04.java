package com.question04;

public class Question04 {
    public static void main(String[] args) {


        /* Application01 */
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        System.out.println(y >= 5 || x < 0 && x > 2); // true
        System.out.println(y += 10 - x++);            // 13
        System.out.println(x += 2);                     // 5
        System.out.println(!('A' <= c && c <= 'Z')); // false
        System.out.println('C' - c);                    // 2
        System.out.println('5' - '0');                  // 5
        System.out.println(c + 1);                      // 66
        System.out.println(++c);                      // 'B'
        System.out.println(c++);                      // 'B'
        System.out.println(c);                        // 'C'

        //System.out.println() 의 결과를 예측하고 이유를 설명하시오.



        /* Application02
         *
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오.
         *
         * int numOfApples = 92;
         * int sizeOfBucket = 10;
         * int numOfBucket = ?
         *
         * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
         */
        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = (numOfApples%sizeOfBucket > 0)? numOfApples/sizeOfBucket + 1 : numOfApples/sizeOfBucket;
        System.out.println(numOfBucket);
    }
}
