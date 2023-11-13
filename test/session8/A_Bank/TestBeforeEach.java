package session8.A_Bank;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestBeforeEach {

    BankAccount account = null;

    @BeforeEach
    public void beforeEach() {
        account = new BankAccount(100);
    }

    @Test
    public void openAccount() {
        assertNotNull(account);
    }

    @Test
    public void withdraw01() {

        account.withdraw(25);
        assertEquals(75, account.getBalance());
    }

    @Test
    public void isOverdrawn01() {
        account.withdraw(500_000);
        assertTrue(account.isOverdrawn());
    }

    @Test
    public void isOverdrawn02() {
        account.withdraw(25);
        assertFalse(account.isOverdrawn());
    }


}
