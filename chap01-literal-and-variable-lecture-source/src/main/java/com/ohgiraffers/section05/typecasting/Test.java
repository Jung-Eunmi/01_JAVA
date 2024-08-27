package com.ohgiraffers.section05.typecasting;

public class Test {

    public static void main(String[] args) {
        double a = 80.5;
        double b = 50.6;
        double c = 70.8;

        int sum = (int)(a + b + c);
        System.out.println(" 총점 : " + sum);
        int average = (int)((a + b + c)/3);
        System.out.println(" 평균 : " + average);

    }
}
