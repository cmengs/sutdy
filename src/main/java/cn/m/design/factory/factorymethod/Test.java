package cn.m.design.factory.factorymethod;

public class Test {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new CatFactory();
        Aniaml aniaml = animalFactory.getAniaml();
        aniaml.eat();
    }
}
