package com.wangnz.learn.pattern.factory.simple.impl;

import com.wangnz.learn.pattern.factory.Mouse;
import com.wangnz.learn.pattern.factory.prd.HpMouse;
import com.wangnz.learn.pattern.factory.simple.MouseFactory;

public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
