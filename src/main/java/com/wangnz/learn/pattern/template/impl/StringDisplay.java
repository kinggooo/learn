package com.wangnz.learn.pattern.template.impl;

import com.wangnz.learn.pattern.template.AbstractDisplay;

/**
 * Created by Administrator on 2017/4/19.
 */
public class StringDisplay extends AbstractDisplay {
    private String str;

    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.getBytes().length;
    }

    public void open() {
        println();
    }

    public void close() {
        println();
    }

    public void print() {
        System.out.println("|" + str + "|");
    }

    private void println() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
