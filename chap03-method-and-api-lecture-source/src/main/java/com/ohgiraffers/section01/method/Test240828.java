package com.ohgiraffers.section01.method;

public class Test240828 {

    public static void main(String[] args) {

        String hello = "님 안녕하세요?";
        Test240828 test = new Test240828();
        test.methodA();
        System.out.println(hello);
        test.methodB();
        test.methodE();
        test.methodC();
        test.methodE();
        test.methodD();
        test.methodE();
    }
    public void methodA() {
        System.out.print("은미");
    }
    public void methodB() {
        System.out.print("정현");
    }
    public void methodC() {
        System.out.print("승현");
    }
    public void methodD() {
        System.out.print("이정");
    }
    public void methodE() {
        System.out.println("님 안녕하세요?");
    }
}
