package Module10.Task5;

public class DivisionByZero extends MyException {
    public DivisionByZero(String msg) {
        super(msg);
    }

    public DivisionByZero(String msg, Throwable cause) {
        super(msg, cause);
    }
}
