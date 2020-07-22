package cn.m.design.cl;

import cn.m.design.cl.mode.IncreaseFansStrategy;

/**
 * 调用主体，第一人称
 */
public class Me {
    private IncreaseFansStrategy increaseFansStrategy;

    public Me(IncreaseFansStrategy increaseFansStrategy) {
        this.increaseFansStrategy = increaseFansStrategy;
    }

    public void execution(){
        increaseFansStrategy.action();
    }
}
