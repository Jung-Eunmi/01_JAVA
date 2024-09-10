package com.ohgiraffers.section01;

import java.util.Scanner;

public class Test0910 {

    public static void main(String[] args) {
        //키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
        //이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("학년 : ");
        int grade = sc.nextInt();
        System.out.print("반 : ");
        int classNum = sc.nextInt();
        System.out.print("성별 : ");
        char mOrF = sc.next().charAt(0);
        System.out.print("점수 : ");
        double score = sc.nextDouble();
        System.out.println();

        if(mOrF == 'M'){

            mOrF = '남';

        }else{
            mOrF = '여';
        }

        System.out.println(grade+"학년"+classNum+"반"+name+ " " +  mOrF+"의 성적은"+score+"입니다.");


    }

}
