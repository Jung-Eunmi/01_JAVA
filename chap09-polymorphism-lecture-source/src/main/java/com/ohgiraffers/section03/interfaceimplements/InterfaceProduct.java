package com.ohgiraffers.section03.interfaceimplements;

public interface InterfaceProduct {

    /* comment.
    *   인터페이스의 특징
    *   상수 필드만 작성이 가능하다.
    *   public static final 키워드 조합을 상수 필드라고 한다.
    *   반드시 선언과 동시에 초기화를 해주어야 한다.
    * */

    // 인터페이스에서 필드를 생성 시 public static final 키워드를 생략해도 묵시적으로 적용된다.
    int MAX_NUM = 100;

    /* comment.
    *   인터페이스는 추상메소드만 작성이 가능하다.
    *   따라서 인터페이스 내부에 작성한 메소드는 묵시적으로
    *   public abstract 의 의미를 가지게 된다.
    *   인터페이스는 생성자를 가질 수 없다.
    * */

    /* index 1. 인터페이스는 생성자를 가질 수 없다. */
//    public InterfaceProduct() {}

    /* index 2. 인터페이스는 구현부가 있는 메소드를 가질 수 없다. */
//    public void nonStaticMethod() {}

    /* index 3. 추상클래스에서 작성해 본 추상메소드만 작성할 수 있다. */
    // 인터페이스에서 메소드 생성 시 public abstract 키워드를 생략해도 묵시적으로 적용된다.
    // 다른 접근제한자는 사용이 불가능하다.
    void nonStaticMethod();

    // static 메소드는 인터페이스 내부에서도 영역을 가질 수 있다. (프로그램이 run하는 시점에 사용할 수 있기때문에)
    static void staticMethod() {
        System.out.println("InterProduct 의 staticMethod() 호출...");
    }

}
