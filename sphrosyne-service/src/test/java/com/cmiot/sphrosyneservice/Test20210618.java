package com.cmiot.sphrosyneservice;

import com.cmiot.sphrosyne.pojo.Student;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Test20210618 {
    private final StringBuilder xsl = new StringBuilder();


    @Test
    public void getTest() throws InterruptedException {

        Student[] stax = new Student[3];
        stax[0]= new Student("","","");

        System.out.println(xsl.append(new Date() + ": Gold star!\n"));

        Thread.sleep(3000);
        System.out.println(xsl.append(new Date() + ": Gold star!\n"));
    }
}
