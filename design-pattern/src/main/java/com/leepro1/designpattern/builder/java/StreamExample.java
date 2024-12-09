package com.leepro1.designpattern.builder.java;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> names = Stream.<String>builder().add("tester").add("whiteship").build();
        names.forEach(System.out::println);
    }
}
