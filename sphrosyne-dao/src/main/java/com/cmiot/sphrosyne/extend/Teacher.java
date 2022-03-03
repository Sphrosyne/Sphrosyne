package com.cmiot.sphrosyne.extend;

public class Teacher extends Person{
    private String pen;

    public Teacher() {
    }

    public String getPen() {
        return pen;
    }

    public void setPen(String pen) {
        this.pen = pen;
    }

    public void teach(){
        System.out.println("namme---"+name+"     age:"+age+"----会教书,还有一只"+pen);
    }

    @Override
    public void move() {

        System.out.println("老师会移动");
    }
}
