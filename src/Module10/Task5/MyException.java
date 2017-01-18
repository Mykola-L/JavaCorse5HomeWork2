package Module10.Task5;

public class MyException extends RuntimeException {
    public MyException(String msg) {
        super(msg);
    }

    public MyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
