package com.ohgiraffers.test;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    // 기본 생성자
    public BookMenu() {}

    public void mainMenu() {
        //*** 도서 관리 프로그램 ***
        BookManager bookManager = new BookManager();

        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색출력");
            System.out.println("4. 전체 출력 ");
            System.out.println("5. 끝내기 ");
            System.out.print("메뉴 번호 선택 : ");
            int no = sc.nextInt();

            switch (no) {

                case 1:
                    bookManager.addBook(inputBook());
                    break;
                case 2:
                    bookManager.deleteBook(inputBookNo());
                    break;
                case 3:
                    bookManager.searchBook(inputBookTitle());
                    break;
                case 4:
                    bookManager.displayAll();
                    break;
                case 5:
                    System.out.println("프로그램이 종료됩니다.");
                    return;
            }if(no==5){
                break;
        }

        }








    }

    public BookDTO inputBook() {

        System.out.print("도서 제목 : ");
        String bookTitle = sc.nextLine();
        sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int categoryNum = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자 : ");
        String bookAuthor = sc.nextLine();
        sc.nextLine();

        return new BookDTO(categoryNum, bookTitle, bookAuthor);
    }

    public int inputBookNo() {
        System.out.println("도서 번호 : ");

        return sc.nextInt();
    }

    public String inputBookTitle() {
        System.out.println("도서 제목 : ");

        return sc.nextLine();
    }




}
