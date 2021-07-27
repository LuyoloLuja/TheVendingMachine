package exceptionalVendingMachine.exception;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {

    public SoftDrinksOutOfStockException(String error){
        super(error);
    }
}
