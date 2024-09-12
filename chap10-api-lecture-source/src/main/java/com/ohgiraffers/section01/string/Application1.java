package com.ohgiraffers.section01.string;

public class Application1 {

    public static void main(String[] args) {

        /* title. String 클래스의 자주 사용하는 메소드에 대해 숙지할 수 있다. */

        /* comment.
        *   chatAt() : 해당 문자열의 특정 인덱스에 해당하는 문자 반환
        * */

        String str1 = "apple";

        for(int i = 0; i < str1.length(); i++){
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

        


    }

}
