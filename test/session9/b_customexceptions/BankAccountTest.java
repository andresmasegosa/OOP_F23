package session9.b_customexceptions;

import org.junit.jupiter.api.Test;
import session9.b_customexceptions.BankAccount;
import session9.b_customexceptions.InsufficientFundsException;
import session9.b_customexceptions.NegativeWithdrawException;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testGetBalance() {
        BankAccount bankAccount = new BankAccount(100);
        assertEquals(100,bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.withdraw(10);
        assertEquals(90,bankAccount.getBalance());
    }

    @Test
    void negativeWithDrawException() {
        BankAccount bankAccount = new BankAccount(100);
        assertThrows(NegativeWithdrawException.class,
                ()-> {bankAccount.withdraw(-10);}
        );

        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void insufficientFundsException() {
        BankAccount bankAccount = new BankAccount(100);

        InsufficientFundsException fundsException =
                assertThrows(InsufficientFundsException.class,
                        ()->{bankAccount.withdraw(1000);});

        assertEquals(900,fundsException.getDeficit());

        assertEquals(100, bankAccount.getBalance());

    }
    
}