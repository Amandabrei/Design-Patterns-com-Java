package strategy;

public class NoDiscount implements DiscountStrategy {
    public double apply(double total) {
        return total;
    }
}
