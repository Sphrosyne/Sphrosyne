package com.cmiot.sphrosyneservice;

import org.junit.Test;

public class Test20210726VarParameter {
    //可变参数
    @Test
    public void testVar(){
        test1(1,2,3);

        int[] a ={12,3,4};
        test1(a);

        test2("sd","a","b","c");
    }

    public void test1(int...num){
        for (int i : num) {
            System.out.println(i);
        }
    }

    //只能有一个可变参数，并且必须在最后
    public void test2(String yu,String...str){
        System.out.println(yu);
        for (String s : str) {
            System.out.println("--"+s);
        }
    }
}
