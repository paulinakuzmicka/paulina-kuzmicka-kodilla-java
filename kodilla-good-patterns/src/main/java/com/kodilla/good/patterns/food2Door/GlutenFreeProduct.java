package com.kodilla.good.patterns.food2Door;

public class GlutenFreeProduct extends Product {
    private String productDescripion;
    public GlutenFreeProduct(String productName, String productDescription) {
        super(productName);
        this.productDescripion = productDescription;
    }
}
