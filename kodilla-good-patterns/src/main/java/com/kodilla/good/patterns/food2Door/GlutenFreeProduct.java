package com.kodilla.good.patterns.food2Door;

public class GlutenFreeProduct extends Product {
    private String productDescripion;
    public GlutenFreeProduct(String productName, String productDescription) {
        super(productName);
        this.productDescripion = productDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GlutenFreeProduct that = (GlutenFreeProduct) o;

        return productDescripion.equals(that.productDescripion);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + productDescripion.hashCode();
        return result;
    }
}
