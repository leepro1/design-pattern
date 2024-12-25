package com.leepro1.designpattern.chain_of_responsibilities.before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {

    private String body;

    public Request(String body) {
        this.body = body;
    }

}
