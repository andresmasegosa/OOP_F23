package session3.B_DesignWithInheritance;

public class ChessDemo {

    public static void main(String[] args) {
        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();


        ChessPiece blackKing = new King(chessBoard,"Black", 0, 2);

        chessBoard.moveChessPiece(blackKing,1,2);




        //blackKing.isChecked();


        Queen blackQueen = new Queen(chessBoard,"Black", 0, 1);
        blackQueen.isLegalTheMovement(0,6);

        chessBoard.moveChessPiece(blackQueen,1,2);



        //Start to move pieces
        //boolean success = chessBoard.moveChessPiece(queen,0,1);
        //System.out.println(success);

     }
}
