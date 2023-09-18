package session3.C_DesignWithAbstractClass;

public abstract class ChessPiece {

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

    public abstract boolean isLegalTheMovement(int newX, int newY);

}
