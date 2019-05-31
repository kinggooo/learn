package com.wangnz.learn.pattern.factory.simple;

import com.wangnz.learn.pattern.factory.Mouse;
import com.wangnz.learn.pattern.factory.prd.DellMouse;
import com.wangnz.learn.pattern.factory.prd.HpMouse;

public interface MouseFactory {
    Mouse createMouse();
}
