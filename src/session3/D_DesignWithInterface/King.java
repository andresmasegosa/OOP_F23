package session3.D_DesignWithInterface;


public class King implements ChessPiece {

    private String type;
    private String color;
    private int x;
    private int y;
    private ChessBoard chessBoard;

    public King(ChessBoard chessBoard, String color, int x, int y) {
        this.chessBoard = chessBoard;
        this.type = "King";
        this.color = color;
        this.chessBoard.setInitialPositionChessPiece(x,y,this);
    }


    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public ChessBoard getChessBoard() {
        return this.chessBoard;
    }

    @Override
    public boolean isLegalTheMovement(int newX, int newY){
        //Check if the movement is allowed.
        boolean success = Movements.isLegalVerticalMovement(this.chessBoard, x, y, newX, newY, 1) ||
                Movements.isLegalHorizontalMovement(this.chessBoard, x, y, newX, newY, 1) ||
                Movements.isLegalDiagonalMovement(this.chessBoard, x, y, newX, newY, 1);

        return success;
    }

}
