package session3.B_DesignWithInheritance;


public class King extends ChessPiece{

    boolean isChecked=false;

    public King(ChessBoard chessBoard, String color, int x, int y){
        super(chessBoard, "King", color, x, y);
        this.isChecked=true;
    }


    public boolean isChecked(){

        return false;
    }
    @Override
    public boolean isLegalTheMovement(int newX, int newY){

        boolean success = Movements.isLegalVerticalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 1) ||
                Movements.isLegalHorizontalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 1) ||
                Movements.isLegalDiagonalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 1);
        return success;

    }


}
