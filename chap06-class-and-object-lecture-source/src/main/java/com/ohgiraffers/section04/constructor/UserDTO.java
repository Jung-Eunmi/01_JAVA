package com.ohgiraffers.section04.constructor;

import java.time.LocalDateTime;

public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    private LocalDateTime enrollDate;   // 필드로 다른 클래스 자료형도 사용 가능(회원가입일시)

    /* comment.
    *   생성자의 작성 위치
    *   작성 위치는 클래스 내부에 작성하면 되지만,
    *   통상적으로는 필드와 메소드 선언부 사이에 작성하는 것이 암묵적 관례이다.
    * */

    /* comment.
    *   생성자의 사용 목적
    *   1. 인스턴스(객체) 생성 시점에 수행할 명령이 있는 경우 사용
    *   2. 매개변수 있는 생성자의 경우 매개변수로 전달 받은 값으로 필드
    *      초기화 하며 인스턴스를 생성할 목적으로 사용한다.
    *   3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않겠다.
    *      따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도(초기값 전달 강제)
    * */

    /* comment.
    *   생성자 작성 방법
    *   [표현식]
    *   접근제한자 클래스명(매개변수) {
    *       인스턴스 생성 시점에 수행 할 코드(주로 필드 초기화)
    *       this.필드명 = 매개변수
    *   }
    * */



}
