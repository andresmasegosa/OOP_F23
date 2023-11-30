package session12.mathexpression;

import session12.visitors.Element;
import session12.visitors.Visitor;

public abstract class Node implements Element {
    protected String string;

    public Node(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}