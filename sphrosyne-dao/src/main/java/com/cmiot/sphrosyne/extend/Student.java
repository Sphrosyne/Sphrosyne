package com.cmiot.sphrosyne.extend;

public class Student extends Person{
    private String book;

    public Student(String book) {
        this.book = book;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void play(){
        System.out.println("name--"+name+"   age"+age+"----会玩会看"+book);
    }

    @Override
    public void move() {
        System.out.println("学生会移动");
    }
}
