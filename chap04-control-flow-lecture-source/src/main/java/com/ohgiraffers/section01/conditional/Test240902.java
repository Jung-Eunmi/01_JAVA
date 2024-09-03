package com.ohgiraffers.section01.conditional;

import java.util.Random;
import java.util.Scanner;

public class Test240902 {

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
    //문제1
    public void test1() {

        Scanner sc = new Scanner(System.in);
        System.out.print("나이가 어떻게 되세요? : ");
        int age = sc.nextInt();

        if(age>20) {
            System.out.println("판매 가능합니다.");
        }else {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        }
    }
    //문제2
    public void test2() {

        Scanner sc = new Scanner(System.in);
        System.out.print("짝홀, 그 결과는 ? ");
        int acornNumber = sc.nextInt();

        if(acornNumber % 2 == 0){
            System.out.println("짝수입니다~!");
        }else {
            System.out.println("홀수입니다~!");
        }
    }
    //문제3
    public void test3() {

        Scanner sc = new Scanner(System.in);
        System.out.print("당첨 번호가 어떻게 되세요? ");
        int number = sc.nextInt();

        if(number>0 && number<10 ){
            if (number % 2 ==0){
                System.out.println("짝수네요, 모자 선물입니다!");
            }
            if (number % 2 !=0){
                System.out.println("홀수네요, 인형 선물입니다!");
            }
        }else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        }

    }
    //문제4
    public void test4() {

        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력해주세요(m) : ");
        double height = sc.nextDouble();
        System.out.print("몸무게를 입력해주세요(kg) : ");
        double weight = sc.nextDouble();
        double bmi = weight/(height*height);

        if(bmi>20){
            if(bmi>=30){
                System.out.println("댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
            }if (bmi<30 && bmi>=25){
                System.out.println("축제에서 10,000보를 걷고 오시면 상품을 드려요!");
            }if (bmi<25){
                System.out.println("정상 체중입니다. 축제 재미있게 즐기세요~");
            }
        }else {
            System.out.println("저체중입니다. 축제 음식을 왕창 드세요!");
        }

    }
    //문제5
    public void test5() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하시오 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력하시오 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호를 입력하시오 : ");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
            default :
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.\" 출력 후 프로그램을 종료합니다.");
                break;
        }
        System.out.println(first+" "+op+" "+second+" = "+result);
    }
    //문제6
    public void test6() {

        Scanner sc = new Scanner(System.in);
        System.out.print("어떤 간식을 주문하시겠어요? : ");
        String snack = sc.nextLine();

        int price = 0;
        switch (snack) {
            case "k":
                System.out.println("어떤 간식을 주문하시겠어요? 카라멜팝콘");
                price = 15500;
                break;
            case "c":
                System.out.println("어떤 간식을 주문하시겠어요? 츄로스");
                price = 3000;
                break;
            case "p":
                System.out.println("어떤 간식을 주문하시겠어요? 통감자");
                price = 2000;
                break;
            case "d":
                System.out.println("어떤 간식을 주문하시겠어요? 도토리탕후루");
                price = 5000;
                break;
            default:
                System.out.println("해당 상품이 판매하지 않습니다.");
                break;
        }
        System.out.println(snack+"의 가격은 "+price+"원 입니다.");
    }
    //문제7

    public void test7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("성실 점수 : ");
        int sincerity = sc.nextInt();
        System.out.print("서비스 점수 : ");
        int service = sc.nextInt();
        System.out.print("미소 점수 : ");
        int smile = sc.nextInt();

        int average = (sincerity + service + smile) / 3;

        if (average >= 60 && sincerity >= 40 && service >= 40 && smile >= 40) {
            System.out.println("합격입니다.");
        } else if (sincerity < 40) {
            System.out.println("성실 항목의 점수 미달로 불합격 입니다.");
        } else if (service < 40) {
            System.out.println("서비스 항목의 점수 미달로 불합격 입니다.");
        } else if (smile < 40) {
            System.out.println("미소 항목의 점수 미달로 불합격 입니다.");
        } else {
            System.out.println("평균 점수 미달로 불합격입니다.");
        }

    }

    }
