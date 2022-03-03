package com.cmiot.sphrosyneservice;

import com.cmiot.sphrosyne.extend.Person;
import com.cmiot.sphrosyne.extend.Student;

public class Test20210826Polymorphic {
    public static void main(String[] args) {
        Person p = new Student("情爱小说");
        p.setName("小吹");
        p.setAge(18);
        p.setFuck("fuck yo");

        p.move();
        p.poly();

        Student stu = (Student) p;

        stu.play();

        System.out.println("================");

        Student student = new Student("武打小说");
        student.setAge(16);
        student.setName("小X");
        student.setFuck("fuck xxx");

        student.play();


    }
}
