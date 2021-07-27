package exceptionalVendingMachine.exception;

public class SaltyCracksAllEatenException extends ProductNotFoundException{
    public SaltyCracksAllEatenException(String error) {
        super(error);
    }
}
