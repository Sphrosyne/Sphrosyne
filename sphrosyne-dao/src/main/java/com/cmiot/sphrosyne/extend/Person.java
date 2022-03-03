package com.cmiot.sphrosyne.extend;

public class Person {
    public String name;
    public int age;

    private String fuck;


    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFuck() {
        return fuck;
    }

    public void setFuck(String fuck) {
        this.fuck = fuck;
    }

    public void move(){
        System.out.println("name--"+name+"   age--"+age+"--会移动");
    }

    public void poly(){
        System.out.println("name--"+name+"   age--"+age+"--有多态");
    }
}
