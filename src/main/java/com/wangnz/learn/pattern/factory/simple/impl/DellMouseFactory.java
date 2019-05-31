package com.wangnz.learn.pattern.factory.simple.impl;

import com.wangnz.learn.pattern.factory.Mouse;
import com.wangnz.learn.pattern.factory.prd.DellMouse;
import com.wangnz.learn.pattern.factory.simple.MouseFactory;

public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
