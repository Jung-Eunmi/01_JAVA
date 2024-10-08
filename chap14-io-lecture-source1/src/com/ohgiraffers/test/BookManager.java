package com.ohgiraffers.test;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public BookManager() {}

    List<BookDTO> list = new ArrayList<>();

    public void addBook(BookDTO book) {
        list.add(book);
        System.out.println(book);

    }

    public void deleteBook(int index) {
        list.remove(index);
    }

    public void searchBook(String title) {
        for (BookDTO e : list) {
            if (title.equals(e.getTitle())) {
                System.out.println("검색한 도서는 "+title+"입니다.");
            }else{
                System.out.println("검색한 도서가 없습니다.");
            }

        }

    }

    public void displayAll() {
        if(list.size()==0){
            System.out.println("조회결과가 없습니다.");
        }else {
            for(int i = 0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
        }
    }

    public void printBookList(List<BookDTO> printList) {}




}
