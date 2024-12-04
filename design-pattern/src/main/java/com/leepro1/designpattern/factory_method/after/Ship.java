package com.leepro1.designpattern.factory_method.after;

import com.leepro1.designpattern.abstract_factory.after.Anchor;
import com.leepro1.designpattern.abstract_factory.after.Wheel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {

    private String name;

    private String color;

    private String logo;

    private Wheel wheel;

    private Anchor anchor;

}
