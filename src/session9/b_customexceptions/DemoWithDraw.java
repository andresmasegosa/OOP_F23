package session9.b_customexceptions;

import java.util.Scanner;

public class DemoWithDraw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(100);

        System.out.println("Current Account Balance: "+account.getBalance());

        System.out.println("Enter an amount to withdraw:");

        int amount = scanner.nextInt();

        try {
            account.withdraw(amount);
        } catch (NegativeWithdrawException e) {
            System.out.println("Amount cannot be negative!");
        } catch (InsufficientFundsException e) {
            System.out.println("You are short: " + e.getDeficit());
        }
    }
}
