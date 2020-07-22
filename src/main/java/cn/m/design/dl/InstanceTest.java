package cn.m.design.dl;

/**
 * double-check-locking简称DCL单例模式
 */
public class InstanceTest {

    private volatile static InstanceTest instance = null;
    private InstanceTest(){}

    public static InstanceTest getInstance(){
        if(null == instance){
            synchronized (InstanceTest.class){
                if(null == instance){
                    instance = new InstanceTest();
                }
            }
        }
        return instance;
    }
}
