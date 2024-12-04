package com.leepro1.designpattern.abstract_factory.before;

import com.leepro1.designpattern.factory_method.after.Ship;
import com.leepro1.designpattern.factory_method.after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
