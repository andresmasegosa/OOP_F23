package session3.B_DesignWithInheritance;

public class ChessPiece {

    private String type;
    private String color;
    private int x;
    private int y;
    private ChessBoard chessBoard;

    public ChessPiece(ChessBoard chessBoard, String type, String color, int x, int y) {
        this.chessBoard = chessBoard;
        this.type = type;
        this.color = color;
        this.chessBoard.setInitialPositionChessPiece(x,y,this);
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }

    public ChessBoard getChessBoard() {
        return this.chessBoard;
    }

    public boolean isLegalTheMovement(int newX, int newY){
        return false;
    }

}
