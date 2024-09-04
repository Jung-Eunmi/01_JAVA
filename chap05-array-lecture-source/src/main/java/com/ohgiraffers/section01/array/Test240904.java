package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test240904 {

    public static void main(String[] args) {

        //문제 1
        int[] iarr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr [" + i + "] :" + iarr[i]);


            //문제 2
            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력 : ");
            int num = sc.nextInt();

            if (num <= 4 && num >= 0) {
                String[] sarr = {"딸기", "바나나", "복숭아", "키위", "사과"};
                System.out.println(sarr[num]);

            } else {
                System.out.println("준비된 과일이 없습니다.");
            }


        }

    }
}


