package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CalzoneDecorator extends AbstractPizzaOrderDecorator {
    protected CalzoneDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " calzone";
    }
}
