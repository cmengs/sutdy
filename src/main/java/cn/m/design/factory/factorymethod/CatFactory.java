package cn.m.design.factory.factorymethod;


import cn.m.design.factory.factorymethod.entity.Cat;

public class CatFactory implements AnimalFactory{
    @Override
    public Aniaml getAniaml() {
        return new Cat();
    }
}
