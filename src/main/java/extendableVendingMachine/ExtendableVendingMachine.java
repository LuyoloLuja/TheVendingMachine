package extendableVendingMachine;

import extendableVendingMachine.product.*;

public class ExtendableVendingMachine {
    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;
    private int candyQty;

    ExtendableVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty, int candyQty) {
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
        this.candyQty = candyQty;
    }

    void buy(Product product) {
        if (product instanceof SoftDrink && softDrinkQty > 0) {
            softDrinkQty--;
        } else if (product instanceof SaltySnack && saltySnacksQty > 0) {
            saltySnacksQty--;
        } else if (product instanceof Chocolate && chocolatesQty > 0) {
            chocolatesQty--;
        } else if (product instanceof Candy && candyQty > 0) {
            candyQty--;
        }
    }

    void buy(Product product, int quantity) {

        if (product instanceof SoftDrink && softDrinkQty > 0) {
            softDrinkQty -= quantity;
        } else if (product instanceof SaltySnack && saltySnacksQty > 0) {
            saltySnacksQty -= quantity;
        } else if (product instanceof Chocolate && chocolatesQty > 0) {
            chocolatesQty -= quantity;
        } else if (product instanceof Candy && candyQty > 0) {
            candyQty -= quantity;
        }
    }

    void addStock(Product product) {
        if (product instanceof SoftDrink) {
            softDrinkQty += 3;
        } else if (product instanceof SaltySnack) {
            saltySnacksQty += 3;
        } else if (product instanceof Chocolate) {
            chocolatesQty += 3;
        } else if (product instanceof Candy) {
            candyQty += 3;
        }
    }

    void addStock(Product product, int quantity) {

        if(product instanceof SoftDrink) {
            softDrinkQty += quantity;
        } else if(product instanceof SaltySnack) {
            saltySnacksQty += quantity;
        } else if(product instanceof Chocolate) {
            chocolatesQty += quantity;
        } else if(product instanceof Candy) {
            candyQty += quantity;
        }
    }

    int getStock(Product product) {
        if (product instanceof SoftDrink) {
            return softDrinkQty;
        } else if (product instanceof SaltySnack) {
            return saltySnacksQty;
        } else if (product instanceof Chocolate) {
            return chocolatesQty;
        } else if (product instanceof Candy) {
            return candyQty;
        }
        else {
            return softDrinkQty + saltySnacksQty + chocolatesQty + candyQty;
        }
    }
}
