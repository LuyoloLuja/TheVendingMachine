package vending;

import vending.product.*;

public class OverloadedVendingMachine {
    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

    // --- BUY METHODS --- //
    void buy(SoftDrink softDrink) {
        if (softDrink != null) {
            softDrinkQty--;
        } else {
            System.out.println("Soft drink is out of stock");
        }
    }
    void buy(SaltySnack saltySnack) {
        if (saltySnack != null) {
            saltySnacksQty--;
        } else {
            System.out.println("Salty Snack is out of stock");
        }
    }
    void buy(Chocolate chocolate) {
        if (chocolate != null) {
            chocolatesQty--;
        }
    }
    void buy(Product product) {
        softDrinkQty--;
        saltySnacksQty--;
        chocolatesQty--;
    }

    // --- ADD STOCK METHODS --- //
    void addStock(SoftDrink softdrink) {
        if (softdrink == null) {
            softDrinkQty++;
        }
    }
    void addStock(SaltySnack saltySnack) {
        if (saltySnack == null) {
            saltySnacksQty++;
        }
    }
    void addStock(Chocolate chocolate) {
        if (chocolate == null) {
            chocolatesQty++;
        }
    }
    void addStock(Product product) {
        softDrinkQty++;
        saltySnacksQty++;
        chocolatesQty++;
    }

    // --- GET STOCK METHODS --- //
    int getStock(SoftDrink softdrink) {
        return softDrinkQty;
    }
}
