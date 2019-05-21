package com.wangnz.learn.pattern.factory.prd;

import com.wangnz.learn.pattern.factory.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("use idcard " + owner);
    }

    public String getOwner() {
        return owner;
    }
}
