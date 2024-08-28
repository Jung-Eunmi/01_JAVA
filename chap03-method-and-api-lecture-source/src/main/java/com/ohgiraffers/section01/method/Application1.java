package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {

        /* title. 메소드의 호출 흐름에 대해 이해할 수 있다. */

        /* comment.
        *   메소드 란?
        *   메소드(method) 는 어떤 특정 작업을 수행하기 위한 명령문(코드)의 집합
        * */

        System.out.println("main() 시작됨...");

        /* index 2. 작성한 methodA() 호출하기 */
        //main 밖에서 만든 메소드 호출은 main에 와서 표현식과 같이 만들어 실행해야한다.
        /* comment.
         *   우리가 만든 메소드 호출하는 방법 (main 메소드 제외)
         *   [표현식]
         *   클래스명 변수명 = new 클래스명();
         *   변수명. 메소드명();
         * */

        Application1 app1 = new Application1();
        app1.methodA();  // '.' = 불러올 수 있다.
        /* comment.
        *   main 영역 밖에 있는 친구를 소환 할 때 쓰는 구문
        * */

        System.out.println("main() 종료됨...");

    }

    /* index 1. methodA() 만들어보기 */
    public void methodA() {
    //public void methodA : 어디서든 methodA 이름으로 사용 가능하다.
        System.out.println("methodA() 등장...");

        methodB();

        System.out.println("methodA() 퇴장..."); //실행(run) 안됨, main 메소드 영역에서만 실행이 가능함

    }
    /* index 3. methodB() 만들어보기 */
    public void methodB() {

        System.out.println("methodB 두둥장...");
        System.out.println("methodB 퇴장한다...");

    }


}
