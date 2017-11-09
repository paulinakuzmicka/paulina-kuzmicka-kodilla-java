package com.kodilla.good.patterns.food2Door;

import java.math.BigDecimal;

abstract class Product {
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "productName='" + productName + '\'';
    }
}
