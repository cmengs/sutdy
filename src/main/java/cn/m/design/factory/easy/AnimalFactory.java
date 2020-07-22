package cn.m.design.factory.easy;

public class AnimalFactory {

    static Dog getDog(){
        return new Dog();
    }

    static Cat getCat(){
        return new Cat();
    }

    static Animal getAnimal(String type){
        if("dog".equals(type)){
            return getDog();
        }
        return null;
    }
}
