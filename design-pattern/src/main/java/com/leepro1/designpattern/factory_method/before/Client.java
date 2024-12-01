package com.leepro1.designpattern.factory_method.before;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "tester@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "tester@mail.com");
        System.out.println(blackship);
    }

}
