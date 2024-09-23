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

    public void displayAll() {}

    public void printBookList(List<BookDTO> printList) {}




}
