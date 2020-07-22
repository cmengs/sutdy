package cn.m.design.factory.factorymethod.entity;

import cn.m.design.factory.factorymethod.Aniaml;

public class Dog extends Aniaml {


    @Override
    protected void eat() {
        System.out.println("狗吃肉");
    }
}
