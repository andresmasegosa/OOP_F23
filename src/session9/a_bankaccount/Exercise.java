package session9.a_bankaccount;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Java Exercise: Exception Handling in BankAccount Class

    Background:
    In a simple bank account management application, the BankAccount class is
    responsible for handling basic transactions like deposits. Currently, the
    deposit method of this class does not handle cases where a user might try
    to deposit a negative amount, which is not a valid operation for a bank account.

    Objective:
    Your task is to modify the deposit method in the BankAccount class to ensure
    that it throws an IllegalArgumentException when a negative amount is passed
    as an argument. The exception should have an appropriate message that can
    inform the user about the invalid deposit attempt.

    Requirements:
    1. Within the BankAccount class, locate the deposit method.
    2. Implement a check at the beginning of the deposit method to determine if
       the passed amount is negative.
    3. If the amount is negative, throw an IllegalArgumentException with the message
       "Cannot deposit negative amount".
    4. Ensure that the deposit method works as expected for valid (non-negative)
       amounts by not altering the existing functionality.
    5. Test your updated BankAccount class with the provided code snippet to ensure that:
        - Positive amounts are deposited successfully.
        - An attempt to deposit a negative amount results in an IllegalArgumentException.
    6. Handle the exception in the main method where the deposit method is called,
       by catching the IllegalArgumentException and printing the exception message
       to the console.

    Example Output:
    For a valid deposit:
    ```
    Current Account Balance: 100
    Enter an amount to deposit:
    50
    Everything was fine!
    ```

    For an invalid (negative) deposit:
    ```
    Current Account Balance: 100
    Enter an amount to deposit:
    -50
    Something went wrong: Cannot deposit negative amount
    ```

    Hints:
    - Remember to use the throw keyword to throw an exception.
    - Use an if statement to check the condition for the amount being negative.

*/
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(100);

        System.out.println("Current Account Balance: "+account.getBalance());

        System.out.println("Enter an amount to deposit:");
        int amount = scanner.nextInt();

        account.deposit(amount);



        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session9_A", I_did_finish, I_did_understand, comment);
        */
    }
}
