package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {
        //매개변수, 전달인자, 리턴
        /* title. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해할 수 있다. */

        /* comment.
        *   매개변수와 리턴값 복합 응용
        *   매개변수도 존재하고 리턴값도 존재하는 메소드를 이용해서 간단한 계산기 만들어보기
        * */

        /* comment.
         *  더하기 메소드, 빼기 메소드, 곱하기 메소드, 나누기 메소드
         *  해당하는 메소드들에게 2개의 정수를 넘겨 줄 것이다.
         *  */

        int frist = 20;
        int second = 10;
        Application7 app7 = new Application7();

        app7.plusTwoNumbers(frist , second);      // frist = 20;, second = 30; 라는 변수를 써준 것임
        System.out.println(app7.plusTwoNumbers(frist, second));

    }

    public int plusTwoNumbers(int frist, int second) {
        System.out.println("frist = " + frist);
        System.out.println("second = " + second);

        return frist + second;
    }
    public int minusTwoNumbers(int frist, int second) {
        return frist - second;
    }
    public int multiplyTwoNumbers(int frist, int second) {
        return frist * second;
    }
    public int divideTwoNumbers(int frist, int second) {
        return frist / second;
    }

}
