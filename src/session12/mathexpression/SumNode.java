package session12.mathexpression;

public class SumNode extends Node{

    public SumNode(String string) {
        super(string);
    }

    public static boolean detectNode(String string){
        if (string.equals("+"))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "SumNode{" +
                string +
                '}';
    }
}
