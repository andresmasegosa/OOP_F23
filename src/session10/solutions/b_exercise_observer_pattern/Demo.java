package session10.solutions.b_exercise_observer_pattern;


import session10.solutions.b_exercise_observer_pattern.subscribers_api.EmailService;
import session10.solutions.b_exercise_observer_pattern.subscribers_api.PhoneNotificationsService;

public class Demo {

    public static void main(String[] args) {
        NewsFeed feed = new NewsFeed();
        EmailService emailService = new EmailService();
        feed.addSubscriber(new EmailSubscriber(emailService, "arma@cs.aau.dk"));
        feed.addSubscriber(new EmailSubscriber(emailService, "tdn@cs.aau.dk"));

        PhoneNotificationsService phoneNotificationsService = new PhoneNotificationsService();
        feed.addSubscriber(new AppSubscriber(phoneNotificationsService,1233456));
        feed.addSubscriber(new AppSubscriber(phoneNotificationsService,789));

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
