package com.cmiot.sphrosyne.pojo;

public class Animal {
    private String name;
    private String age;
    public String interest;

    public void eat(){
        System.out.println(name+"----正在吃饭"+"爱好:"+interest);
    }

    public void play(){
        System.out.println(name+"----正在玩耍"+"年龄:"+age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

}
