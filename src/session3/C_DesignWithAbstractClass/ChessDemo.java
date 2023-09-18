package session3.C_DesignWithAbstractClass;

public class ChessDemo {

    public static void main(String[] args) {
        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();
        ChessPiece king = new King(chessBoard,"Black", 0, 0);
        ChessPiece queen = new Queen(chessBoard,"Black", 0, 7);


        //Start to move pieces
        boolean success = chessBoard.moveChessPiece(queen,0,1);
        System.out.println(success);

     }
}
