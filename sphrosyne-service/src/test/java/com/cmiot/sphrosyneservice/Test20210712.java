package com.cmiot.sphrosyneservice;

import org.junit.Test;

public class Test20210712 {
    public static void main(String[] args) {

        int a = 12;
        int b = 7;
        //短路与与逻辑与区别。短路与效率更高，第一个判断结果为false的时候，第二个判断不再执行。
        if (a < 5 && ++b < 50) {

        }
        System.out.println("---" + b);
        int c = 8;
        if (a < 5 & ++c < 50) {

        }
        System.out.println("---" + c);
    }

    @Test
    public void jinZhiZuanHuan() {
        // 二进制 以0b开头
        int a=0b1011;
        System.out.println("a="+a);

        //八进制 以0开头
        int b=0234;
        System.out.println("b="+b);

        //十六进制 以0x开头
        int c=0x23A;
        System.out.println("c="+c);

        //二进制，八进制，十六进制转十进制，2^0,8^0,16^0

        //二进制转八进制，十六进制，三位一转。四位一转

        //十六进制，八进制转二进制，一位转四，一位转三

        //十进制转二进制，八进制，十六进制，十进制数除以2，8，16，余数倒排

        //异或
        System.out.println(true^false);


    }

}
