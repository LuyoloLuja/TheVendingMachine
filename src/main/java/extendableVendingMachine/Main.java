package extendableVendingMachine;

import extendableVendingMachine.product.*;

public class Main {
    public static void main(String[] args) {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);

        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        Candy candy = new Candy();
        Product product = new Product();

        // add soft drinks
        extendableVendingMachine.addStock(softDrink);
        extendableVendingMachine.addStock(softDrink);
        extendableVendingMachine.addStock(softDrink);

        // add salty snacks
        extendableVendingMachine.addStock(saltySnack);
        extendableVendingMachine.addStock(saltySnack);
        extendableVendingMachine.addStock(saltySnack);

        // add chocolates
        extendableVendingMachine.addStock(chocolate);
        extendableVendingMachine.addStock(chocolate);
        extendableVendingMachine.addStock(chocolate);

        // add candies
        extendableVendingMachine.addStock(candy);
        extendableVendingMachine.addStock(candy);
        extendableVendingMachine.addStock(candy);

        // add all products at once
        extendableVendingMachine.addStock(product);

        // print the stock before buying
        System.out.println("------------------------");
        System.out.println("Stock Before Buying: " + extendableVendingMachine.getStock(product));
        System.out.println("------------------------");

        // buy products
        extendableVendingMachine.buy(softDrink);
        extendableVendingMachine.buy(saltySnack);
        extendableVendingMachine.buy(chocolate);
        extendableVendingMachine.buy(candy);

        // buy all products at once
        extendableVendingMachine.buy(product);

        // add products using 2 argument overloading method
        extendableVendingMachine.addStock(softDrink, 1);
        extendableVendingMachine.addStock(saltySnack, 2);
        extendableVendingMachine.addStock(chocolate, 3);
        extendableVendingMachine.addStock(candy, 4);

        // buy products using 2 argument overloading method
        extendableVendingMachine.buy(softDrink, 1);
        extendableVendingMachine.buy(saltySnack, 2);
        extendableVendingMachine.buy(chocolate, 3);
        extendableVendingMachine.buy(candy, 4);

        // print results
        System.out.println(softDrink.description() + extendableVendingMachine.getStock(softDrink));
        System.out.println(saltySnack.description() + extendableVendingMachine.getStock(saltySnack));
        System.out.println(chocolate.description() + extendableVendingMachine.getStock(chocolate));
        System.out.println(candy.description() + extendableVendingMachine.getStock(candy));
        System.out.println(product.description() + extendableVendingMachine.getStock(product));
    }
}
