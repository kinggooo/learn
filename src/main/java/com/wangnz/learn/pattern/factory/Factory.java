package com.wangnz.learn.pattern.factory;

public abstract class Factory {
    public Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product p);
}
