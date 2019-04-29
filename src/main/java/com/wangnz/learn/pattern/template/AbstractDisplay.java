package com.wangnz.learn.pattern.template;

/**
 * Created by Administrator on 2017/4/19.
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void close();

    public abstract void print();

    public void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
