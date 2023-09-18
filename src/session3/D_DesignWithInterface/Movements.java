package session3.D_DesignWithInterface;


public  class Movements {
    public static boolean isLegalHorizontalMovement(ChessBoard board, int x1, int y1, int x2, int y2, int maxDistance)
    {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        maxDistance = Math.abs(maxDistance);

        // If not moving, moving vertically or further than allowed
        if (dx == 0 || dy != 0 || dx > maxDistance)
            return false;

        // Check if piece passed any other piece in order to make this move
        int lower = Math.min(x1, x2) + 1;
        int higher = Math.max(x1, x2);

        for (; lower < higher; lower++)
            if (board.getChessPiece(lower,y1) != null)
                return false; // False if trying to pass over another piece

        return true; // All according to the rules
    }

    public static boolean isLegalVerticalMovement(ChessBoard board, int x1, int y1, int x2, int y2, int maxDistance)
    {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        maxDistance = Math.abs(maxDistance);

        // If moving horizontally, not moving or further than allowed
        if (dx != 0 || dy == 0 || dy > maxDistance)
            return false;

        // Check if piece passed any other piece in order to make this move
        int lower = Math.min(y1, y2) + 1;
        int higher = Math.max(y1, y2);

        for (; lower < higher; lower++)
            if (board.getChessPiece(x1,lower) != null)
                return false; // False if trying to pass over another piece

        return true; // All according to the rules
    }

    public static boolean isLegalDiagonalMovement(ChessBoard board, int x1, int y1, int x2, int y2, int maxDistance)
    {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        maxDistance = Math.abs(maxDistance);

        // If not purely diagonal or further movement than allowed
        if (dx != dy || dx > maxDistance)
            return false;

        // Check if piece passed any other piece in order to make this move
        int currX = x1 + (x2 < x1 ? -1 : 1);
        int currY = y1 + (y2 < y1 ? -1 : 1);
        while (currX != x2 && currY != y2)
        {
            if (board.getChessPiece(currX,currY) != null)
                return false;

            currX += (x2 < x1 ? -1 : 1);
            currY += (y2 < y1 ? -1 : 1);
        }

        return true;
    }
}
