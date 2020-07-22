package cn.m.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void cz(){
        List list = new ArrayList();
        list.add(1);

        System.out.println(Test2.cz(list));

        System.out.println(list.size());
    }

    public static void main(String[] args) {
        cz();
    }
}
