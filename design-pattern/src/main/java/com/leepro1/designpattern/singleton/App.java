package com.leepro1.designpattern.singleton;

public class App {

    public static void main(String[] args) {

        Singleton6 single = Singleton6.INSTANCE;
        System.out.println(single == Singleton6.INSTANCE);
    }
}
