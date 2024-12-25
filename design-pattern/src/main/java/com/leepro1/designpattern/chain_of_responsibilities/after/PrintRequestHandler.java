package com.leepro1.designpattern.chain_of_responsibilities.after;

import com.leepro1.designpattern.chain_of_responsibilities.before.Request;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
