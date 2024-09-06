package com.ohgiraffers.section03.abstraction;

//5번째 CaRacer 가 Car 을 작동시키기 위해 명령을 내리는 클래스 만들기
public class CaRacer {
//마지막번째 private로 바꿔주기 //6번째 CaRacer 가 Car 를 작동시킬것이기 때문에 클래스 호출해주기
    private Car car = new Car();

    // 7번째 차에게 시동을 키라고 명령할 준비
    public void startUp() {
        car.startUp();
    }
    // 8번째 차에게 액셀을 밟으라고 명령할 준비
    public void stepAccelator() {
        car.go();
    }
    // 9번째 차에게 브레이크를 밟으라고 명령할 준비
    public void stepBreak() {
        car.stop();
    }
    // 10번째 차에게 시동을 끄라고 명령할 준비
    public void turnOff() {
        car.turnOff();
    }



}
