package com.leepro1.designpattern.singleton;

/**
 * synchronized 사용해서 동기화 처리
 * 메서드를 잠가서 성능이 비효율적이다
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {

        if (instance == null) {
            instance = new Singleton2();
        }

        return instance;
    }

}
