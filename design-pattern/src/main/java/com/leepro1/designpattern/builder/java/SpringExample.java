package com.leepro1.designpattern.builder.java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
            .scheme("http")
            .host("www.whiteship.me")
            .path("java playlist ep1")
            .build().encode();
        System.out.println(howToStudyJava);
    }
}
