package session6.C_generics;

import java.util.Stack;

public class DemoStack {

    public static void main(String[] args) {

        Stack<Giraff> stack = new Stack<>();

        Giraff giraff1 = new Giraff();

        stack.push(giraff1);

        Giraff giraff2 = stack.pop();

        Book book = new Book();

        //stack.push(book);

        //Book book2 = stack.pop();
    }

}
