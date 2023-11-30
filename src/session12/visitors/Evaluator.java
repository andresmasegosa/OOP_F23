package session12.visitors;


import session12.mathexpression.IntegerNode;
import session12.mathexpression.Node;
import session12.mathexpression.SubtractionNode;
import session12.mathexpression.SumNode;

public class Evaluator implements Visitor {

    private int result;
    private int currentInteger;
    Node lastOperation=null;
    boolean holding=false;

    public Evaluator() {
        this.result = 0;
    }

    @Override
    public void visit(Node node) {

        if (node instanceof IntegerNode){
            int currentInteger = ((IntegerNode) node).getIntValue();
            if (lastOperation==null){
                this.result=currentInteger;
            } else if (lastOperation instanceof SumNode) {
                this.result+=currentInteger;
            } else if (lastOperation instanceof SubtractionNode) {
                this.result-=currentInteger;
            }
        }else if (node instanceof SumNode || node instanceof SubtractionNode){
            this.lastOperation=node;
        }

    }

    @Override
    public String toString() {
        return "Evaluator{" +
                "result=" + result +
                '}';
    }
}
