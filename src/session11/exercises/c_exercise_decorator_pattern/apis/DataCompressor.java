package session11.exercises.c_exercise_decorator_pattern.apis;

public class DataCompressor {
    public String compressData(String data) {
        System.out.println("Compressing data");
        return data+"_compressed";
    }
}
