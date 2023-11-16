package session10.solutions.b_exercise_observer_pattern;

import session10.solutions.b_exercise_observer_pattern.subscribers_api.EmailService;

public class EmailSubscriber implements Subscriber{
    EmailService emailService;
    private String emailAddress;

    public EmailSubscriber(EmailService emailService, String emailAddress) {
        this.emailService = emailService;
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(String news) {
        this.emailService.sendEmail(emailAddress,news);
    }
}
