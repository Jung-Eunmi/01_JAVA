package com.ohgiraffers.section02.encapsulation.resolve;

public class Monster {

    /*  */

    private  String kinds;
    private int hp;

    public void setName(String name){
        this.kinds = name;
    }

    public void setHp(int hp){

        if (hp>0){
            this.hp = hp;
        }else {
            this.hp = 0;
        }

    }

    // 몬스터의 정보(이름, 체력)을 알려주는 기능
    public String getInfo(){

        return "몬스터의 이름은 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
    }

}
