package exceptionalVendingMachine;

import exceptionalVendingMachine.product.*;
import exceptionalVendingMachine.exception.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class exceptionalTest {
    @Test
    public void shouldThrowExceptionIfThereIsNoStockForSoftDrinks() {
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        exceptionalVendingMachine.addStock(softDrink, 0);
        Throwable throwable = assertThrows(SoftDrinksOutOfStockException.class, () -> exceptionalVendingMachine.buy(softDrink));

        assertEquals("Soft Drinks are out of stock, please enter an available product.", throwable.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfThereIsNoStockForSaltySnacks() {
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();

        exceptionalVendingMachine.addStock(saltySnack, 0);
        Throwable throwable = assertThrows(SaltyCracksAllEatenException.class, () -> exceptionalVendingMachine.buy(saltySnack));

        assertEquals("Salty snacks are out of stock, please enter an available product.", throwable.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfThereIsNoStockForChocolate() {
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        Chocolate chocolate = new Chocolate();

        exceptionalVendingMachine.addStock(chocolate, 0);
        Throwable throwable = assertThrows(ChocolatesAllGoneException.class, () -> exceptionalVendingMachine.buy(chocolate));

        assertEquals("Chocolates are out of stock, please enter an available product.", throwable.getMessage());
    }
}
