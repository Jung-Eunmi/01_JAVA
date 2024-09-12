package com.ohgiraffers.section03.interfaceimplements;

public interface InterfaceProduct {

    /* comment.
    *   인터페이스의 특징
    *   상수 필드만 작성이 가능하다.
    *   public static final 키워드 조합을 상수 필드라고 한다.
    *   반드시 선언과 동시에 초기화를 해주어야 한다.
    * */

    // public static final 키워드를 생략해도 묵시적으로 적용된다.
    int MAX_NUM = 100;

    /* comment.
    *   인터페이스는 추상메소드만 작성이 가능하다.
    *   따라서 인터페이스 내부에 작성한 메소드는 묵시적으로
    *   public abstract 의 의미를 가지게 된다.
    *   인터페이스는 생성자를 가질 수 없다.
    * */

    /* index 1. 인터페이스는 생성자를 가질 수 없다. */
//    public InterfaceProduct() {}



}
