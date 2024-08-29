package com.ohgiraffers.section01.method;

public class TestApplication {

    public static void main(String[] args) {

        int frist = 10;
        int second = 20;
        int third = 5;

        TestCalculator calc = new TestCalculator();
        int sum = calc.sumTwoNumber(frist,second);
        System.out.println("10과 20의 합 : " + sum);

        int min = calc.minusTwoNumber(frist,third);
        System.out.println("10과 5의 차 : " + min);

        int mul = calc.multiTwoNumber(frist,third);
        System.out.println("10과 5의 곱 : " + mul);

        int div = calc.divideTwoNumber(frist,third);
        System.out.println("10과 5의 나눈 후 몫 : " + div);

    }

    }
