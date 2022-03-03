package com.cmiot.sphrosyneservice;

import org.junit.Test;

public class Test20210721Array {
    //冒泡排序 从小到大
    public static void main(String[] args) {
        int[] array = {34,21,35,48,16,13,87,52};
        int temp;

        for (int i = 0; i < array.length; i++) {
            for(int j=0;j< array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }

    //冒泡排序  从大到小
    @Test
    public void rank() {
        int[] array = {34,21,35,48,16,13,87,52};
        int temp;

        for (int i = 0; i < array.length; i++) {
            for(int j= 0;j< array.length-i-1;j++){
                if(array[j]<array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }

    //二维数组
    @Test
    public void dimension(){
        int[][] array =new int[2][];

        int[][] array2 =new int[2][3];


    }

}
