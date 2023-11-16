package session10.solutions.b_exercise_observer_pattern;

import session10.solutions.b_exercise_observer_pattern.subscribers_api.EmailService;
import session10.solutions.b_exercise_observer_pattern.subscribers_api.PhoneNotificationsService;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {

    private List<Subscriber> subscribers;

    public NewsFeed() {
        subscribers = new ArrayList();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers(String news) {
        for(Subscriber subscriber: subscribers) {
            subscriber.update(news);
        }
    }
}