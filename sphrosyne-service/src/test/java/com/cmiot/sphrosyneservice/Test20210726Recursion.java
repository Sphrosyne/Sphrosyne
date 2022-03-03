package com.cmiot.sphrosyneservice;

public class Test20210726Recursion {
    //求
    public static void main(String[] args) {
        XX xx = new XX();
        xx.xxe();

        System.out.println(rX(4));
    }

    //递归
    public static int rX(int i){
        if(i<=1){
            System.out.println(i);
            return 1;
        }else {
            System.out.println(i);
            return rX(i-1)*i;
        }
    }
}
class XX {
    public void xxe(){
        System.out.println("----");
    }
}
