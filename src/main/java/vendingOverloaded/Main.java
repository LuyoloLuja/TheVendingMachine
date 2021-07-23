package vendingOverloaded;
import vendingOverloaded.product.Chocolate;
import vendingOverloaded.product.Product;
import vendingOverloaded.product.SaltySnack;
import vendingOverloaded.product.SoftDrink;

public class Main {
    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(1,  2,3);

        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        Product product = new Product();

        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(product);

        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.buy(chocolate);
        overloadedVendingMachine.buy(product);

        System.out.println(softDrink.description() + overloadedVendingMachine.getStock(softDrink) + " items.");
        System.out.println(saltySnack.description() + overloadedVendingMachine.getStock(saltySnack) + " items.");
        System.out.println(chocolate.description() + overloadedVendingMachine.getStock(chocolate) + " items.");
        System.out.println(product.description() + overloadedVendingMachine.getStock() + " items.");
    }
}