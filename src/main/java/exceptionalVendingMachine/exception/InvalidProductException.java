package exceptionalVendingMachine.exception;

public class InvalidProductException extends ProductNotFoundException {
    public InvalidProductException(String error) {
        super(error);
    }
}
