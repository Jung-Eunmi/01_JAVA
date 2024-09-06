package com.ohgiraffers.section03.test0905;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /*이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름 : ");
//        String name = sc.nextLine();
//        System.out.print("성별 : ");
//        String str = sc.nextLine();
//        System.out.print("나이 : ");
//        int age = sc.nextInt();
//        System.out.print("키 : ");
//        double height = sc.nextDouble();
//
//        System.out.print("키 " + height + "cm인 "+ age + "살 "+ str + name + "입니다.");

        /*키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫 번째 숫자 입력 : ");
//        int first = sc.nextInt();
//        System.out.print("두 번째 숫자 입력 : ");
//        int second = sc.nextInt();
//
//        System.out.println(first+" + "+second+" = "+(first+second));
//        System.out.println(first+" - "+second+" = "+(first-second));
//        System.out.println(first+" * "+second+" = "+(first*second));
//        System.out.println(first+" / "+second+" = "+(first/second));

        /*키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
        계산 공식 ) 면적 : 가로 * 세로
        둘레 : (가로 + 세로) * 2*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("가로 : ");
//        double width = sc.nextDouble();
//        System.out.print("세로 : ");
//        double length = sc.nextDouble();
//
//        System.out.println("면적 : "+ (width * length));
//        System.out.println("둘레 : "+ (width + length)*2);

        Scanner sc = new Scanner(System.in);
        System.out.print("아무문자나 입력 : ");
        String str = sc.nextLine();

        for(int i = 0; i<str.length(); i++){
        System.out.println((i+1)+"문자 : " + str.charAt(i));}






    }



}
