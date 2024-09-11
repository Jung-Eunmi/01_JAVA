package com.ohgiraffers.section01.Test;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //        *   1. 필요한 객체 도출
        //        *    -> 플레이어(사용자), 카레이서, 자동차
        //        *   2. 객체간의 상호작용
        //        *    -> 카레이서가 수신할 수 있는 메세지(카레이서가 해야 할 일)
        //        *       1. 시동을 걸어라
        //        *       2. 엑셀을 밟아라
        //        *       3. 브레이크를 밟아라
        //        *       4. 시동을 꺼라
        //        *    -> 자동차가 수신할 수 있는 메세지(자동차가 해야 할 일)
        //        *       1. 시동을 걸어라
        //        *       2. 앞으로 가라
        //        *       3. 멈춰라
        //        *       4. 시동을 꺼라
        Scanner sc = new Scanner(System.in);
        Caracer caracer = new Caracer();

        while (true){

            System.out.println("1. 시동키기");
            System.out.println("2. 엑셀밟기");
            System.out.println("3. 브레이크밟기");
            System.out.println("4. 시동끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("입력할 값은 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:caracer.on();
                    break;
                case 2:caracer.accelator();
                    break;
                case 3:caracer.breakor();
                    break;
                case 4:caracer.off();
                    break;
                case 9:
                    System.out.println("프로그램 종료됩니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
                    return;
            }



         if(no==9){
             break;
         }

        }


    }

}
