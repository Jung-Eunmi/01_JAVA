package com.ohgiraffers.section04.comparison;

public class Application {

    public static void main(String[] args) {

        /* title. 비교연산자에 대해 이해하고 활용할 수 있다. */

        /* comment.
        *   비교연산자
        *   비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        *   연산자 중 참 혹은 거짓을 반환하는 연산자는 조건식이나 조건문의 조건절에 많이 사용된다.(충분한 연습 필요)
        * */

        /* comment.
        *   비교연산자의 종류
        *   '=='(같냐?) : 왼쪽 피연산자와 오른쪽 피연산자가 같으면 true, 다르면 false
        *   '!='(안같냐?) : 왼쪽 피연산자와 오른쪽 피연산자가 다르면 true, 같으면 false
        *     - ! -> 부정이다.
        *   '>' : 왼쪽 피연산자가 오른쪽 피연산자 보다 크면 true, 아니면 false
        *   '>=' : 왼쪽 피연산자가 오른쪽 피연산자 보다 크거나 같으면 true, 아니면 false
        *   '<' : 오른쪽 피연산자가 왼쪽 피연산자 보다 크면 true, 아니면 false
        *   '<=' ; 오른쪽 피연산자가 왼쪽 피연산자 보다 크거나 같으면 true, 아니면 false
        * */

        /* index 1. 숫자값 비교 */
        int num1 = 10;
        int num2 = 20;

        System.out.println("================ 정수값 비교 ================");
        System.out.println("num1 과 num2 가 같은지 비교 : " + (num1 == num2));
        System.out.println("num1 과 num2 가 같지 않은지 비교 : " + (num1 != num2));
        System.out.println("num1 이 num2 보다 큰지 비교 : " + (num1 > num2));
        System.out.println("num1 이 num2 보다 작은지 비교 : " + (num1 < num2));
        System.out.println("num1 이 num2 보다 크거나 같은지 비교 : " + (num1 >= num2));
        System.out.println("num1 이 num2 보다 작거나 같은지 비교 : " + (num1 <= num2));
        //실수도 동일함

        /* index 2. 문자값 비교 */
        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println("================ 문자값 비교 ================");

        // ==, != 이건 가능하지 않을까?
        // > , < 이건 가능할까?
        System.out.println("ch1 > ch2 : " + (ch1 > ch2));
        // comment. 문자는 내부적으로 숫자로 처리가 되기 때문에 대소비교가 가능하다.

        /* index 3. 문자열값 비교 */
        String str1 = "조평훈";
        String str2 = "조평훈";
        // comment. 문자열은 == , != 는 가능하지만, 대소 비교는 불가능하다.
        System.out.println("================ 문자열값 비교 ================");
        System.out.println("str1 과 str2 가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1 과 str2 가 다른지 비교 : " + (str1 != str2));
//        System.out.println("str1 과 str2 가 다른지 비교 : " + (str1 >= str2));

        //<팀문제1>
        /*1000kg 수용 가능한 엘리베이터에 76kg인 사람 몇 명이 탈 수 있는가?
          같은 엘리베이터에 13명이 탄다면 평균 몸무게는? (실수로 출력)
         */

        int elevator = 1000;
        int weight1 = 76;

        int a = elevator / weight1;
        System.out.println(" 엘리베이터 수용 가능한 인원 : " + a + "명");
        double b = (double) elevator / 13;
        System.out.println(" 13명의 평균 몸무게 : " + b + "kg");
        System.out.println("=====================절개선=====================");

        //<팀문제2>
        /*8/27 급식에서 비엔나 소세지를 한명당 6개씩 나눠주고 있다.
          현재 67번째 학생이 받아갔다면 현재까지 소세지 소비량과, 다음 학생을 호출해보자.
         */
        int human = 67;

        int consumption = human * 6;
        System.out.println("소세지의 소비량은 : " + consumption + "개 입니다.");
        ++human;
        System.out.println("다음학생은 : = " + human + "번째 사람입니다.");

        int sg  = 6;
        int std = 67;

        System.out.println("소세지 소비량 : " + (std++ * sg));
//        std++;
        System.out.println("다음 학생은 " + std + "번째 학생입니다.");
        System.out.println("=====================절개선=====================");

        //<팀문제3>
        /*
        정현님의 체중은 55.5kg 이고 키는 160cm입니다.
         BMI를 계산하는 코드를 작성하세요.

        -BMI(체질량지수) = 체중(kg) / (키(m)의 제곱)  ※ 키의 단위 확인
           출력은 정현님의 BMI는 ? 입니다. 로 출력해주세요. */

        // 키와 체중 변수 선언
        double weight = 55.5;       //kg
           int heightCm = 160;         //cm

        // BMI 계산식
        double heightM = (double)heightCm/100;      // 단위 m로 변경식
        double bmi = weight/(heightM*heightM);      // bmi 계산식
        System.out.println("정현님의 BMI는 " + bmi + "입니다.");
    }
}
