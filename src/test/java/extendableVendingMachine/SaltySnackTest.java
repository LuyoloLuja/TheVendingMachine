package extendableVendingMachine;

import org.junit.jupiter.api.Test;
import extendableVendingMachine.product.Product;
import extendableVendingMachine.product.SaltySnack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaltySnackTest {
    @Test
    public void shouldBeAbleToAddSaltySnack() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();

        extendableVendingMachine.addStock(saltySnack);

        assertEquals(3, extendableVendingMachine.getStock(saltySnack));
    }

    @Test
    public void shouldBeAbleToAddMultipleSaltySnack() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();

        extendableVendingMachine.addStock(saltySnack);
        extendableVendingMachine.addStock(saltySnack);
        extendableVendingMachine.addStock(saltySnack);

        assertEquals(9, extendableVendingMachine.getStock(saltySnack));
    }

    @Test
    public void shouldBeAbleToAddAndBuySaltySnack() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();

        extendableVendingMachine.addStock(saltySnack);
        extendableVendingMachine.addStock(saltySnack);
        extendableVendingMachine.addStock(saltySnack);
        extendableVendingMachine.addStock(saltySnack);
        extendableVendingMachine.addStock(saltySnack);

        extendableVendingMachine.buy(saltySnack);
        extendableVendingMachine.buy(saltySnack);

        assertEquals(13, extendableVendingMachine.getStock(saltySnack));
    }

    @Test
    public void shouldBeAbleToUseChildObjectForSaltySnack() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Product saltySnackDrinkProduct = new SaltySnack();
        SaltySnack saltySnack = new SaltySnack();

        extendableVendingMachine.addStock(saltySnackDrinkProduct, 5);
        extendableVendingMachine.buy(saltySnackDrinkProduct, 2);

        assertEquals(3, extendableVendingMachine.getStock(saltySnack));
    }
}
