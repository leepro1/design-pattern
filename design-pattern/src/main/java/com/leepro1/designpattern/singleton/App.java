package com.leepro1.designpattern.singleton;

public class App {

    public static void main(String[] args) {

        Singleton5 single = Singleton5.getInstance();
        System.out.println(single == Singleton5.getInstance());
    }
}
