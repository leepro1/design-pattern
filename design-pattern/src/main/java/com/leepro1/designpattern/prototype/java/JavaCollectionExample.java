package com.leepro1.designpattern.prototype.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student tester = new Student("tester");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<>();
        students.add(tester);
        students.add(whiteship);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
