package session9.a_bankaccount;

import java.util.Scanner;

public class DemoWithDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(100);

        System.out.println("Current Account Balance: " + account.getBalance());


        boolean error = false;
        do{
            System.out.println("Enter an amount to withdraw: ");
            int amount = scanner.nextInt();

            try {
                account.withdraw(amount);
                System.out.println("Everything was fine!");
                error=false;
            } catch (IllegalArgumentException e) {
                System.out.println("Something went wrong: " + e.getMessage());
                error=true;
            }

        }while (error);

    }
}
