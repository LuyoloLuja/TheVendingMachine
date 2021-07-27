package exceptionalVendingMachine;

import exceptionalVendingMachine.exception.*;
import exceptionalVendingMachine.product.*;

public class ExceptionalVendingMachine {
    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    ExceptionalVendingMachine (int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

    void buy(Product product) throws ProductNotFoundException {

        if (!(product instanceof SoftDrink) || !(product instanceof SaltySnack) || !(product instanceof Chocolate)) {
            throw new InvalidProductException("Product Not found, please enter an available product.");
        }

        if (product instanceof SoftDrink) {
            if (softDrinkQty <= 0) {
                throw new SoftDrinksOutOfStockException("Soft Drinks are out of stock, please enter an available product.");
            } else  {
                softDrinkQty--;
            }
        }

        if (product instanceof SaltySnack) {
            if (saltySnacksQty <= 0) {
                throw new SaltyCracksAllEatenException("Salty snacks are out of stock, please enter an available product.");
            } else {
                saltySnacksQty--;
            }
        }

        if (product instanceof Chocolate) {
            if (saltySnacksQty <= 0) {
                throw new ChocolatesAllGoneException("Chocolates are out of stock, please enter an available product.");
            } else {
                chocolatesQty--;
            }
        }
    }

    void addStock(Product product, int quantity) {

        if(product instanceof SoftDrink) {
            softDrinkQty += quantity;
        } else if(product instanceof SaltySnack) {
            saltySnacksQty += quantity;
        } else if(product instanceof Chocolate) {
            chocolatesQty += quantity;
        }
    }

    int getStock(Product product) {
        if (product instanceof SoftDrink) {
            return softDrinkQty;
        } else if (product instanceof SaltySnack) {
            return saltySnacksQty;
        } else if (product instanceof Chocolate) {
            return chocolatesQty;
        }
        else {
            return softDrinkQty + saltySnacksQty + chocolatesQty;
        }
    }


}
