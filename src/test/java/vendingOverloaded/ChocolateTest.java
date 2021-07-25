package vendingOverloaded;

import org.junit.jupiter.api.Test;
import vendingOverloaded.product.Chocolate;
import vendingOverloaded.product.Product;
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
    public void shouldBeAbleToAddAndBuyAlUsingProductMethod() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        Product product = new Product();

        overloadedVendingMachine.addStock(product);
        overloadedVendingMachine.buy(product);

        assertEquals(6, overloadedVendingMachine.getStock());
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

    @Test
    public void shouldBeAbleToAddAndBuyChocolateUsingTwoArguments() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        Chocolate chocolate = new Chocolate();

        overloadedVendingMachine.addStock(chocolate, 5);
        overloadedVendingMachine.buy(chocolate, 1);

        assertEquals(4, overloadedVendingMachine.getStock());
    }

    @Test
    public void shouldBeAbleToUseChildObject() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        Product chocolateProduct = new Chocolate();
        Chocolate chocolate = new Chocolate();

        overloadedVendingMachine.addStock(chocolateProduct, 5);
        overloadedVendingMachine.buy(chocolateProduct, 2);

        assertEquals(3, overloadedVendingMachine.getStock(chocolate));
    }

}
