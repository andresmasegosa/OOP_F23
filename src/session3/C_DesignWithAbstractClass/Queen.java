package session3.C_DesignWithAbstractClass;

public class Queen extends ChessPiece {

    public Queen(ChessBoard chessBoard, String color, int x, int y) {
        super(chessBoard,"King",color, x, y);
    }

    @Override
    public boolean isLegalTheMovement(int newX, int newY){
        //Check if the movement is allowed.
        boolean success = Movements.isLegalVerticalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 8) ||
                Movements.isLegalHorizontalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 8) ||
                Movements.isLegalDiagonalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 8);

        return success;
    }

}
