package extendableVendingMachine;

import extendableVendingMachine.product.Candy;
import extendableVendingMachine.product.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyTest {
    @Test
    public void shouldBeAbleToAddSaltyCandy() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Candy candy = new Candy();

        extendableVendingMachine.addStock(candy);

        assertEquals(3, extendableVendingMachine.getStock(candy));
    }

    @Test
    public void shouldBeAbleToAddMultipleCandy() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Candy candy = new Candy();

        extendableVendingMachine.addStock(candy);
        extendableVendingMachine.addStock(candy);
        extendableVendingMachine.addStock(candy);

        assertEquals(9, extendableVendingMachine.getStock(candy));
    }

    @Test
    public void shouldBeAbleToAddAndBuyCandy() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Candy candy = new Candy();

        extendableVendingMachine.addStock(candy);
        extendableVendingMachine.addStock(candy);
        extendableVendingMachine.addStock(candy);
        extendableVendingMachine.addStock(candy);
        extendableVendingMachine.addStock(candy);

        extendableVendingMachine.buy(candy);
        extendableVendingMachine.buy(candy);

        assertEquals(13, extendableVendingMachine.getStock(candy));
    }

    @Test
    public void shouldBeAbleToUseChildObjectForCandy() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Product candyProduct = new Candy();
        Candy candy = new Candy();

        extendableVendingMachine.addStock(candyProduct, 5);
        extendableVendingMachine.buy(candyProduct, 2);

        assertEquals(3, extendableVendingMachine.getStock(candy));
    }
}
