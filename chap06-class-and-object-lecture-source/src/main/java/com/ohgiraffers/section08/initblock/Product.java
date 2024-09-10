package com.ohgiraffers.section08.initblock;

public class Product {

    /* index 1. 필드를 초기화 하지 않으면 JVM 이 정한 기본값으로 객체가 만들어진다. */
//    private String name;            // 제품 이름
//    public int price;               // 제품 가격
//    public static String brand;     // 제품 브랜드

    /* index 2. 명시적 초기화 */
    private String name = "갤럭시";
    private int price = 2000000;
    private static String brand = "삼성";

    public String getInfo() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price + ", brand= " + Product.brand +
                '}';
    }
}
