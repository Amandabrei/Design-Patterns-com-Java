package strategy;

public class PromoDiscount implements DiscountStrategy {
    public double apply(double total) {
        return total * 0.9;
    }
}
