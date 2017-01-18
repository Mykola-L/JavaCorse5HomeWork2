package Module10.Task3;

public class Main {
    public static void main(String[] args) {
        Integer i = null;
        try {
            i.byteValue();
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException occur");
        }
    }
}
