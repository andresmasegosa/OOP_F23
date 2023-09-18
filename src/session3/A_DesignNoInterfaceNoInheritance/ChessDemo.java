package session3.A_DesignNoInterfaceNoInheritance;

public class ChessDemo {

    public static void main(String[] args) {
        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();

        //Start to move pieces
        boolean success = chessBoard.moveChessPiece(king,1,7);
        System.out.println(success);


    }
}
