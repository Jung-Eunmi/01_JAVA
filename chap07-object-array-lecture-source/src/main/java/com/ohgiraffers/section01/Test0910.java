package com.ohgiraffers.section01;

import java.util.Scanner;

public class Test0910 {

    public static void main(String[] args) {
        //문제 1 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
        //이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름 : ");
//        String name = sc.nextLine();
//        System.out.print("학년 : ");
//        int grade = sc.nextInt();
//        System.out.print("반 : ");
//        int classNum = sc.nextInt();
//        System.out.print("성별 : ");
//        char mOrF = sc.next().charAt(0);
//        System.out.print("점수 : ");
//        double score = sc.nextDouble();
//        System.out.println();
//
//        if(mOrF == 'M'){
//
//            mOrF = '남';
//
//        }else{
//            mOrF = '여';
//        }
//
//        System.out.println(grade+"학년"+classNum+"반"+name+ " " +  mOrF+"의 성적은"+score+"입니다.");

        //문제2 나이를 키보드로 입력 받아 어린이(13세 이하)인지,
        // 청소년(13세 초과 ~ 19세 이하)인지,
        // 성인(19세 초과)인지 출력하세요.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력해주세요 : ");
//        int age = sc.nextInt();
//
//        String a = (age>19)?"성인":(age>13 && age<=19)?"청소년":"어린이";
//        System.out.println(a);

        // 문제3 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
        //세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
        //세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
        //세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("국어 점수 : ");
//        int korean = sc.nextInt();
//        System.out.print("영어 점수 : ");
//        int english = sc.nextInt();
//        System.out.print("수학 점수 : ");
//        int math = sc.nextInt();
//
//        int average = ((korean+english+math)*3);
//
//        if(average>=60 && korean>=40&& math>=40&& english>=40){
//            System.out.println("합격");
//        }else {
//            System.out.println("불합격");
//        }
        // 문제 4 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
        //그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고 아니면 false를 출력하세요.
        //(단, num1은 num2보다 작아야 함)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫 번째 정수를 입력하세요 : ");
//        int num1 = sc.nextInt();
//        System.out.print("두 번째 정수를 입력하세요 : ");
//        int num2 = sc.nextInt();
//        System.out.print("값을 비교할 정수를 입력하세요 : ");
//        int no = sc.nextInt();
//
//        boolean a = (no<=num1 || no> num2)?true:false;
//        System.out.println(a);
        // 문제 5 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫 번째 정수를 입력하세요 : ");
//        int num1 = sc.nextInt();
//        System.out.print("두 번째 정수를 입력하세요 : ");
//        int num2 = sc.nextInt();
//        System.out.print("세 번째 정수를 입력하세요 : ");
//        int num3 = sc.nextInt();
//
//        boolean a = (num1==num2 && num2==num3)?true:false;
//        System.out.println(a);
        // 문제 6 A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
        // 인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
        //(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫 번째 정수를 입력하세요 : ");
//        int num1 = sc.nextInt();
//        System.out.print("두 번째 정수를 입력하세요 : ");
//        int num2 = sc.nextInt();
//        System.out.print("세 번째 정수를 입력하세요 : ");
//        int num3 = sc.nextInt();
//
//        int[] salary = {num1,num2,num3};
//        double peopleA = salary[0]+(salary[0]*0.4);
//        double peopleB = salary[1];
//        double peopleC = salary[2]+(salary[2]*0.15);
//
//
//        if(peopleA>=3000){
//            System.out.println("A사원의 연봉은 : " + peopleA +"이고, 3000 이상입니다.");
//        }else if (peopleB>=3000) {
//            System.out.println("B사원의 연봉은 : " + peopleB +"이고, 3000 이상입니다.");
//        }else if (peopleC>=3000) {
//            System.out.println("A사원의 연봉은 : " + peopleC +"이고, 3000 이상입니다.");
//        }else{
//            System.out.println("3000만원 이하입니다.");
//        }
//
//
//
//




    }

}
