package com.leepro1.designpattern.abstract_factory.after;

import com.leepro1.designpattern.abstract_factory.before.WhiteAnchor;
import com.leepro1.designpattern.abstract_factory.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
