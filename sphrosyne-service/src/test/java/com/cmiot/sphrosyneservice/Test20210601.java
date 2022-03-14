package com.cmiot.sphrosyneservice;


import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test20210601 {
    public static void main(String[] args) {
        System.out.println(0.2/0);
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(3,3));
        System.out.println(Math.PI);
        System.out.println(StrictMath.sqrt(9));
        System.out.println(Math.round(6.64));


        System.out.println(Character.isJavaIdentifierStart('A'));
        System.out.println(Character.isJavaIdentifierStart('π'));

        //inputTest
        Scanner in = new Scanner(System.in);
        System.out.println("名字:");
        String name =in.nextLine();

        System.out.println("年龄");
        int age=in.nextInt();

        System.out.println("Hello "+name+"++++"+age);
    }


    @Test
    public void strJoin(){
        //A,B,C,D
        String str=String.join(",","A","B","C","D");
        System.out.println(str);


        List<String> strList = new ArrayList<>();
        strList.add("M");
        strList.add("O");
        strList.add("Y");
        //M|O|Y
        System.out.println(String.join("|",strList));

        System.out.println("Case".equalsIgnoreCase("CASE"));

        System.out.println("Case".compareTo("CASE"));
        System.out.println("Case".compareToIgnoreCase("CASE"));

        String squence="asdWEWQDSxxa";
        System.out.println(squence.charAt(2));
        System.out.println(squence.codePointAt(4));


    }

    @Test
    public void bigNum(){
        BigInteger a = BigInteger.valueOf(2);
        BigInteger b = BigInteger.valueOf(102);

        System.out.println(a.multiply(b));
        System.out.println(b.divide(a));


        int[] d = new int[3];
        for(int i : d){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(d));

        int[] e =d;

        e[0]=3;

        System.out.println(d[0]);
    }


    @Test
    public void bigXxxx(){
        System.out.println(System.currentTimeMillis());

    }

}
