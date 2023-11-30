package session12.mathexpression;

public class EqualNode extends Node{
    public EqualNode(String string) {
        super(string);
    }

    public static boolean detectNode(String string){
        if (string.equals("="))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "EqualNode{" +
                string +
                '}';
    }
}
