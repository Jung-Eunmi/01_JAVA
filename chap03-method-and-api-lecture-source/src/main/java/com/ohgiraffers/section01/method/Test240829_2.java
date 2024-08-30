package com.ohgiraffers.section01.method;

public class Test240829_2 {

    public static void main(String[] args) {

        //mothod에 이름을 String, 줄번호,국어, 영어, 수학 점수를 int 매개변수로 입력 받아 출력하고
        //return을 이용하여 줄번호를 하나씩 올려보자
        //결과화면 예시
        //1.이승현 국어: 50 영어: 66 수학: 74
        //2.정은미 국어: 37 영어: 67 수학: 73
        //3.문정현 국어: 85 영어: 85 수학: 82
        //4.윤이정 국어: 61 영어: 34 수학: 89
        //5.박재민 국어: 66 영어: 88 수학: 99
        //6.김경훈 국어: 97 영어: 100 수학: 24
        //7.조평훈 국어: 0 영어: 0 수학: 0

        int lineNum=1;
        
        Test240829_2 test = new Test240829_2();
        System.out.print(lineNum+".");
        test.stuScore("이승현",50,66,74);
       


    }
    public void stuScore (String name,int lanScore,int engScore,int mathScore){
        System.out.println(name+" 국어:"+lanScore+"  영어:"+engScore+"  수학:"+mathScore);
    }




}
