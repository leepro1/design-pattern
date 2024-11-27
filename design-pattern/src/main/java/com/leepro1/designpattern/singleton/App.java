package com.leepro1.designpattern.singleton;

public class App {

    public static void main(String[] args) {

        Singleton3 single = Singleton3.getInstance();
        System.out.println(single == Singleton3.getInstance());
    }
}
