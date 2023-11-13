package session9.b_customexceptions;

import java.util.Scanner;

/*
    Exercise: Implementing Custom Exceptions in BankAccount Class

    Background:
    The BankAccount class is part of a banking application that handles deposits among
    other functionalities. The application needs to ensure that deposits are not
    negative and also flag large deposit amounts for potential regulatory review.

    Objective:
    Your task is to enhance the deposit method in the BankAccount class by incorporating
    two custom exceptions: NegativeDepositException and WarningLargeDeposit.

    (a) Modify the deposit method to throw a NegativeDepositException if the deposit
        amount is negative.

    (b) Introduce a new custom exception named WarningLargeDeposit. If the deposit amount
        exceeds 100,000 DKK (Danish Krone), throw the WarningLargeDeposit exception,
        alerting the user that the origin of the funds must be justified to the Danish
        tax authorities (SKAT).

    (c) Update the main application code to catch both exceptions separately and provide
        informative messages to the user when an exception occurs.

    Requirements:
    1. Define a custom exception class NegativeDepositException that extends RuntimeException.
    2. Define another custom exception class WarningLargeDeposit that also extends RuntimeException
       and includes:
        - A private field to store the deposit amount.
        - A private field to store the deposit limit (100,000 DKK).
        - A constructor that accepts the deposit amount and initializes both fields.
        - Getter methods for both fields.
    3. Update the deposit method in the BankAccount class to:
        - Throw a NegativeDepositException with an appropriate message if the amount is negative.
        - Throw a WarningLargeDeposit exception with the current deposit amount if the deposit
          is greater than 100,000 DKK.
    4. In the main method, catch both NegativeDepositException and WarningLargeDeposit exceptions
       with separate catch blocks.
    5. For each catch block, print a user-friendly message that includes:
        - For NegativeDepositException: "Man, you were trying to deposit a negative amount."
        - For WarningLargeDeposit: "You must justify the origin of the [amount] you are trying
          to deposit here. Remember the limit in your country is [deposit limit] DKK."

    Hints:
    - To define a custom exception, use the `extends` keyword followed by `Exception`.
    - Ensure that the custom exceptions provide constructors that can accept and store relevant
      information.
    - In the deposit method, use `throw new` followed by the exception name to throw the
      appropriate exception based on the deposit amount.

    Example Output:
    For an invalid (negative) deposit:
    ```
    Enter an amount to deposit:
    -50
    Hey! You were trying to deposit a negative amount.
    ```

    For a large deposit:
    ```
    Enter an amount to deposit:
    150000
    You must justify the origin of the 150000 DKK you are trying to deposit here. Remember the
    limit in your country is 100000 DKK.
    ```
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

        feedback.Feedback.submit("session9_B", I_did_finish, I_did_understand, comment);
        */
    }
}
