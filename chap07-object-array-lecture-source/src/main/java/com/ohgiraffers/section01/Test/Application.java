package com.ohgiraffers.section01.Test;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MemberDTO member = new MemberDTO();
        Scanner sc = new Scanner(System.in);
        System.out.print("이름:");
        String name = sc.nextLine();

        member.setName(name);
        member.setGrade(3);
        member.setClassNum(1);
        member.setmOfF('F');
        member.setScore(70.0);

        if(member.getmOfF()=='F'){
            System.out.println(member.getGrade()+"학년 "+ member.getClassNum()+"반 "+member.getName()+" 여학생이고, 점수는 "+member.getScore()+"입니다." );

        }else if(member.getmOfF()=='M'){
            System.out.println(member.getGrade()+"학년 "+ member.getClassNum()+"반 "+member.getName()+" 남학생이고, 점수는 "+member.getScore()+"입니다." );
        }

        Application app1 = new Application();
        app1.changeMemberName(member);








    }

    public void changeMemberName(MemberDTO member) {
        member.setName("문정현");

        System.out.println(member.getGrade()+"학년 "+ member.getClassNum()+"반 "+member.getName()+" 여학생이고, 점수는 "+member.getScore()+"입니다." );
    }


}
