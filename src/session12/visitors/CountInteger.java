package session12.visitors;

import session12.mathexpression.IntegerNode;
import session12.mathexpression.Node;
import session12.mathexpression.SumNode;

public class CountInteger implements Visitor{

    private int numberOfIntegers=0;

    @Override
    public void visit(Node node) {
        if (node instanceof IntegerNode){
            numberOfIntegers++;
        }
    }

    @Override
    public String toString() {
        return "CountInteger{" +
                "numberOfIntegers=" + numberOfIntegers +
                '}';
    }
}
