package com.ohgiraffers.section01.conditional;

import java.util.Random;
import java.util.Scanner;

public class Test {

    public void diet(){

        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게를 입력하세요 : ");
        int num = sc.nextInt();
        Random random = new Random();
        int chicken = random.nextInt(2);

        if(num>70) {
            System.out.println("샐러드를 먹어야겠다.");
        }
        else{
            if(chicken == 0) {
                System.out.println("치킨을 먹어야겠다.");

            }
            else {
                System.out.println("라면을 먹어야겠다.");
            }
        }

    }

}
