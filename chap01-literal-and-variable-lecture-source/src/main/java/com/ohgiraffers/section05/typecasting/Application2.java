package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {

        /* title. 강제형변환 규칙에 대해 이해할 수 있다. */

        /* comment.
        *   강제형변환(명시적 형변환)
        *   바꾸려는 자료형으로 캐스트 연산자 => () 를 이용하여 형변환한다.
        *    ex) (바꿀자료형) 값;
        * */

        /* comment.
        *   자동형변환 규칙의 반대 상황에서 강제형변환이 필요하다.
        *    1. 강제형변환의 규칙
        *     1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제형변환이 필요하다.
        *     1-2. 실수를 정수로 변경 시 강제형변환이 필요하다.
        *     1-3. 문자형을 int 미만 크기의 변수에 저장할 때 강제형변환이 필요하다.
        *     1-4. 논리형은 강제형변환 규칙도 제외된다.
        * */

        /* index 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제형변환 */
        /* index 1-1-1. 정수끼리의 강제형변환 */
        long lnum = 8;
//        int inum = lnum;      // 데이터 손실 가능성을 컴파일러가 알려줌
        int inum = (int) lnum;  // 데이터 손실을 각오함
        short snum = (short) inum;
        byte bnum = (byte) snum;
        /* index 1-1-2. 실수끼리의 강제형변환 */
        // 정수와 동일함

        /* index 1-2. 실수를 정수로 변경 시 강제형변환 */
        float fnum = 4.0f;     // 4byte
//        long lnum2 = fnum;   // long -> 8byte float ->4byte
        // 소수점이 날아가기 때문에 큰 공간이라고 해도 강제형변환이 필요하다.
        long lnum2 = (long) fnum;

        /* index 1-3. 문자형을 int 미만의 크기의 변수에 저장할 때 강제형변환 */
        char ch = 'a';      //2byte
//        short snum2 = ch; // 같은 2byte 인데 안됨
        // 같은 2 바이트인데 왜 강제로 해야할까? -> 문자는 음수가 없기때문이다.
        // 문자는 sign bit (부호결정공간) 도 값을 저장할 수 있는 공간으로 사용한다.

        /* index 1-4. 논리는 application1 에서 한 자동형변환과 같이
        *             강제 형변환 규칙도 제외된다. -> 하지마라. */

    }
}
