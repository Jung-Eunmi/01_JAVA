package com.ohgiraffers.section08.initblock;

public class Application {

    public static void main(String[] args) {

        /* title. 초기화블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스 생성 */

        /* comment.
        *   초기화 블럭
        *   복잡한 초기화를 수행할 수 있는 블럭을 제공하며,
        *   인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분이 된다.
        *   1. 인스턴스 초기화 블럭
        *     : 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
        *       인스턴스를 호출하는 시점마다 호출이 된다.
        *       인스턴스 변수를 초기화 하며, 정적필드에는 실행시점마다 값을 덮어쓴다.
        *       [표현식]
        *       {
        *           초기화 내용
        *       }
        *   2. 정적 초기화 블럭
        *     : 클래스가 로드될 때 한 번 동작한다.
        *       정적 필드를 초기화하며, 인스턴스변수는 초기화 할 수 없다.
        *       [표현식]
        *       static {
        *           초기화 내용 작성
        *       }
        * */

        // 인스턴스 생성
        Product product = new Product();

        /* index 1. 자료형 기본값으로 초기화 된 값 확인 */
//        System.out.println(product.getInfo());

        /* index 2. 명시적 초기화로 필드 초기화 확인 */
        /* comment. 명시적으로 초기값을 작성하면 기본값 -> 명시적 초기값으로 덮어쓴다. */
        System.out.println(product.getInfo());



    }

}
