package com.cmiot.sphrosyneservice;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Test20210713BitOperator {
    public static void main(String[] args) {
        //2的原码，反码，补码:00000000 00000000 00000000 00000010
        //3的原码，反码，补码:00000000 00000000 00000000 00000011
        //2&3             00000000 00000000 00000000 00000010  故结果应该是2
        System.out.println(2&3);

        //-2的原码         10000000 00000000 00000000 00000010
        //-2的反码         11111111 11111111 11111111 11111101
        //-2的补码         11111111 11111111 11111111 11111110
        //~-2             00000000 00000000 00000000 00000001 故结果应该是1
        System.out.println(~-2);

        //2的原码，反码，补码:00000000 00000000 00000000 00000010
        //~2的补码              11111111 11111111 11111111 11111101
        //负数的补码=它的反码+1 它的补码-1->  11111111 11111111 11111111 11111100(反码)
        //上面结果的原码 10000000 00000000 00000000 00000000 00000011 故结果是-3
        System.out.println(~2);

        // 00000000 00000000 00000000 00000001 右移前
        // 00000000 00000000 00000000 00000000 右移后 故结果是0
        //1÷2÷2
        System.out.println(1>>2);

        // 00000000 00000000 00000000 00000001
        // 00000000 00000000 00000000 00001000 故结果是8
        //1*2*2*2
        System.out.println(1<<3);

        //52*2*2*2 416
        System.out.println(52<<3);

    }
}
