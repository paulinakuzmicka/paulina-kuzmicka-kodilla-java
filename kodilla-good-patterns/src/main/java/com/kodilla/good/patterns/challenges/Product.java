package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

abstract class Product {
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;

    public Product(String productName, String productDescription, BigDecimal productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }
}
