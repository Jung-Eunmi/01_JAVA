package com.ohgiraffers.section01.method;

public class Test240829_1 {

    public static void main(String[] args) {
    int height = 170;
    int weight = 80;
    double signs = 1.5;

    Test240829_1 a1 = new Test240829_1();
    a1.iAm(height, weight, signs);

    }
    public void iAm(int height,int weight ,double signs) {
        System.out.println("저의 키는" + height +"이고, 몸무게는 " + weight + "이고, 시력은 " + signs + "이다.");
    }

}
