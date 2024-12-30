package com.leepro1.designpattern.visitor.after;

public class Circle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
