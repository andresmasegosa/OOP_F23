package session10.exercises.b_exercise_observer_pattern;


public class Demo {

    public static void main(String[] args) {
        NewsFeed feed = new NewsFeed();
        feed.addEmailSubscriber("arma@cs.aau.dk");
        feed.addAppSubscriber(123456);

        feed.notifySubscribers("The observer pattern is great!");

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session10_B", I_did_finish, I_did_understand, comment);
        */

    }
}
