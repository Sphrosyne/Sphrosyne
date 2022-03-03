package com.cmiot.sphrosyneservice;

import java.util.Scanner;

public class Test20210714Switch {
    public static void main(String[] args) {
        System.out.println("请输入一个字符");
        Scanner scanner = new Scanner(System.in);
        char s=scanner.next().charAt(0);


        switch (s){
            case 'a':
                System.out.println("哦哦");
                break;
            case 'b':
                System.out.println("图文");
                break;
            case 'c':
                System.out.println("CXS");
                break;
            default:
                System.out.println("dXX");
        }
        System.out.println("结束");

    }
}
