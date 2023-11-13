package session9.b_customexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * Exercise: Write tests for the BankAccount deposit method.
 *
 * Background:
 * The BankAccount class has a method named deposit that is intended to increase the account balance by
 * the amount specified. However, there are rules that must be followed for a deposit to be considered valid:
 * 1. The deposit amount must not be negative.
 * 2. Deposits above a certain threshold (e.g., 100,000 DKK) must be flagged for review.
 *
 * Objective:
 * Your task is to write JUnit tests for the deposit method in the BankAccount class. You must ensure that:
 *
 * 1. The deposit method correctly updates the account balance under standard conditions.
 *    Write a test that confirms the account balance is correctly updated when a positive amount is deposited.
 *
 * 2. The deposit method throws a NegativeDepositException when a negative amount is attempted to be deposited.
 *    Write a test that expects this exception to be thrown to validate that negative deposits are not allowed.
 *
 * 3. The deposit method throws a WarningLargeDeposit exception when a large deposit exceeding the
 *    regulatory threshold is made.
 *    Write a test that expects this exception to be thrown and confirms that the exception contains the correct
 *    deposit amount that triggered the warning.
 *
 * Instructions:
 * - Use JUnit to write the tests.
 * - Use the assertEquals method to check that the account balance is correct after a deposit.
 * - Use the assertThrows method to check that the correct exception is thrown for invalid deposit amounts.
 * - Ensure that the balance remains unchanged after an exception is thrown.
 * - The skeleton code for the tests is already provided. Complete the tests according to the requirements.
 *
 * Notes:
 * - Remember to import the necessary JUnit classes to your test file.
 * - Ensure you handle the exceptions within the tests as expected.
 *
 */


class Exercise {


    @Test
    void testDeposit() {
        BankAccount bankAccount = new BankAccount(100);
    }

    @Test
    void negativeAmountException() {
        BankAccount bankAccount = new BankAccount(100);
    }

    @Test
    void largeAmountException() {
        BankAccount bankAccount = new BankAccount(100);
    }


}