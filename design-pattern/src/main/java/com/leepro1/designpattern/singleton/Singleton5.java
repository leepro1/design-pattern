package com.leepro1.designpattern.singleton;

/**
 * static inner 클래스 홀더
 * lazy 로딩 가능 + 복잡하지 않게 멀티쓰레드 대비 가능
 */
public class Singleton5 {

    private Singleton5() {
    }

    private static class Singleton5Holder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {

        return Singleton5Holder.INSTANCE;
    }

}
