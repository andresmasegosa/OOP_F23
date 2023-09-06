package session1;

/**
 * This class demonstrates the use of simple 'if' and 'if-else' statements in Java.
 */
public class D_IfStatement {

    /**
     * Demonstrates a simple 'if' statement.
     */
    public static void demoWithIf() {
        int a = 2;
        int b = 3;

        // Check if 'a' is less than 'b'
        if (a < b) {
            System.out.println("a is less than b");
        }

        // Check if 'a' is equal to 'b'
        if (a == b) {
            System.out.println("You won't see this because 'a' is not equal to 'b'");
        }

        System.out.println();  // For readability in the console output
    }

    /**
     * Demonstrates a simple 'if-else' statement.
     */
    public static void demoWithIfElse() {
        int a = 2;
        int b = 3;

        // Check if 'a' is less than 'b'
        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("You won't see this because 'a' is less than 'b'");
        }

        System.out.println();  // For readability in the console output
    }

    public static void main(String[] args) {
        D_IfStatement.demoWithIf();
        // IfStatementDemo.demoWithIfElse(); Uncomment to see the output for 'demoWithIfElse'
    }
}
