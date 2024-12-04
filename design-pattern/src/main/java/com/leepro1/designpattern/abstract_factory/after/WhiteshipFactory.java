package com.leepro1.designpattern.abstract_factory.after;

import com.leepro1.designpattern.factory_method.after.DefaultShipFactory;
import com.leepro1.designpattern.factory_method.after.Ship;
import com.leepro1.designpattern.factory_method.after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
