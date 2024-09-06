package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* title. 객체 지향 프로그래밍에 대해 이해하고 객체와 클래스를 설계하여 프로그래밍 */

        /* comment.
        *   객체 지향 프로그래밍이란?
        *   현실세계의 모든 사건(event)는 객체와 객체간의 상호작용에 일어난다.
        *   현실세계와 조금 다른 점은 객체간의 상호 작용을 한다는 사실은 현실과 동일하지만,
        *   의인화 기법이 적용되어 현실세계에서 불가능한 무생물(공기,문)이나 개념(계좌) 같은
        *   존재들도 하나의 주체로서 제어하고 행동하는 것이 다르다.
        *   모든 객체는 책임을 가지고 자신의 역할을 수행해야 한다.
        *   또한 하나의 객체는 너무 많은 일을 수행하는 것이 아닌 적절한 책임을 가져야 한다.(단일 책임의 원칙)
        * */

        /* comment.
        *   추상화란?
        *   우리가 클래스를 만들 때 회원에 대한 정보를 반영하기에는
        *   우리는 너무 많은 정보를 가지고 있다. ex) 키, 몸무게, 주소, 등등
        *   프로그램에 맞게 단순화 하는 작업을 추상화라고 한다.
        * */

        /* comment.
        *   프로그램 개요.
        *   카레이서가 자동차를 운전하는 프로그램
        *
        *  comment.
        *   시스템 요구사항.
        *   1. 카레이서는 시동걸기, 엑셀 밟기, 브레이크 밟기, 시동 끄기를 할 수 있다.
        *   2. 자동차는 시동걸기, 앞으로 가기, 멈추기, 시동끄기를 할 수 있다.
        *   3. 자동차는 처음에는 멈춘 상태로 대기하고 있는다.
        *   4. 카레이서는 먼저 자동차에 시동을 건다. 만약 이미 걸려있다면 다시 시동을 걸 수는 없다.
        *   5. 카레이서가 엑셀을 밟으면 시동이 걸려있다면, 자동차의 시속이 10km/h 증가하며 앞으로 나간다.
        *   6. 자동차가 달리는 중인 경우 브레이크를 밟으면, 자동차의 시속은 0km/h 로 떨어지며 멈춘다.
        *   7. 브레이크를 밟았을 때, 자동차가 달리는 중이 아니면 이미 멈춰있습니다 라고 안내한다.
        *   8. 카레이서가 시동을 끄면 더 이상 자동차는 움직이지 않는다.
        *   9. 자동차가 달리고 있으면 시동을 끌 수 없다.
        * */

        /* comment.
        *   프로그램 설계하기
        *   1. 필요한 객체 도출
        *    -> 플레이어(사용자), 카레이서, 자동차
        *   2. 객체간의 상호작용
        *    -> 카레이서가 수신할 수 있는 메세지(카레이서가 해야 할 일)
        *       1. 시동을 걸어라
        *       2. 엑셀을 밟아라
        *       3. 브레이크를 밟아라
        *       4. 시동을 꺼라
        *    -> 자동차가 수신할 수 있는 메세지(자동차가 해야 할 일)
        *       1. 시동을 걸어라
        *       2. 앞으로 가라
        *       3. 멈춰라
        *       4. 시동을 꺼라
        * */

        /* comment.
        *   1. Application 클래스
        *    - main 메소드 내에서 Scanner 를 통해 카레이서에게 명령을 내림.
        *   2. CarRacer 클래스
        *    - 속성 : 자동차
        *    - 행위 : 시동을 걸어라, 엑셀을 밟아라, 브레이크 밟아라, 시동을 꺼라
        *   3. Car 클래스
        *    - 속성 : 시동상태, 현재시속
        *    - 행위 : 시동을 걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라
        * */
        // 1번째 스캐너 준비
        Scanner sc = new Scanner(System.in);

        // 한 명의 카레이서를 만들었다.
        CaRacer racer = new CaRacer();

        // 2번째 While로 스캐너를 반복되게 해주고 스캐너로 메뉴 및 메뉴를 입력할 변수 만들기
        while (true) {
            System.out.println("===========HiMedia 카레이싱===========");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            //3번째 switch문으로 틀잡아주기
            switch (no) {
                case 1 : racer.startUp();   //16번째 Car와 CaRacer 에 조건을 완성 시켰으니 호출해주기
                    break;
                case 2 : racer.stepAccelator();
                    break;
                case 3 : racer.stepBreak();
                    break;
                case 4 : racer.turnOff();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료하겠습니다.....");
                    break;
                default :
                    System.out.println("잘못 된 번호를 입력했습니다.");
                    break;
            }
            // 4번째 스캐너 9번으로 switch 를 break; 한 뒤 while 로 스캐너 반복을 break; 시킴
            if(no == 9){
                break;
            }

        }

    }

}
