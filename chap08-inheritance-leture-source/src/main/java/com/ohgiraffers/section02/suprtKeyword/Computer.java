package com.ohgiraffers.section02.suprtKeyword;

import java.time.LocalDateTime;

public class Computer extends Product {

    private String cpu;             // cpu
    private int hdd;
    private int ram;
    private String os;              // 운영체제


    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출됨...");
    }

    public Computer(String code, String brand, String name, int price, LocalDateTime manufacturingDate, String cpu, int hdd, int ram, String os) {

        /* comment. 부모의 모든 필드를 초기화하는 생성자로 값 전달*/
        super(code, brand, name, price, manufacturingDate);

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        System.out.println("Computer 클래스의 부모 필드도 같이 초기화 하는 생성자 호출함...");
    }
}
