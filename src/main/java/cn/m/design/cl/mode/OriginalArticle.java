package cn.m.design.cl.mode;

public class OriginalArticle implements IncreaseFansStrategy {

    @Override
    public void action() {
        System.out.println("3y认真写原创，最新一篇文章：《策略模式，就这？》");
    }
}
