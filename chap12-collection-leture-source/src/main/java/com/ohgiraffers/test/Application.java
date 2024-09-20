package com.ohgiraffers.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* comment.
         *   요구사항
         *   1. 클래스는 Application, BookDTO 클래스로 구성한다.
         *   2. Application 클래스는 main 메소드를 포함한다.
         *   3. BookDTO 클래스는 책과 관련 된 데이터를 모아둔다.
         *   4. BookDTO 클래스는 책 번호, 책 이름, 책 저자, 책 가격을 관리한다.
         *   5. BookDTO 를 사용해서 총 다섯 권의 책을 관리 할 것이며
         *      4권의 책은 BookDTO 클래스의 매개변수 있는 생성자로 만들 것이다.
         *   6. 나머지 책 한 권은 Scanner 객체를 사용해서 우리가 입력한 값으로
         *      2번째 인덱스에 추가를 할 것이다.
         *  */

        /* comment.
         *   출력 예시
         *   1. Application 에서는 ArrayList 를 만들어 4권의 책을 넣고
         *   출력하는 구문을 작성하라.
         *   2. 4권의 출력하는 구문은 for 문 과 향상된 for 문 두 가지를 사용하라.
         *   3. 출력 후 Scanner 객체를 사용해 입력한 값을 ArrayList 에 넣어 출력하라.
         *  */
        
        List<BookDTO> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("책번호를 입력 : ");
        int no = sc.nextInt();
        sc.nextLine();
        System.out.print("책이름을 입력 : ");
        String str1 = sc.nextLine();
        System.out.print("책저자를 입력 : ");
        String str2 = sc.nextLine();
        System.out.print("책가격을 입력 : ");
        int price1 = sc.nextInt();

        list.add(new BookDTO(1,"book1","author1",10000));
        list.add(new BookDTO(2,"book2","author2",20000));
        list.add(new BookDTO(4,"book4","author4",40000));
        list.add(new BookDTO(5,"book5","author5",50000));

        list.add(2,new BookDTO(no,str1,str2,price1));

        for (int i = 0; i<list.size(); i++){
            System.out.println(i + " : " + list.get(i));
        }

    }

}
