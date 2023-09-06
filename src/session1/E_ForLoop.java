package session1;

/**
 * This class demonstrates the behavior of the 'for' loop in Java.
 */
public class E_ForLoop {

    /**
     * Demonstrates a basic 'for' loop and prints the square of the last value outside the loop.
     */
    public static void demoWithSquareAfterLoop() {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(i * i);
    }

    /**
     * Demonstrates a basic 'for' loop with local variable scope.
     */
    public static void demoWithLocalScope() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // System.out.println(i * i);
    }

    /**
     * Demonstrates a 'for' loop printing both the current value and its square in the loop.
     */
    public static void demoWithSquareInLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(i * i);
        }
    }

    public static void main(String[] args) {
        E_ForLoop.demoWithSquareAfterLoop();
        //E_ForLoop.demoWithLocalScope();
        //E_ForLoop.demoWithSquareInLoop();
    }
}
