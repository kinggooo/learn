package com.wangnz.learn.pattern.factory.prd;

import com.wangnz.learn.pattern.factory.Factory;
import com.wangnz.learn.pattern.factory.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(p);
    }

    public List getOwners() {
        return owners;
    }
}
