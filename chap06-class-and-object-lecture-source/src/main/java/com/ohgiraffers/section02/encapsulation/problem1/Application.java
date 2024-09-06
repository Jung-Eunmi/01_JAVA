package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {

    public static void main(String[] args) {

        /* title. 필드에 직접 접근했을때 발생할 수 있는 문제를 이해할 수 있다.(1) */

        /* comment. 필드에 옳바르지 않은 값이 들어가게 되어도 통제가 불가능하다. */

        // 1번 몬스터 생성
        Monster monster1 = new Monster();

        monster1.name = "하츄핑";
        monster1.hp = 200;

        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);

        // 2번 몬스터 생성
        Monster monster2 = new Monster();

        monster2.name = "시진핑";
        monster2.hp = -20;  // hp 가 -20 인것은 말이 안됨

        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);

        /* comment. 이렇게 변수에 직접 값을 넣게 되면 검증되지 않는 값을 넣어도 막을 방법이 없다. */




    }

}
