package com.leepro1.designpattern.factory_method.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "white", "tester@mail.com");
        client.print(new BlackshipFactory(), "black", "tester@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
