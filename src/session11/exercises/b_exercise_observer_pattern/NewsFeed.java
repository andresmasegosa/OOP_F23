package session11.exercises.b_exercise_observer_pattern;

import session11.exercises.b_exercise_observer_pattern.subscribers_api.EmailService;
import session11.exercises.b_exercise_observer_pattern.subscribers_api.PhoneNotificationsService;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {

    private List<Integer> appSubscribers;
    private List<String> emailSubscribers;
    EmailService emailService;
    PhoneNotificationsService phoneNotificationsService;

    public NewsFeed() {
        appSubscribers = new ArrayList();
        emailSubscribers = new ArrayList();
        emailService = new EmailService();
        phoneNotificationsService = new PhoneNotificationsService();
    }

    public void addAppSubscriber(int phoneId) {
        appSubscribers.add(phoneId);
    }

    public void addEmailSubscriber(String emailAddress) {
        emailSubscribers.add(emailAddress);
    }

    public void notifySubscribers(String news) {
        for(Integer phoneID: appSubscribers) {
            this.phoneNotificationsService.notifyPhone(phoneID,news);
        }

        for(String emailAddress: emailSubscribers) {
            this.emailService.sendEmail(emailAddress,news);
        }

    }
}