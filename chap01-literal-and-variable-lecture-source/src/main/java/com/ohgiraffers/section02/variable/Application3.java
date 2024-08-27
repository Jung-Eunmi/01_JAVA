package com.ohgiraffers.section02.variable;

public class Application3 {

    public static void main(String[] args) {

        // 1 tap(키) 4칸 띄어쓰기
        /* 수업목표. 변수의 명명 규칙에 대해 이해할 수 있다. */
        /* 필기.
        *   변수의 명명 규칙
        *   1. 컴파일 에러를 발생시키는 규칙
        *   2. 컴파일 에러를 발생시키지는 않지만, 개발자들끼리의 암묵적 규칙
        * */

        /* 목차1. 컴파일 에러를 발생시키는 규칙 */
        /* 목차1-1. 동일한 범위 내에서 동일한 변수명은 가질 수 없다.*/
         int age = 20;
//         int age = 30; // 동일한 변수명을 가지기 때문에 에러가 발생한다.

        /* 목자1-2. 예약어 사용이 불가능하다. */
//         int true = 20;
//         int for = 20; // 예약어를 쉽게 구분하는 방법은 글자의 색이 다르다.

        /* 목자1-3. 변수명은 대소문자를 구분한다. */
        int Age = 20; // 위에서 우리가 만든 age 와는 다른 변수명으로 인식한다.(대소문자 차이로 다른 변수명을 가짐)
        int True = 30; // 예약어 true 와 다른 녀석이다.

        /* 목차1-4. 변수명은 숫자로 시작할 수 없다. */
//        int 1age = 50;
        int age1 = 50;

        /* 목차1-5. 특수기호는 '_','$' 만 사용이 가능핟. */
//        int sh@op = 20;
        int _age2 = 20;
        int $hi = 100;

        /* 목차2. 컴파일 에러는 발생시키지 않지만, 개발자들끼리의 암묵적인 규칙!! */
        /* 목차2-1. 변수명의 길이는 제한이 없다. 하지만 적당히 하자.*/
        int dklakdldjkasjldjklasdjlkasjlkfjglkjlksajdlkk;

        /* 목차2-2. 변수명이 합성어(2개의 단어가 합쳐진)경우 첫 단어는 소문자,
                   두 번째 시작 단어는 대문자로 시작한다.
         */
        int maxAge = 20; //나이 중 최대값
        int minAge = 20; //나이 중 최소값
        // Camel-case : 낙타봉표기법
        String user_name = "정은미";   //java 에서는 하지않는다.
        String userName = "정은미";    //이것이 java에서 옳바른 표기법이다.

        /* 목차 2-3. 변수명을 한글로 지어도 에러는 없다. 하지만 권장하지 않는다.*/
        int 나이 = 10;

        /* 목차 2-4. 변수 안에 저장 된 값이 어떤 의미를 가지는 지 명확히 표현하자!! */
        String s = "정은미";  //다른 사람이 쓸 때 알수없다.
        String name = "정은미";

        /* 목차 2-5. 전형적인 변수 이름 */
        int sum = 0;
        int max = 100;
        int min = -10;
        int cnt = 1; // count 를 줄여서 사용

        /* 목차 2-6. 명사형으로 되도록 작성하면 좋다. */
        String goHome;
        String home;

        /* 목차 2-7. boolean 형들은 의문문으로 가급적이면 긍정형태로 작성한다. */
        boolean isDead = false; // 죽었니?라는 부정형태가 아닌
        boolean isAlive = true; // 살았니?라는 긍정형태로 작성 해야한다.

    }
}
