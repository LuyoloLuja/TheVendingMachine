package vending;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class Main {
    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0,  0, 0);

        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        Product product = new Product();

        // add soft drinks
        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(softDrink);

        // add salty snacks
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);

        // add chocolate
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);

        // add all products
        overloadedVendingMachine.addStock(product);

        // buy products
        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.buy(chocolate);
        overloadedVendingMachine.buy(product);

        // add products using 2 argument overloading method
        overloadedVendingMachine.addStock(softDrink, 1);
        overloadedVendingMachine.addStock(saltySnack, 2);
        overloadedVendingMachine.addStock(chocolate, 3);

        // buy products using 2 argument overloading method
        overloadedVendingMachine.buy(softDrink, 1);
        overloadedVendingMachine.buy(saltySnack, 2);
        overloadedVendingMachine.buy(chocolate, 3);

        // print results
        System.out.println(softDrink.description() + overloadedVendingMachine.getStock(softDrink));
        System.out.println(saltySnack.description() + overloadedVendingMachine.getStock(saltySnack));
        System.out.println(chocolate.description() + overloadedVendingMachine.getStock(chocolate));
        System.out.println(product.description() + overloadedVendingMachine.getStock());
    }
}