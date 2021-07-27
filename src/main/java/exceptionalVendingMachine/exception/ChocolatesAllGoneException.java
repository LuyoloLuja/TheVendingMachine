package exceptionalVendingMachine.exception;

public class ChocolatesAllGoneException extends ProductNotFoundException {
    public ChocolatesAllGoneException(String error) {
        super(error);
    }
}
