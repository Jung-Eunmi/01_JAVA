package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testContinueStatement() {
        /* title. continue 문 사용에 대한 흐름을 이해할 수 있다. */

        /* comment.
        *   continue 문도 break 와 마찬가지로 반복문 내에서 사용한다.
        *   break -> 반복문을 탈출(종료) 하지만
        *   continue 는 중간에 멈추고 다시 증감식으로 넘어가게 된다.
        *   일반적으로 if(조건식) { continue; } 처럼 사용된다.
        *   보통 반복문 내에서 특정 조건에 대한 예외를 처리할 때 사용이 된다.
        * */

        /* index. 1 부터 100 사이의 3의 배수이면서 4의 배수인 값 출력 */
        for(int i= 1; i<101; i++){

            if(i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
            }else {
                continue;
            }

        }

    }

    public void testContinueStatement2() {
        /* index.
        *   2 ~ 9 단의 구구단을 출력 할 것이다.
        *   단, 수가 5인 경우만 출력하지 않을 것이다.
        * */

    }



}
