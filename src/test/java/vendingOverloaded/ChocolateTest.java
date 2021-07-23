package vendingOverloaded;

import org.junit.jupiter.api.Test;
import vendingOverloaded.product.Chocolate;
import vendingOverloaded.product.SaltySnack;
import vendingOverloaded.product.SoftDrink;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateTest {
    @Test
    public void shouldBeAbleToAddChocolate() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        Chocolate chocolate = new Chocolate();

        overloadedVendingMachine.addStock(chocolate);

        assertEquals(1, overloadedVendingMachine.getStock(chocolate));
    }

    @Test
    public void shouldBeAbleToAddMultipleChocolates() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        Chocolate chocolate = new Chocolate();

        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);

        assertEquals(3, overloadedVendingMachine.getStock(chocolate));
    }

    @Test
    public void shouldBeAbleToAddAndBuyChocolates() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        Chocolate chocolate = new Chocolate();

        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);
        overloadedVendingMachine.addStock(chocolate);

        overloadedVendingMachine.buy(chocolate);
        overloadedVendingMachine.buy(chocolate);

        assertEquals(3, overloadedVendingMachine.getStock(chocolate));
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
