package exceptionalVendingMachine;

import exceptionalVendingMachine.exception.ProductNotFoundException;
import exceptionalVendingMachine.product.*;

public class Main {

    public static void main(String[] args) throws ProductNotFoundException {
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine( 0, 0, 0);

        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();

        try {
            // should throw an exception -- InvalidProductException
            // Candy candy = new Candy();
            // exceptionalVendingMachine.addStock(candy, 3);

            // should throw exceptions -- SoftDrinksOutOfStockException, SaltyCracksAllEatenException && ChocolatesAllGoneException
            // exceptionalVendingMachine.addStock(softDrink, 0);
            // exceptionalVendingMachine.addStock(saltySnack, 0);
            // exceptionalVendingMachine.addStock(chocolate, 0);

            //  add products using 2 argument overloading method
            exceptionalVendingMachine.addStock(softDrink, 3);
            exceptionalVendingMachine.addStock(saltySnack, 6);
            exceptionalVendingMachine.addStock(chocolate, 9);

            // print the stock before buying
            System.out.println("-- Stock Before Buying --");
            System.out.println("Soft Drinks: " +  exceptionalVendingMachine.getStock(softDrink));
            System.out.println("Salty Snacks: " +  exceptionalVendingMachine.getStock(saltySnack));
            System.out.println("Chocolates: " +  exceptionalVendingMachine.getStock(chocolate));

            // buy products using 2 argument overloading method
            exceptionalVendingMachine.buy(softDrink);
            exceptionalVendingMachine.buy(saltySnack);
            exceptionalVendingMachine.buy(chocolate);

            // print results
            System.out.println("");
            System.out.println("-- Stock After Buying --");
            System.out.println(softDrink.description() + exceptionalVendingMachine.getStock(softDrink));
            System.out.println(saltySnack.description() + exceptionalVendingMachine.getStock(saltySnack));
            System.out.println(chocolate.description() + exceptionalVendingMachine.getStock(chocolate));

        } catch (ProductNotFoundException error) {
            error.printStackTrace();
        }
    }
}
