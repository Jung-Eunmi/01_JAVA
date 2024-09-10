package com.ohgiraffers.section01.Test;

import java.util.Scanner;

public class MemberDTO {
    private String name;
    private int grade;
    private int classNum;
    private char mOfF;
    private double score;


    // 기본 생성자
    public MemberDTO() {
    }

    // 매개변수를 포함한 생성자
//    public MemberDTO(String name, int grade, int classNum, char mOfF, double score) {
//        this.name = name;
//        this.grade = grade;
//        this.classNum = classNum;
//        this.mOfF = mOfF;
//        this.score = score;
//    }

    //setter, getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public char getmOfF() {
        return mOfF;
    }

    public void setmOfF(char mOfF) {
        this.mOfF = mOfF;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // toString

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", classNum=" + classNum +
                ", mOfF=" + mOfF +
                ", score=" + score +
                '}';
    }
}
