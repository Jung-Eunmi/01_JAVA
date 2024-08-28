package com.ohgiraffers.section04.comparison;

public class Test240827 {

    public static void main(String[] args) {

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
