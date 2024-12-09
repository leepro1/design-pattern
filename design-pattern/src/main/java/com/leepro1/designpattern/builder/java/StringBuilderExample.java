package com.leepro1.designpattern.builder.java;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship").append("tester").toString();
        System.out.println(result);
    }
}
