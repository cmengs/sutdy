package cn.m.design.factory.factorymethod.entity;

import cn.m.design.factory.factorymethod.Aniaml;

public class Cat extends Aniaml {
    @Override
    protected void eat() {
        System.out.println("猫吃鱼");
    }
}
