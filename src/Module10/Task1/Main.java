package Module10.Task1;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("My first exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Inside finally block...");
        }
    }
}
