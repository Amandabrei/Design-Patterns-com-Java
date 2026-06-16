package facade;

import checkout.Checkout;
import singleton.AppConfig;
import strategy.*;

    public class CheckoutFacade {

        public double finishPurchase(double total, String type) {

            DiscountStrategy strategy;

            switch (type) {
                case "VIP":
                    strategy = new VipDiscount();
                    break;
                case "PROMO":
                    strategy = new PromoDiscount();
                    break;
                default:
                    strategy = new NoDiscount();
            }

            Checkout checkout = new Checkout(strategy);

            double finalPrice = checkout.calculate(total);

            System.out.println("Moeda: " + AppConfig.getInstance().getMoeda());

            return finalPrice;
        }
    }
