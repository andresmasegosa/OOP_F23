package session3.A_DesignNoInterfaceNoInheritance;

public class ChessDemo {

    public static void main(String[] args) {
        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();

        ChessPiece blackKing = new ChessPiece("King", "Black", 0, 2, chessBoard);

        System.out.println(blackKing.getColor());

        blackKing.isLegalTheMovement(6,2);

        blackKing.isChecked();

        ChessPiece blackQueen = new ChessPiece("Queen", "Black", 0, 1, chessBoard);

        blackQueen.isChecked();


    }
}
