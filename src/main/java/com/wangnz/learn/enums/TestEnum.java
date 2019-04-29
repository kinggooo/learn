package com.wangnz.learn.enums;

public class TestEnum {
    public static void main(String[] args) {
        Enum1 first = Enum1.FIRST_AUDIT;
        System.out.println(Enum1.FIRST_AUDIT.compareTo(first));
        if (first.toString() == "FIRST_AUDIT"){
            System.out.println(first.toString());
        }

    }
}
