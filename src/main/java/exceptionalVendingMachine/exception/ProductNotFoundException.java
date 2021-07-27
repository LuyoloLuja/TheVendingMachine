package exceptionalVendingMachine.exception;

public class ProductNotFoundException extends Exception {
    public  ProductNotFoundException(String error) {
        super(error);
    }
}
