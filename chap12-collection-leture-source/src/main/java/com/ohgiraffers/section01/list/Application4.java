package com.ohgiraffers.section01.list;

import java.util.LinkedList;
import java.util.Queue;

public class Application4 {

    public static void main(String[] args) {

        /* title. Queue 에 대해 이해하고 사용할 수 있다. */

        /* comment.
        *   Queue
        *   선형 매모리 공간에 데이터를 저장하는
        *   선입선출(FIFO - First In First Out) 방식의 구조이다.
        *   Queue 인터페이스를 상속 받는 하위 인터페이스는 다양하지만
        *   대부분은 LinkedList 를 이용해 인스턴스를 생성한다.
        * */

        // Queue 도 인터페이스이기 때문에 인스턴스 생성 불가
        Queue<String> que = new LinkedList<>();

        // Queue 데이터 넣기 offer() 메소드를 이용한다.
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /* comment.
        *   Queue 에서 데이터를 꺼내는 방법은 2가지이다.
        *   peek() : 해당 Queue 에 가장 앞에 있는 요소(먼저 들어온 요소)를 반환
        *   poll() : 해당 Queue 에 가장 앞에 있는 요소 반환 후 제거 */

        System.out.println("peek() : " + que.peek());
        System.out.println("peek() : " + que.peek());
        // 가장 앞에 있는 요소 삭제되지 않음
        System.out.println("que = " + que);

        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        // 가장 앞에 있는 요소 삭제됨
        System.out.println("que = " + que);

    }

}
