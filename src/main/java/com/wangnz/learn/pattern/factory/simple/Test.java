package com.wangnz.learn.pattern.factory.simple;

import com.wangnz.learn.pattern.factory.Mouse;
import com.wangnz.learn.pattern.factory.simple.impl.DellMouseFactory;
import com.wangnz.learn.pattern.factory.simple.impl.HpMouseFactory;

public class Test {

    public static void main(String[] args) {

        SimpleMouseFactory f = new SimpleMouseFactory();
        Mouse m1 = f.getMouse(1);
        Mouse m2 = f.getMouse(2);
        m1.use();
        m2.use();

        MouseFactory mf1 = new DellMouseFactory();
        MouseFactory mf2 = new HpMouseFactory();
        m1 = mf1.createMouse();
        m2 = mf2.createMouse();
        m1.use();
        m2.use();
    }
}
