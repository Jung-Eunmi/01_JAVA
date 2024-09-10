package com.ohgiraffers.section02.use;

public class MemberSearchManager {

    public MemberDTO[] searchAllMembers() {

        return new MemberDTO[] {
          new MemberDTO(1,"user01","pass01","푸바오",4,'여'),
          new MemberDTO(2,"user01","pass01","푸바오",4,'여'),
          new MemberDTO(3,"user01","pass01","푸바오",4,'여'),
          new MemberDTO(4,"user01","pass01","푸바오",4,'여'),
          new MemberDTO(5,"user01","pass01","푸바오",4,'여')
        };
    }
}
