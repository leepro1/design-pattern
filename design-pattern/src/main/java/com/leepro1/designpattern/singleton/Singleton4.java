package com.leepro1.designpattern.singleton;

/**
 * java 1.5 이상에서 volatile을 활용한 double checked locking
 * 미리 생성할 필요 없고 메서드에 동기화를 거는 것이 아니라 멀티쓰레드에 효율적
 * 하지만 멀티쓰레드 환경에서 자바 메모리가 동작하는 방법을 알아야 volatile을 사용할 수 있어서 복잡하다.
 */
public class Singleton4 {

    private static volatile Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {

        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }

        return instance;
    }

}
