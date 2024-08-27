package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {

        /* title. 자동형변환과 강제형변환을 이용해서 서로 다른 자료형끼리 계산 */

        /* comment.
        *   자동형변환과 강제형변환을 이용한 다른 자료형 끼리의 연산
        *   다른 자료형끼리 연산은 큰 자료형으로 자동형변환 되어 연산이 된다. */

        int inum = 10;
        long lnum = 100;

        /* index 1. 두 수의 연산 결과를 int 형으로 반환 후 int 자료형에 변수에 리턴 */
//        int isum = inum + lnum; // 연산의 결과가 자동형변환 되어 long 이 된다.
                                  // 그러면 int = long 충돌되기 때문에 오류가 발생된다.
          int isum = (int)(inum + lnum); // 연산이 되고 (int) 강제형변환 시켜야하기 때문에, 연산부분을 ()로 묶어줘야한다.
          int isum2 = inum + (int)lnum; // inum은 lnt 이고, lnum은 long 이기 때문에 long만 int로 강제형변환
          long isum3 = inum + lnum; // 자동형변환으로 long 이 됬기때문에 연산에 문제가 되지않는다.

    }
}
