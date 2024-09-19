package com.ohgiraffers.test;

public class BookDTO {
    //BookDTO 클래스는 책 번호, 책 이름, 책 저자, 책 가격을 관리한다.
    private int num;
    private String name;
    private String author;
    private int price;

    public BookDTO() {}

    public BookDTO(int num, String name, String author, int price) {
        this.num = num;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
