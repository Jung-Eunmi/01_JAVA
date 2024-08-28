package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {

        /* title. 논리연산자의 우선순위에 대해 이해하고 활용해보자. */

        /* comment.
         *  논리 연산자의 우선순위와 활용
         *  논리 and 연산자와 논리 or 연산자의 우선순위
         *  && : 11순위 (||보다 먼저 연산됨)
         *  || : 12순위
         * */

        /* index 1. 1부터 100 사이의 값인지 확인 */
        int num1 = 55;
        System.out.println("num1 이 1부터 100 사이인 지 확인 : " + (num1 >= 1 && num1 <= 100));

        /* index 2. 영어 대문자인지 확인 */
        char ch1 = 'G';  // 문자는 내부적으로 숫자이다. (대소비교가 가능하다.)
        System.out.println("ch1 이 영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        System.out.println("==============번외==============");
        /* 번외 */
        // 'a' 는 'A' 보다 클까? -> 구글링 하지말고 형변환해보기
        char aTest = 'a';
        char ATest = 'A';

        int aToInt = aTest;
        int AToInt = ATest;
        System.out.println("aToInt = " + aToInt);
        System.out.println("AToInt = " + AToInt);

        /* index 3. 'f' 대소문자 상관 없이 영어인지 확인 */
        // f는 a ~ z 사이 이거나, A ~ Z 사이면 되지않을까???
        char ch2 = 'f';
        System.out.println("chf 가 영문자인지 확인 : " + ((ch2>= 'A' && ch2<='Z') || (ch2>='a' && ch2<='z')));

    }
}
