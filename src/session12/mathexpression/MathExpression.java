package session12.mathexpression;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MathExpression implements Iterable<Node> {

    private List<Node> nodeList = new LinkedList<>();

    public void parse(String string){
       string = string.trim();
        for (String stringPart : string.split(" ")){
            if (IntegerNode.detectNode(stringPart))
                nodeList.add(new IntegerNode(stringPart));
            else if (SumNode.detectNode(stringPart))
                nodeList.add(new SumNode(stringPart));
            else if (EqualNode.detectNode(stringPart))
                nodeList.add(new EqualNode(stringPart));
            else if (SubtractionNode.detectNode(stringPart))
                nodeList.add(new SubtractionNode(stringPart));

        }
    }

    public List<Node> getNodeList() {
        return nodeList;
    }

    @Override
    public Iterator<Node> iterator() {
        return this.nodeList.iterator();
    }

    @Override
    public String toString() {
        String output = "MathExpression{ ";

        for (Node node: nodeList) {
            output += node.toString();
            output += " : ";
        }

        output+=" }";
        return  output;
    }

}
