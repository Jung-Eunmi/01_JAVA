package com.ohgiraffers.section04.overflow;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해 할 수 있다. */
        /* 필기.
            자료형 별 최대 범위를 벗어나는 경우를 오버플로우라고 한다.
        */

        /* 목차1. 오버플로우 */
        byte num1 = 127;
        System.out.println("num1 = " + num1); //127 : byte 의 최대값

        num1++;   // num1 + 1; 1증가
        System.out.println("num1 overflow 확인하기 : " + num1); //-128 : byte 의 최소값

        /* 목차2. 언더플로우 */
        byte num2 = -128;
        System.out.println("num2 = " + num2);

        num2--;    //num2 - 1; 1감소
        System.out.println("num2 underflow 확인하기 = " + num2);
        
        /*오버플로우와 언더플로우가 발생 했으나, 컴파일에러(번역오류)나 런타임 에러가 발생하지 않았다.
        * 그렇기 때문에 최댓값 혹은 최소값의 범위를 고려해서 코드를 작성해야 한다는 의미이다.*/
        
        // ex)오버플로우 오류 현상
        int firstNum = 1000000; //100만
        int secondNum = 700000; //70만
        //예상값 = 7천억
        //int 는 양수 21억 정도 저장 가능함
        int multi = firstNum * secondNum;
        System.out.println("multi = " + multi);
        
        long longMulti = firstNum * secondNum;
        System.out.println("longMulti = " + longMulti);
        /* 더 넓은 자료형을 써 큰 공간을 마련 했음에도 불구하고 요상한 값이 나왔다.
           이미 오버플로우 된 값을 저장한 것 뿐이기 때문에, 
           계산 처리 전에 미리 long 타입으로 자료형을 변경해야 한다.
         */

        long result = (long) firstNum * secondNum; //(long) : 강제 형변환
        System.out.println("result = " + result);
    }
}
