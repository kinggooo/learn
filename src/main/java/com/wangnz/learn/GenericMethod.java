package com.wangnz.learn;

public class GenericMethod {
    public <T> T getGeneric(T param) {
        T ret = param;
        return ret;
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        Integer i = gm.getGeneric(new Integer("111"));
    }
}
