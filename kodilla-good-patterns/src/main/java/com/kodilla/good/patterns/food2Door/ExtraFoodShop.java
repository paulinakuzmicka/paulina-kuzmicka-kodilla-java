package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements FoodProducer {

    Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = createProductList();
    }

    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new MeatProduct("pork chop", "pork"), 10);
        productsList.put(new MeatProduct("knuckle", "pork"), 5);
        productsList.put(new GrainProduct("millet", true), 20);
        productsList.put(new GrainProduct("oatmeal", false), 0);

        return productsList;
    }

    @Override
    public boolean process() {


        return false;
    }
}
