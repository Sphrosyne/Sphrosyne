package com.cmiot.sphrosyneservice;

import com.cmiot.sphrosyne.pojo.Cat;

public class Test20210812Extends {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("小猫咪");
        cat.setAge("九岁");
        cat.setInterest("玩毛线");
        cat.setColor_of_eye("黑色");

        cat.interest="玩锤子";

        cat.des();

        cat.eat();

        cat.play();

        Cat cat1 = new Cat();
        cat1.setName("小九");

        cat1.des();
        cat1.eat();
        cat1.play();

    }
}
