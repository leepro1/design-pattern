package com.leepro1.designpattern.singleton;

/**
 * eager initialization 를 하여 synchronized 대체
 * 만약 이 instance 를 초기가 아니라 나중에 사용할 때 만들어 주고 싶다면? 다른 방식 써야함
 */
public class Singleton3 {

    private static final Singleton3 INSTANCE = new Singleton3();

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {

        return INSTANCE;
    }

}
