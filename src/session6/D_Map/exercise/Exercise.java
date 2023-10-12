package session6.D_Map.exercise;

/**
 * Exercise: Implementing ChessBoard using a Map<Position,ChessPiece> object.
 *   a) Finish the implementation of Board class.
 *   b) Use Board class to implements ChessBoard.
 */
public class Exercise {
    public static void main(String[] args) {

        //Create the Chess Board
        ChessPiece king = new ChessPiece("King","Black");
        ChessPiece queen = new ChessPiece("Queen","Black");

        ChessBoard chessBoard = new ChessBoard();
        chessBoard.setInitialPositionChessPiece(new Position(0,7), king);
        chessBoard.setInitialPositionChessPiece(new Position(0,6), queen);

        System.out.println(chessBoard.getChessPiece(new Position(0,6)));

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session6_D", I_did_finish, I_did_understand, comment);
        */
    }
}
