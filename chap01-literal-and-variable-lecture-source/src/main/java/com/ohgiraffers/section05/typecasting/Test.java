package com.ohgiraffers.section05.typecasting;

public class Test {

    public static void main(String[] args) {
        double a = 80.5;
        double b = 50.6;
        double c = 70.8;

        double sum1 = a + b + c;
        System.out.println("sum = " + sum1);
        double average1 = sum1 / 3;
        System.out.println("average1 = " + average1);

        int sum2 = (int)(a + b + c);
        System.out.println(" 총점 : " + sum2);
        int average2 = (sum2/3);
        System.out.println(" 평균 : " + average2);
        
        long sum3 = (long)(a + b + c);
        System.out.println("sum3 = " + sum3);
        long average3 = (sum3/3);
        System.out.println("average3 = " + average3);

        int elevator = 1000;
        int people = 76;

        int a1 = elevator/people;
        System.out.println(" 엘레베이터 수용 인원 = " + a1 + "명");
        double b1 = (double) elevator/13;
        System.out.println(" 엘레베이터에 탈 수 있는 13명 평균 몸무게 = " + b1 + "kg");

    }
}
