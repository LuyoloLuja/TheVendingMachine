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
        if (softDrink != null && softDrinkQty > 0) {
            softDrinkQty--;
        }
    }
    void buy(SaltySnack saltySnack) {
        if (saltySnack != null && saltySnacksQty > 0) {
            saltySnacksQty--;
        }
    }
    void buy(Chocolate chocolate) {
        if (chocolate != null && chocolatesQty > 0) {
            chocolatesQty--;
        }
    }
    void buy(Product product) {
        if (product != null && (softDrinkQty > 0 || saltySnacksQty > 0 || chocolatesQty > 0)) {
            softDrinkQty--;
            saltySnacksQty--;
            chocolatesQty--;
        }
    }

    // --- BUY SPECIFIC PRODUCT METHOD --- //
    void buy(Product product, int quantity) {

        if (product instanceof SoftDrink && softDrinkQty > 0) {
            softDrinkQty -= quantity;
        } else if (product instanceof SaltySnack && saltySnacksQty > 0) {
            saltySnacksQty -= quantity;
        } else if (product instanceof Chocolate && chocolatesQty > 0) {
            chocolatesQty -= quantity;
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
        if (product != null) {
            softDrinkQty += 3;
            saltySnacksQty += 3;
            chocolatesQty += 3;
        }
    }

    // --- ADD STOCK METHOD FOR A SPECIFIC PRODUCT --- //
    void addStock(Product product, int quantity) {

        if(product instanceof SoftDrink) {
            softDrinkQty += quantity;
        } else if(product instanceof SaltySnack) {
            saltySnacksQty += quantity;
        } else if(product instanceof Chocolate) {
            chocolatesQty += quantity;
        }
    }

    // --- GET STOCK METHODS --- //
    int getStock(SoftDrink softdrink) {
        int softDrinkStock = 0;

        if (softdrink != null) {
            return softDrinkQty += softDrinkStock;
        }
        return softDrinkStock;
    }

    int getStock(SaltySnack saltySnack) {
        int saltySnacksStock = 0;

        if (saltySnack != null) {
            return saltySnacksQty +=  saltySnacksStock;
        }
        return saltySnacksStock;
    }

    int getStock(Chocolate chocolate) {
        int chocolatesStock = 0;

        if (chocolate != null) {
            return chocolatesQty += chocolatesStock;
        }
        return chocolatesStock;
    }

    int getStock() {
        return softDrinkQty + saltySnacksQty + chocolatesQty;
    }
}
