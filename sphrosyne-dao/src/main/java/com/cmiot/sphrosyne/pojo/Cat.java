package com.cmiot.sphrosyne.pojo;

public class Cat extends Animal{
    public String color_of_eye;

    public void des(){
        System.out.println(getName()+"眼睛的颜色是"+color_of_eye);
    }

    public String getColor_of_eye() {
        return color_of_eye;
    }

    public void setColor_of_eye(String color_of_eye) {
        this.color_of_eye = color_of_eye;
    }
}
