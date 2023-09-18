package session3.B_DesignWithInheritance;

public class ChessDemo {

    public static void main(String[] args) {
        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();
        King king = new King(chessBoard,"Black", 0, 0);

        Bishop bishop = new Bishop(chessBoard, "Black", 0, 6);




        //ChessPiece queen = new Queen(chessBoard,"Black", 0, 7);


        //Start to move pieces
        boolean success = chessBoard.moveChessPiece(bishop,0,1);
        System.out.println(success);

     }
}
