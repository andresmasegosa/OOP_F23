package session10.exercises.c_exercise_decorator_pattern;

public class SendDataService {
    String serverAddress;

    public SendDataService(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public void sendData(String data){
        System.out.println("Sending Data: "+data);
    }

}
