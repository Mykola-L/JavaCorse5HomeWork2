package Module10.Task2;

public class MyException extends Exception{
    private String msg;

    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public void reportToConsole(){
        System.out.println(msg);
    }
}
