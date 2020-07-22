package cn.m.design.factory.factorymethod;


import cn.m.design.factory.factorymethod.entity.Dog;

public class DogFactory implements AnimalFactory{

    @Override
    public Aniaml getAniaml() {
        return new Dog();
    }
}
