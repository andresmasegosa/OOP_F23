package session1;

/**
 * This class demonstrates the use of the 'while' loop in Java.
 */
public class G_WhileLoop {

    public static void main(String[] args) {
        // Initialize character with 'a'
        char ch = 'a';

        // Use a while loop to print the alphabet in lowercase
        while (ch <= 'z') {
            System.out.print(ch);
            ch++; // Increment to the next character in the sequence
        }
    }
}
