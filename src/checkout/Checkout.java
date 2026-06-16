package checkout;

import strategy.DiscountStrategy;

public class Checkout {

    private DiscountStrategy strategy;

    public Checkout(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double total) {
        return strategy.apply(total);
    }
}