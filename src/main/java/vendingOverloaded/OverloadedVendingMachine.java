package vendingOverloaded;

import vendingOverloaded.product.Product;
import vendingOverloaded.product.Chocolate;
import vendingOverloaded.product.SaltySnack;
import vendingOverloaded.product.SoftDrink;

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
