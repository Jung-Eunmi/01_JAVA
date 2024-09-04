package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Test240903 {
    //문제 1
    public void test1() {
        /* 1부터 10까지 합계를 구하고 결과를 출력하세요.
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55 */
        int sum = 0;

        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println("1 부터 10까지의 합 = " + sum);
    }

    //문제 2
    public void test2() {
        /* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요.
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         * -- 출력 예시 --
         * 1부터 5까지의 합 : 15 */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합 = " + sum);
    }

    //문제 3
    public void test3() {
        /* 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30 */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                sum += i;
            } else {
                continue;
            }

        }
        System.out.println("1부터 " + num + "까지의 짝수의 합 = " + sum);
    }

    //문제 4
    public void test4() {
        /* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.
         * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
         * -- 입력 예시 --
         * 문자열을 입력하세요 : apple
         * -- 출력 예시 --
         * 0 : a
         * 1 : p
         * 2 : p
         * 3 : l
         * 4 : e */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i + "번째 : " + ch);
        }
    }

    //문제 5
    public void test5() {
        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요.
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz */
        String str = "";

        for (char ch = 'a'; ch <= 'z'; ch++) {

            System.out.print(ch);

        }

    }

    //문제 6
    public void test6() {
        /* 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         * -- 출력 예시 --
         * 토마토마토 */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int cut = sc.nextInt();

        for (int i = 1; i <= cut; i++) {
            if (i % 2 == 0) {
                System.out.print("마");
            } else {
                System.out.print("토");
            }

        }

    }

    //문제 7
    public void test7() {
        /* 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별해서 출력하세요.
         * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다."를 출력하면 됩니다.
         * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 라고 출력 후
         * 정수를 다시 입력 받도록 하세요.
         * 참고) 소수란?
         * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
         * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다.
         * -- 입력 예시 --
         * 2보다 큰 정수를 하나 입력하세요 : 7
         * -- 출력 예시 --
         * 소수다.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("2보다 큰 정수를 입력해주세요 : ");
        int i = sc.nextInt();

        if (i > 2) {

            if (i % 2 != 0) {
                System.out.println("소수다");
            } else {
                System.out.println("소수가 아니다");
            }

        } else {
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
        }

    }

    //문제 8
    public void test8() {
        /* 1부터 100 사이의 난수를 발생시키고 // ㅇ
         * 정수를 입력 받아서 입력받은 정수가 발생한 난수보다 큰 경우 "입력하신 정수보다 큽니다."를,
         * 입력받은 정수보다 난수가 작은 경우 "입력하신 정수보다 작습니다."를 출력하며
         * 입력한 정수와 난수와 같은 경우가 될 때까지 난수 맞추기를 반복하는 프로그램을 만드세요.

         * 반복문을 종료시켜야 할 때는 -> random 난수와 내가 입력한 i 가 같으면 종료
         *
         * 단, 입력한 정수와 난수가 같은 경우 "정답입니다. n회 만에 정답을 맞추셨습니다."라고
         * 정답을 입력한 횟수도 함께 출력되도록 해야 합니다.
         * 첫 회부터 바로 난수를 맞추는 경우는 1회만에 정답을 맞춘 것입니다.
         *
         * 정답을 맞추는 경우 위 내용을 출력하고 프로그램이 종료되도록 작성하세요.
         *
         * -- 프로그램 예시 --
         * 정수를 입력하세요 : 5
         * 입력하신 정수보다 작습니다.
         * 정수를 입력하세요 : 3
         * 입력하신 정수보다 큽니다.
         * 정수를 입력하세요 : 4
         * 정답입니다. 3회만에 정답을 맞추셨습니다.
         *      *
         * int success = 1;
         * 만약 틀리게 되면 success + 1;
         *
         * i > random sout 난수가 입력한 정수보다 작습니다. success + 1
         * i < random sout 난수가 입력한 정수보다 큽니다. success
         *
         * */
        Scanner sc = new Scanner(System.in);

        int num;
        int random = (int) (Math.random() * 100) + 1;

        int success = 0;

        do {
            System.out.print("1~100까지 숫자를 입력하세요 : ");
            num = sc.nextInt();
            if (num > random) {
                System.out.println("입력한 정수가 난수보다 큽니다."+(success+= 1));
            } else if(num<random){
                System.out.println("입력한 정수가 난수보다 작습니다."+(success+=1));

            } else if(num == random){
                System.out.println("정답입니다."+ (success+1) +"회 만에 맞추셨습니다.");
            }
        } while (num != random);



    }
}