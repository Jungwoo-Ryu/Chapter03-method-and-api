package com.question03;

public class question03 {
    public static void main(String[] args) {

        /* 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
        만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다. (1)에 알맞은 코드를 넣으시오.
        public static void main(String[] args) {
         */
		int num = 456;
        System.out.println(num/100 * 100);

        /* 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다.
        (1)에 알맞은 코드를 넣으시오.
        public static void main(String[] args) {


         */
		 num = 333;
		System.out.println(num/100 * 100 + 1);



    }


}
