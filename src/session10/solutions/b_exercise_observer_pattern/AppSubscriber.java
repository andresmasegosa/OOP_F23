package session10.solutions.b_exercise_observer_pattern;

import session10.solutions.b_exercise_observer_pattern.subscribers_api.PhoneNotificationsService;

public class AppSubscriber implements Subscriber{
    PhoneNotificationsService phoneNotificationsService;
    private int phoneID;

    public AppSubscriber(PhoneNotificationsService phoneNotificationsService, int phoneID) {
        this.phoneNotificationsService = phoneNotificationsService;
        this.phoneID = phoneID;
    }

    @Override
    public void update(String news) {
        this.phoneNotificationsService.notifyPhone(phoneID,news);
    }
}
