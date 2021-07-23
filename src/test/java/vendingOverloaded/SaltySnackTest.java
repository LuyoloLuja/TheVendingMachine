package vendingOverloaded;

import org.junit.jupiter.api.Test;
import vendingOverloaded.product.Chocolate;
import vendingOverloaded.product.SaltySnack;
import vendingOverloaded.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaltySnackTest {
    @Test
    public void shouldBeAbleToAddSaltySnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();

        overloadedVendingMachine.addStock(saltySnack);

        assertEquals(1, overloadedVendingMachine.getStock(saltySnack));
    }

    @Test
    public void shouldBeAbleToAddMultipleSaltySnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();

        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);

        assertEquals(3, overloadedVendingMachine.getStock(saltySnack));
    }

    @Test
    public void shouldBeAbleToAddAndBuySaltySnack() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();

        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);

        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.buy(saltySnack);

        assertEquals(3, overloadedVendingMachine.getStock(saltySnack));
    }

    @Test
    public void shouldBeAbleToAddAndBuyAllAvailableProducts() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);

        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();

        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(saltySnack);
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);

        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.buy(chocolate);

        assertEquals(3, overloadedVendingMachine.getStock());
    }

    @Test
    public void shouldNotBeAbleToBuyIfThereIsNoStockAvailable() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        SoftDrink softDrink = new SoftDrink();
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();

        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(chocolate);
        overloadedVendingMachine.buy(saltySnack);

        assertEquals(0, overloadedVendingMachine.getStock());
    }
}
