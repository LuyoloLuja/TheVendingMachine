package exceptionalVendingMachine;

public class ProductNotFoundException extends Exception {

    String SoftDrinksOutOfStockException() {
        return "Soft drink is out stock";
    }

    String SaltyCracksAllEatenException() {
        return "Salty Snack is out stock";
    }

    String ChocolatesAllGoneException() {
        return "Chocolate is out of stock";
    }
}
