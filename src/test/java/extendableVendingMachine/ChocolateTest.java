package extendableVendingMachine;

import extendableVendingMachine.product.Chocolate;
import extendableVendingMachine.product.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateTest {
    @Test
    public void shouldBeAbleToAddSaltyChocolate() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Chocolate chocolate = new Chocolate();

        extendableVendingMachine.addStock(chocolate);

        assertEquals(3, extendableVendingMachine.getStock(chocolate));
    }
    @Test
    public void shouldBeAbleToAddMultipleChocolates() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Chocolate chocolate = new Chocolate();

        extendableVendingMachine.addStock(chocolate);
        extendableVendingMachine.addStock(chocolate);
        extendableVendingMachine.addStock(chocolate);

        assertEquals(9, extendableVendingMachine.getStock(chocolate));
    }

    @Test
    public void shouldBeAbleToAddAndBuyChocolate() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Chocolate chocolate = new Chocolate();

        extendableVendingMachine.addStock(chocolate);
        extendableVendingMachine.addStock(chocolate);
        extendableVendingMachine.addStock(chocolate);
        extendableVendingMachine.addStock(chocolate);
        extendableVendingMachine.addStock(chocolate);

        extendableVendingMachine.buy(chocolate);
        extendableVendingMachine.buy(chocolate);

        assertEquals(13, extendableVendingMachine.getStock(chocolate));
    }

    @Test
    public void shouldBeAbleToUseChildObjectForChocolate() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0, 0, 0, 0);
        Product chocolateProduct = new Chocolate();
        Chocolate chocolate = new Chocolate();

        extendableVendingMachine.addStock(chocolateProduct, 5);
        extendableVendingMachine.buy(chocolateProduct, 2);

        assertEquals(3, extendableVendingMachine.getStock(chocolate));
    }

}
