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

        /* index 2. 기본자료형 배열을 매개변수로 전달 */

        int[] iarr = {1, 2, 3, 4, 5};

        System.out.print("인자로 전달하는 값 : " + iarr);

        System.out.println();

        pt.testPrimaryArrayParameter(iarr);

        System.out.print("메소드 전달 후 원본 배열의 값 확인 : ");
        for(int i=0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* index 3. 클래스 자료형 매개변수 전달 */

        RectAngle r1 = new RectAngle(12.5,22.5);

        System.out.println("인자로 전달하는 클래스 자료형 값 : " + r1);
        pt.testClassParameter(r1);

        /* index 5. 가변인자 */
        /* comment.
        *   가변인자 : 인자로 전달하는 값의 갯수가 정해지지 않은 경우 사용하는 배열이다.
        *   가변인자는 매개변수가 여러 개 일 때, 반드시 끝에 작성해야 한다.
        *       why? -> 가변인자의 끝을 알 수 없기 때문이다.
        *  */
        pt.testVariableLengthParameter("정은미");   // 가변인자는 전달하지 않아도 오류가 나지 않는다.
        pt.testVariableLengthParameter("정은미","야구");
        pt.testVariableLengthParameter("정은미","야구","축구","볼링");
        pt.testVariableLengthParameter("정은미",new String[]{"테니스", "볼링", "야구", "축구"});


    }

}
