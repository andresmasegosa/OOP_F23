package session9.d_enums;


/**
 * Exercise:
 * Introduce an Enum class "Colour" to guarantee that only two kind of Players can be created:
 *  - Blue players and Red players.
 */
public class Exercise {
    public static void main(String[] args) {
        Player player = new Player("Andres", Colour.BLUE);

        System.out.println(player);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session9_D", I_did_finish, I_did_understand, comment);
        */
    }
}
