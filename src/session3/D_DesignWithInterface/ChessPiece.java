package session3.D_DesignWithInterface;

public interface ChessPiece {

    String getColor();

    int getX();

    void setX(int x);

    int getY();

    void setY(int y);

    ChessBoard getChessBoard();

    boolean isLegalTheMovement(int newX, int newY);

}
