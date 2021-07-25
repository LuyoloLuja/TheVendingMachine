package extendableVendingMachine;

import org.junit.jupiter.api.Test;
import extendableVendingMachine.product.Product;
import extendableVendingMachine.product.SaltySnack;
import extendableVendingMachine.product.SoftDrink;
import extendableVendingMachine.product.Chocolate;
import extendableVendingMachine.product.Candy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SoftDrinkTest {
    @Test
    public void shouldBeAbleToAddSoftDrink() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        extendableVendingMachine.addStock(softDrink);

        assertEquals(3, extendableVendingMachine.getStock(softDrink));
    }

    @Test
    public void shouldBeAbleToAddMultipleSoftDrinks() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        extendableVendingMachine.addStock(softDrink);
        extendableVendingMachine.addStock(softDrink);
        extendableVendingMachine.addStock(softDrink);

        assertEquals(9, extendableVendingMachine.getStock(softDrink));
    }

    @Test
    public void shouldBeAbleToAddAndBuySoftDrink() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        extendableVendingMachine.addStock(softDrink);
        extendableVendingMachine.addStock(softDrink);
        extendableVendingMachine.addStock(softDrink);
        extendableVendingMachine.addStock(softDrink);
        extendableVendingMachine.addStock(softDrink);

        extendableVendingMachine.buy(softDrink);
        extendableVendingMachine.buy(softDrink);

        assertEquals(13, extendableVendingMachine.getStock(softDrink));
    }

    @Test
    public void shouldBeAbleToAddAndBuyAllAvailableProducts() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);

        SoftDrink softDrink = new SoftDrink();
        SaltySnack saltySnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        Candy candy = new Candy();
        Product product = new Product();

        extendableVendingMachine.addStock(softDrink);
        extendableVendingMachine.addStock(softDrink);
        extendableVendingMachine.addStock(saltySnack);
        extendableVendingMachine.addStock(saltySnack);
        extendableVendingMachine.addStock(chocolate);
        extendableVendingMachine.addStock(chocolate);
        extendableVendingMachine.addStock(candy);
        extendableVendingMachine.addStock(candy);

        extendableVendingMachine.buy(softDrink);
        extendableVendingMachine.buy(saltySnack);
        extendableVendingMachine.buy(chocolate);
        extendableVendingMachine.buy(candy);

        assertEquals(20, extendableVendingMachine.getStock(product));
    }

    @Test
    public void shouldNotBeAbleToAddAndBuyAlUsingProductMethod() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Product product = new Product();

        extendableVendingMachine.addStock(product);
        extendableVendingMachine.buy(product);

        assertEquals(0, extendableVendingMachine.getStock(product));
    }

    @Test
    public void shouldNotBeAbleToBuyIfThereIsNoStockAvailable() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        SoftDrink softDrink = new SoftDrink();
        Chocolate chocolate = new Chocolate();
        SaltySnack saltySnack = new SaltySnack();
        Product product = new Product();

        extendableVendingMachine.buy(softDrink);
        extendableVendingMachine.buy(chocolate);
        extendableVendingMachine.buy(saltySnack);

        assertEquals(0, extendableVendingMachine.getStock(product));
    }

    @Test
    public void shouldBeAbleToAddAndBuySoftDrinkUsingTwoArguments() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        extendableVendingMachine.addStock(softDrink, 5);
        extendableVendingMachine.buy(softDrink, 1);

        assertEquals(4, extendableVendingMachine.getStock(softDrink));
    }

    @Test
    public void shouldBeAbleToUseChildObjectForSoftDrink() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Product softDrinkProduct = new SoftDrink();
        SoftDrink softDrink = new SoftDrink();

        extendableVendingMachine.addStock(softDrinkProduct, 5);
        extendableVendingMachine.buy(softDrinkProduct, 2);

        assertEquals(3, extendableVendingMachine.getStock(softDrink));
    }
}
