package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /* title. 메소드의 파라미터에 대해 이해할 수 있다. */

        /* comment.
        *   매개변수(parameter) 로 사용 가능한 자료형
        *   1. 기본자료형
        *   2. 기본자료형 배열
        *   3. 클래스자료형
        *   4. 클래스자료형 배열
        *   5. 가변인자
        * */

        ParameterTest pt = new ParameterTest();

        /* index 1. 기본자료형 매개변수 전달 */
        int num = 20;

        pt.testPrimaryParameter(num);





    }

}
