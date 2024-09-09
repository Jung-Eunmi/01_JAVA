package com.ohgiraffers.test;

public class Application {

    public static void main(String[] args) {
        /* 예제) Person 객체를 생성하고 setter, getter 메소드를 이용하여 임의의 값을 넣어준 후 갑을 출력
            인스턴스 변수 : 아이디, 비밀번호, 이름, 나이, 성별, 전화번호, 이메일 */
        UserTest user = new UserTest("user1","pass01","정은미",30,'여',"01041253938","dmsal2486");
        System.out.println("아이디:"+user.getId());
        System.out.println("비번:"+user.getPwd());
        System.out.println("이름:"+user.getName());
        System.out.println("나이:"+user.getAge());
        System.out.println("성별:"+user.getGender());
        System.out.println("전화번호:"+user.getCall());
        System.out.println("이메일:"+user.getMail());

        System.out.println("=====================================");

        UserTest user2 = new UserTest();
        user2.setId("user2");
        user2.setPwd("pass02");
        user2.setName("정은미");
        user2.setAge(30);
        user2.setGender('여');
        user2.setCall("010-4125-0000");
        user2.setMail("dmsal2486");

        System.out.println("아이디:"+user2.getId());
        System.out.println("비번:"+user2.getPwd());
        System.out.println("이름:"+user2.getName());
        System.out.println("나이:"+user2.getAge());
        System.out.println("성별:"+user2.getGender());
        System.out.println("전화번호:"+user2.getCall());
        System.out.println("이메일:"+user2.getMail());

        System.out.println("=================문제2====================");
        Song song = new Song("ditto","newjeans","korea");
        System.out.println(song.toString());


    }

}
