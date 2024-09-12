package com.ohgiraffers.section01.string;

public class Application1 {

    public static void main(String[] args) {

        /* title. String 클래스의 자주 사용하는 메소드에 대해 숙지할 수 있다. */

        /* comment.
        *   chatAt() : 해당 문자열의 특정 인덱스에 해당하는 문자 반환 */
        String str1 = "apple";

        for(int i = 0; i < str1.length(); i++){
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

        /* comment.
        *   concat() : 문자열에 인자로 전달 된 문자열을 합치기해서 새로운 문자열을 반환한다.
        *              단, 원본 문자열에는 영향을 주지 않는다. */
        String str2 = "java";
        String str3 = "mysql";

        System.out.println("concat() 메소드 활용 : " + (str2.concat(str3)));
        System.out.println("concat() 동작 후 str2 의 값 : " + str2);  // 원본 문자열에 영향을 주지 않았음

        /* comment.
        *   trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
        *            단, 원본 문자열에는 영향을 주지 않는다. */
        String trimStr = "   java   ";

        System.out.println("trimStr : @" + trimStr + "@");  // '@' 공백확인용
        System.out.println("trim() : @" + trimStr.trim() + "@");
        System.out.println("trim() 동작 후 trim 의 값 : " + trimStr);  // trim 역시도 원본은 문자열에 영향을 주지 않음

        /* comment.
        *   toLowerCase() : 모든 문자를 소문자로 바꿔준다.
        *   toUpperCase() : 모든 문자를 대문자로 바꿔준다.
        *                   단, 원본 문자열에는 영향을 주지 않는다. */
        String caseStr = "javaMySQL";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());
        System.out.println("toLowerCase() 와 toUpperCase() 동작 후 caseStr 의 값 : " + caseStr);

        /* comment.
        *   substring() : 문자열의 일부를 잘라내어 새로운 문자열을 반환해준다. */
        String str4 = "javaMySQL";
        System.out.println("substring(3, 6) : " + str4.substring(3, 6));  // aMy 3번인덱스에서 6번인덱스까지
        System.out.println("substring(3) : " + str4.substring(3));  // aMySQL 3번인덱스에서 끝까지

        /* comment.
        *   replace() : 문자열에서 대체 할 문자열로 기존 문자열을 변경해서 사용한다. */
        System.out.println("replace() : " + str4.replace("java","python")); // 바꿀 타켓 , 타켓과 대체할 내용

    }

}
