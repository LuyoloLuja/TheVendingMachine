package vending;

import vending.product.Product;
import vending.product.Chocolate;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

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
        }
    }
    void buy(SaltySnack saltySnack) {
        if (saltySnack != null) {
            saltySnacksQty--;
        }
    }
    void buy(Chocolate chocolate) {
        if (chocolate != null) {
            chocolatesQty--;
        }
    }
    void buy(Product product) {

        if (product instanceof SoftDrink) {
            softDrinkQty--;
        } else if (product instanceof SaltySnack) {
            saltySnacksQty--;
        } else if (product instanceof Chocolate) {
            chocolatesQty--;
        }
    }

    // --- ADD STOCK METHODS --- //
    void addStock(SoftDrink softdrink) {
        if (softdrink != null) {
            softDrinkQty++;
        }
    }
    void addStock(SaltySnack saltySnack) {
        if (saltySnack != null) {
            saltySnacksQty++;
        }
    }
    void addStock(Chocolate chocolate) {
        if (chocolate != null) {
            chocolatesQty++;
        }
    }
    void addStock(Product product) {
        if (product instanceof SoftDrink) {
            softDrinkQty++;
        } else if (product instanceof SaltySnack) {
            saltySnacksQty++;
        } else if (product instanceof Chocolate) {
            chocolatesQty++;
        }
    }

    // --- GET STOCK METHODS --- //
    int getStock(SoftDrink softdrink) {
        return softDrinkQty;
    }

    int getStock(SaltySnack saltySnack) {
        return saltySnacksQty;
    }

    int getStock(Chocolate chocolate) {
        return chocolatesQty;
    }
}
