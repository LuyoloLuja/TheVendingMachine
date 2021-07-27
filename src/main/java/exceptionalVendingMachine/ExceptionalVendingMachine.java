package exceptionalVendingMachine;

import extendableVendingMachine.product.*;

public class ExceptionalVendingMachine {
    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;
    private int candyQty;

    ExceptionalVendingMachine (int softDrinkQty, int saltySnacksQty, int chocolatesQty, int candyQty) {
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
        this.candyQty = candyQty;
    }

    void buy(Product product) throws ProductNotFoundException {
        if (softDrinkQty < 0) {
            throw new ProductNotFoundException();
        } else if (product instanceof SoftDrink && softDrinkQty > 0) {
            softDrinkQty--;
        }

        else if (product instanceof SaltySnack && saltySnacksQty > 0) {
            saltySnacksQty--;
        } else if (product instanceof Chocolate && chocolatesQty > 0) {
            chocolatesQty--;
        } else if (product instanceof Candy && candyQty > 0) {
            candyQty--;
        }
    }

}
