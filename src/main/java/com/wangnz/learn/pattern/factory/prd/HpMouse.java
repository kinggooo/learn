package com.wangnz.learn.pattern.factory.prd;

import com.wangnz.learn.pattern.factory.Mouse;

public class HpMouse implements Mouse {

    @Override
    public void use() {
        System.out.println("i am hp mouse");
    }
}
