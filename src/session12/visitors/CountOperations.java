package session12.visitors;

import session12.mathexpression.Node;
import session12.mathexpression.SubtractionNode;
import session12.mathexpression.SumNode;

public class CountOperations implements Visitor{

    private int numberOfSumOperations=0;
    private int numberOfSubstractionOperations=0;

    @Override
    public void visit(Node node) {
        if (node instanceof SumNode){
            numberOfSumOperations++;
        }else if (node instanceof SubtractionNode){
            numberOfSubstractionOperations++;
        }
    }

    @Override
    public String toString() {
        return "CountOperations{" +
                "numberOfSumOperations=" + numberOfSumOperations +
                ", numberOfSubstractionOperations=" + numberOfSubstractionOperations +
                '}';
    }
}
