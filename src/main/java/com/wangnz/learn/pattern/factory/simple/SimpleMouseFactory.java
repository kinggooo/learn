package com.wangnz.learn.pattern.factory.simple;

import com.wangnz.learn.pattern.factory.Mouse;
import com.wangnz.learn.pattern.factory.prd.DellMouse;
import com.wangnz.learn.pattern.factory.prd.HpMouse;

public class SimpleMouseFactory {
    public Mouse getMouse(int type) {
        switch (type) {
            case 1:
                return new DellMouse();
            case 2:
                return new HpMouse();
        }
        return null;
    }
}
