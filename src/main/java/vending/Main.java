package vending;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class Main {
    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0,  0,0);

        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();

        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(chocolate);

        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.buy(chocolate);

        System.out.println("Soft Drinks: " + overloadedVendingMachine.getStock(softDrink));
        System.out.println("Salty Snack: " + overloadedVendingMachine.getStock(saltySnack));
        System.out.println("Chocolate: " + overloadedVendingMachine.getStock(chocolate));
    }
}
