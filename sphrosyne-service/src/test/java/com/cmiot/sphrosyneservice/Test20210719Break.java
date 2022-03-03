package com.cmiot.sphrosyneservice;

import org.junit.Test;

public class Test20210719Break {

    @Test
    public void breakTest1() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.println("i---" + i);
                System.out.println("j=" + j);
                if (j == 3) {
                    break;
                }
            }
        }
    }

    @Test
    public void breakTest2() {
        lable1:
        for (int i = 1; i < 4; i++) {
            lable2:
            for (int j = 1; j < 6; j++) {
                System.out.println("i---" + i);
                System.out.println("j=" + j);
                if (j == 3) {
                    break lable1;
                }
            }
        }
    }

    @Test
    public void continueTest1(){
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 5; j++) {
                if(j==3){
                    continue;
                }
                System.out.println("i---" + i);
                System.out.println("j=" + j);
            }
        }
    }

    @Test
    public void continueTest2(){
        lable1:
        for (int i = 1; i < 4; i++) {
            lable2:
            for (int j = 1; j < 5; j++) {
                if(j==3){
                    continue lable1;
                }
                System.out.println("i---" + i);
                System.out.println("j=" + j);
            }
        }
    }
}
