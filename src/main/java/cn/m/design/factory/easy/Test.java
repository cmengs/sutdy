package cn.m.design.factory.easy;

public class Test {

    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("dog");
        animal.eat();
    }
}
