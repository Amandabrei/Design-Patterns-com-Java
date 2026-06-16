//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import facade.CheckoutFacade;

public class Main {
    public static void main(String[] args) {

        CheckoutFacade facade = new CheckoutFacade();

        double total = 100.0;

        double result = facade.finishPurchase(total, "VIP");

        System.out.println("Preço final: " + result);
    }
}