package exceptionalVendingMachine;

import exceptionalVendingMachine.product.*;
import exceptionalVendingMachine.exception.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class exceptionalTest {
    @Test
    public void shouldThrowExceptionForSoftDrinks() {
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        Throwable throwable = assertThrows(SoftDrinksOutOfStockException.class, () -> exceptionalVendingMachine.buy(softDrink));

        assertEquals("Soft Drinks are out of stock, please enter an available product.", throwable.getMessage());
    }

    @Test
    public void shouldThrowExceptionForSaltySnacks() {
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();

        Throwable throwable = assertThrows(SaltyCracksAllEatenException.class, () -> exceptionalVendingMachine.buy(saltySnack));

        assertEquals("Salty snacks are out of stock, please enter an available product.", throwable.getMessage());
    }

    @Test
    public void shouldThrowExceptionForChocolate() {
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        Chocolate chocolate = new Chocolate();

        Throwable throwable = assertThrows(ChocolatesAllGoneException.class, () -> exceptionalVendingMachine.buy(chocolate));

        assertEquals("Chocolates are out of stock, please enter an available product.", throwable.getMessage());
    }

    @Test
    public void shouldCheckIfExceptionMessageIsCorrectSoftDrink() {
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        SoftDrink softDrink = new SoftDrink();

        Throwable throwableForSoftDrink = assertThrows(SoftDrinksOutOfStockException.class, () -> exceptionalVendingMachine.buy(softDrink));

        String expectedMessageForSoftDrink = "Soft Drinks are out of stock, please enter an available product.";
        String actualMessageForSoftDrink = throwableForSoftDrink.getMessage();

        assertTrue(actualMessageForSoftDrink.contains(expectedMessageForSoftDrink));
    }

    @Test
    public void shouldCheckIfExceptionMessageIsCorrectForSaltySnack() {
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        SaltySnack saltySnack = new SaltySnack();

        Throwable throwableForSaltySnack = assertThrows(SaltyCracksAllEatenException.class, () -> exceptionalVendingMachine.buy(saltySnack));

        String expectedMessageSaltySnack = "Salty snacks are out of stock, please enter an available product.";
        String actualMessageSaltySnack = throwableForSaltySnack.getMessage();

        assertTrue(actualMessageSaltySnack.contains(expectedMessageSaltySnack));
    }

    @Test
    public void shouldCheckIfExceptionMessageIsCorrectChocolate() {
        ExceptionalVendingMachine exceptionalVendingMachine = new ExceptionalVendingMachine(0, 0, 0);
        Chocolate chocolate = new Chocolate();

        Throwable throwableForChocolate = assertThrows(ChocolatesAllGoneException.class, () -> exceptionalVendingMachine.buy(chocolate));

        String expectedMessageForChocolate = "Chocolates are out of stock, please enter an available product.";
        String actualMessageForChocolate = throwableForChocolate.getMessage();

        assertTrue(actualMessageForChocolate.contains(expectedMessageForChocolate));
    }
}
