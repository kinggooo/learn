package com.wangnz.learn.pattern.template.impl;

import com.wangnz.learn.pattern.template.AbstractDisplay;

/**
 * Created by Administrator on 2017/4/19.
 */
public class CharDisplay extends AbstractDisplay {
    private char chr;

    public CharDisplay(char chr) {
        this.chr = chr;
    }

    public void open() {
        System.out.print("<<");
    }

    public void close() {
        System.out.println(">>");
    }

    public void print() {
        System.out.print(chr);
    }
}
