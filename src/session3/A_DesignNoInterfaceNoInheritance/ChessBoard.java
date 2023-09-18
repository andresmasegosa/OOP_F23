package session3.A_DesignNoInterfaceNoInheritance;

public class ChessBoard {

    private ChessPiece[][] pieces;

    public ChessBoard() {
        this.pieces = new ChessPiece[8][8];
    }

    public ChessPiece getChessPiece(int x, int y){
        return pieces[x][y];
    }

    protected void setInitialPositionChessPiece(int x, int y, ChessPiece piece){
        this.pieces[x][y]=piece;
        piece.setX(x);
        piece.setY(y);
    }

    public boolean moveChessPiece(ChessPiece piece, int newX, int newY){
        boolean success = piece.isLegalTheMovement(newX,newY);
        if (!success)
            return false;
        this.pieces[piece.getX()][piece.getY()]=null;
        this.pieces[newX][newY]=piece;
        piece.setX(newX);
        piece.setY(newY);
        return success;
    }

}
