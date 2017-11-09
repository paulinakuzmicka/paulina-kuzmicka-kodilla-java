package com.kodilla.good.patterns.food2Door;

public class GrainProduct extends Product {
    private boolean isBIO;

    public GrainProduct(String productName, boolean isBIO) {
        super(productName);
        this.isBIO = isBIO;
    }
}
