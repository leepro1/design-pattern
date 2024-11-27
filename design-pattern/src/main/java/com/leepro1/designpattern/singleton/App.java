package com.leepro1.designpattern.singleton;

public class App {

    public static void main(String[] args) {

        Singleton2 single = Singleton2.getInstance();
        System.out.println(single == Singleton2.getInstance());
    }
}
