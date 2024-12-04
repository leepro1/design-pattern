package com.leepro1.designpattern.abstract_factory.after;

import com.leepro1.designpattern.factory_method.after.Ship;
import com.leepro1.designpattern.factory_method.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
