package com.leepro1.designpattern.singleton;

public class App {

    public static void main(String[] args) {

        Singleton4 single = Singleton4.getInstance();
        System.out.println(single == Singleton4.getInstance());
    }
}
