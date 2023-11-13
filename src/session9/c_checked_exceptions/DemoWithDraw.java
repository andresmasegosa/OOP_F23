package session9.c_checked_exceptions;

import java.util.Scanner;

public class DemoWithDraw {

    public static void main(String[] args) throws NegativeAmountException, InsufficientFundsException {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(100);

        System.out.println("Current Account Balance: "+account.getBalance());

        System.out.println("Enter an amount to withdraw:");

        int amount = scanner.nextInt();

        account.withdraw(amount);

    }
}
