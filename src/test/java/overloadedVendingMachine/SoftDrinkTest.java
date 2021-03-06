package overloadedVendingMachine;

import org.junit.jupiter.api.Test;
import overloadedVendingMachine.product.Chocolate;
import overloadedVendingMachine.product.Product;
import overloadedVendingMachine.product.SaltySnack;
import overloadedVendingMachine.product.SoftDrink;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SoftDrinkTest {
    @Test
    public void shouldBeAbleToAddSoftDrink() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        overloadedVendingMachine.addStock(softDrink);

        assertEquals(1, overloadedVendingMachine.getStock(softDrink));
    }

    @Test
    public void shouldBeAbleToAddMultipleSoftDrinks() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(softDrink);

        assertEquals(3, overloadedVendingMachine.getStock(softDrink));
    }

    @Test
    public void shouldBeAbleToAddAndBuySoftDrink() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(softDrink);
        overloadedVendingMachine.addStock(softDrink);

        overloadedVendingMachine.buy(softDrink);
        overloadedVendingMachine.buy(softDrink);

        assertEquals(3, overloadedVendingMachine.getStock(softDrink));
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
    public void shouldBeAbleToAddAndBuySoftDrinkUsingTwoArguments() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        overloadedVendingMachine.addStock(softDrink, 5);
        overloadedVendingMachine.buy(softDrink, 1);

        assertEquals(4, overloadedVendingMachine.getStock());
    }

    @Test
    public void shouldBeAbleToUseChildObject() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(0, 0, 0);
        Product softDrinkProduct = new SoftDrink();
        SoftDrink softDrink = new SoftDrink();

        overloadedVendingMachine.addStock(softDrinkProduct, 5);
        overloadedVendingMachine.buy(softDrinkProduct, 2);

        assertEquals(3, overloadedVendingMachine.getStock(softDrink));
    }
}
