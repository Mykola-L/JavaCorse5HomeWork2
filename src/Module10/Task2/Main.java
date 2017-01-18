package Module10.Task2;

public class Main {
    public static void main(String[] args) {
        try{
            throw new MyException("Test MyException class");
        }
        catch (MyException e){
            e.reportToConsole();
        }
    }
}
