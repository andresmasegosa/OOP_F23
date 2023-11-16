package session10.exercises.b_exercise_observer_pattern.subscribers_api;

public class EmailService {
    public void sendEmail(String emailaddress, String message){
        System.out.println("Sending Email to: "+emailaddress);
        System.out.println("Message: "+message);
    }
}
