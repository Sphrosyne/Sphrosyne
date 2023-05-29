package com.cmiot.sphrosyneservice;

import com.cmiot.sphrosyne.pojo.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@TestPropertySource({"classpath:application.properties"})
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SphrosyneServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootRedisApplicationTests {

    @Autowired
    private RedisTemplate<String, String> strRedisTemplate;
    @Autowired
    private RedisTemplate<String, Serializable> serializableRedisTemplate;

    @Test
    public void testString() {
        strRedisTemplate.opsForValue().set("strKey", "zwqh");
        System.out.println(strRedisTemplate.opsForValue().get("strKey"));
    }

    @Test
    public void testSerializable() {
        UserEntity user = new UserEntity();
        user.setId(1L);
        user.setUserName("朝雾轻寒");
        user.setUserSex("男");
        serializableRedisTemplate.opsForValue().set("user", user);
        UserEntity user2 = (UserEntity) serializableRedisTemplate.opsForValue().get("user");
        System.out.println("user:" + user2.getId() + "," + user2.getUserName() + "," + user2.getUserSex());
    }

    @Test
    public void sst() {
        int k=1;
       for(int i=1;i<10;i++){
           StringBuilder s=new StringBuilder();
           for(int j=i*2-1;j>0;j--){
               s.append("*");
           }
           System.out.println(s);
       }
    }

    @Test
    public void ew() {
        int[] array ={1,3,23,4,5,77,2};
        int l =array.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l-i-1; j++) {
                if(array[j+1]<array[j]){
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < l; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    public void xw() {
        int[] array ={1,3,23,4,5,77,2};
        int l =array.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l-i-1; j++) {
                if(array[j+1]>array[j]){
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < l; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    public void asd() {
        int[] arrayA ={1,3,23,45,77};
        int[] arrayB ={5,7,13,24,88,100};

        int l =arrayA.length+arrayB.length;
        int[] array= new int[l];
        int x=0;
        int y=0;

        for (int i = 0; i < l; i++) {
            if(x < arrayA.length && y< arrayB.length){
                if(arrayA[x]<arrayB[y]){
                    array[i]=arrayA[x];
                    x++;
                }else {
                    array[i]=arrayB[y];
                    y++;
                }
            }else if(x<arrayA.length){
                array[i]=arrayA[x];
                x++;
            }else if(y< arrayB.length){
                array[i]=arrayB[y];
                y++;
            }
        }
        String s = Arrays.toString(array);
        System.out.println(s);
    }

    @Test
    public void test001() {
        int x=200;
        int y=431;

        List<Integer> listA= new LinkedList<>();
        while(x!=0){
            int a=x%10;
            x=x/10;
            listA.add(a);
        }

        int m=0;
        for (int i = 0; i < listA.size(); i++) {
            m = listA.get(i)+m*10;
        }
        System.out.println(m);

    }

    @Test
    public void test002() {
        int x=200;
        int y=431;

        List<Integer> listA= new LinkedList<>();
        while(x!=0){
            int a=x%10;
            x=x/10;
            listA.add(a);
        }

        int m=0;
        for (int i = 0; i < listA.size(); i++) {
            m = listA.get(i)+m*10;
        }
        System.out.println(m);

    }

    @Test
    public void test003() {
        int f =f(4);
        System.out.println(f);

    }
    private int f(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        return f(n-1)+f(n-2);
    }



}
