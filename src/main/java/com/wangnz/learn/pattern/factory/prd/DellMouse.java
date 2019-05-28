package com.wangnz.learn.pattern.factory.prd;

import com.wangnz.learn.pattern.factory.Mouse;

public class DellMouse implements Mouse {

    @Override
    public void use() {
        System.out.println("i am dell mouse");
    }
}
