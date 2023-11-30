package session12.mathexpression;


public class SubtractionNode extends Node {

    public SubtractionNode(String string) {
        super(string);
    }

    public static boolean detectNode(String string){
        if (string.equals("-"))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "SubtractionNode{" +
                "string='" + string + '\'' +
                '}';
    }
}
