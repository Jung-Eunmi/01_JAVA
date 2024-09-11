package com.ohgiraffers.section01.extend;

public class Application {

    public static void main(String[] args) {

        /* title. 상속에 대해 이해할 수 있다. */

        /* comment.
        *   상속은 현실 세계의 상속과 비슷한 개념이다.
        *   부모가 가지고 있는 멤버(필드, 메소드) 를 자식이 물려 받는 의미를 가지고 있다.
        *   클래스 또한 부모 클래스와 자식 클래스로 나뉘어 부모가 가지는 멤버를 자식이 물려 받아
        *   마치 자신의 것처럼 사용하는 것을 의미한다.
        *
        *  comment.
        *   단순히 부모의 것을 사용하는 것 뿐 아니라 물려받은 멤버를 확장 하거나,
        *   추가적인 멤버를 작성하는 것도 가능하다.
        *   특히 메소드 재정의(overriding) 라는 기술을 통해
        *   부모가 가진 메소드를 자식이 다시 정의하는 것이 가능하다.
        * */

        /* comment.
        *   Overriding 이란?
        *   메소드를 재정의
        *   부모가 가지는 메소드 선언부를 그대로 사용하면서
        *   자식 클래스가 정의한 메소드대로 동작할 수 있도록
        *   구현 몸체(영역)을 새롭게 다시 작성을 한 것이다.
        *   메소드를 재정의하게 된다면 재정의한 메소드가 우선 동작을 한다.
        * */

        /* index 1. Car 인스턴스 생성 후 메소드 호출 */
        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        System.out.println("=============================================");
        /* index 2. FireCar 인스턴스 생성 */
        FireCar fireCar = new FireCar();

        


    }

}
