package com.ohgiraffers.section03.abstraction;

//4번째 CaRacer 가 명령을 내리면 Car 가 작동하기 때문에 Car 클래스 만들기
public class Car {

    //11번째 시동과 스피드로 조건문을 만들어줄 변수 작성
    // 관리 해야 할 상태 (속력, 시동상태)
    private boolean isOn;  // 시동 상태
    private int speed;     // 현재 속력

    // 12~ 15 번째 카레이서의 명령을 받고 차가 행해야 할 조건을 달아줌
    // 12번째 isOn은 선언만 된 상태로 boolean 의 초기화 상태는 false 이기 때문에 if 에 시동이 걸려있다고 설정
    public void startUp() {
        if(isOn){
            System.out.println("이미 시동이 걸려있습니다.");
        }else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 출발 준비 완료~");
        }

    }
    // 13번째 isOn이 true 일때 시동이 걸리기 때문에 isOn = true; 액셀을 밟으면 10km/h씩 증가하라고 했기때문에 10씩 증가 시킴
    //       매개변수명과 클래스의 전역변수 이름이 같을 때 this. 를 붙여준다 지금은 매개변수가 없으니 this. 빼도 상관없음
    public void go() {
        if(isOn){
            System.out.println("차가 앞으로 움직입니다~");
            this.speed += 10;
            System.out.println("현재 차의 시속은 "+ this.speed + "km/h 입니다!!");
        }else {
            System.out.println("차의 시동을 확인해주세요");
        }
    }
    // 14번째 시동이 걸려있고, 액셀을 밟아 speed 가 0 이상일 경우에 speed 를 0 으로 만들어주는 조건
    public void stop() {
        // 시동이 걸려있고, 달리는 상태인 경우에만 멈출 수 있다.
        if(isOn){
            if(this.speed>0){
                this.speed = 0;
                System.out.println("끼--익! 차가 멈췄습니다.");
            }else {
                System.out.println("이미 차는 0km/h 인데요?");
            }
        }else {
            System.out.println("차의 시동이 걸려있지 않아 너가 얼마나 밟든 힘만 들거야~");
        }
    }

    //15번째 현실적으로 speed 가 0 이상일 때 시동을 끄면 안되기때문에 if 안에 if를 넣는 조건
    public void turnOff() {
        // 시동이 걸려있다면 시동을 끄고, 이미 꺼져있다면 끌 수 없고, 움직이고 있다면 브레이크 먼저
        if(isOn){

            if(this.speed>0){
                System.out.println("달리는 상태에서는 시동을 끄면 큰일납니다!");
            }else {
                this.isOn = false;
                System.out.println("시동을 끄겠습니다. 다시 운행하려면 시동을 거세요");
            }

        }else {
            System.out.println("이미 시동이 꺼져 있는 상태입니다.");
        }

    }
}
