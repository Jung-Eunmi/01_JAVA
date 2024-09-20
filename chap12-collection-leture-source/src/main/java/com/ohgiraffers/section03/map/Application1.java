package com.ohgiraffers.section03.map;

import java.util.Date;
import java.util.HashMap;

public class Application1 {

    public static void main(String[] args) {

        /* title. Map 의 자료구조에 대해 이해하고 HashMap 을 이용할 수 있다. */

        /* comment.
        *   Map 인터페이스의 특징
        *   일반적인 Collection 인터페이스와는 다른 저장 방식을 가지고 있다.
        *   Map 의 가장 큰 특징은 키(key) 와 값(value) 를 하나의 세트로 저장하는 방식이다.★
        * */

        /* comment.
        *   키(key) 란?
        *   값을 찾기 위한 이름 역할을 하는 객체를 의미한다. -> 변수의 역할
        *    1. 키는 중복 저장을 허용하지 않지만, 키가 다르다면 값은 중복이 가능하다.
        *    2. 요소의 저장 순서를 유지하지 않는다.
        * */

        /* comment.
        *   Map 인터페이스를 구현한 클래스는 대표적으로
        *   HashMap, HashTable, TreeMap 등이 있다.
        *   이 3가지 클래스 중 HashMap 이 가장 많이 사용되며
        *   해시 알고리즘이 적용되어 검색 속도가 매우 빠른 특징을 가지고 있다.
        * */

        HashMap hmap = new HashMap();

        /* index 1. HashMap 인스턴스에 값 저장하기 */
        // put() : Map 에 값을 집어넣는 메소드
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);
        System.out.println("hmap = " + hmap);

        /* index 2. 키는 중복 저장이 안된다. (set 방식) */
        // 키는 중복저장이 되지 않기 때문에 가장 최신의 키로 덮어쓰여진다.
        hmap.put(12, "yellow banana");
        System.out.println("hMap = " + hmap);
        
        /* index 3. 값은 중복 저장이 되는 지 확인 */
        // key 값이 중복되지 않는다면 value 는 중복 저장이 가능하다.
        hmap.put(11, "yellow banana");
        hmap.put(10, "yellow banana");
        System.out.println("hmap = " + hmap);

        /* index 4. Map 에 저장된 값 꺼내기 */
        System.out.println("12번 키에 해당하는 값 : " + hmap.get(12));
        
        hmap.remove(12);
        System.out.println("hmap = " + hmap);

        
        



    }

}
