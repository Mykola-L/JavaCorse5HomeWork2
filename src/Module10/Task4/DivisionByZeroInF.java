package Module10.Task4;

public class DivisionByZeroInF extends RuntimeException{
    public DivisionByZeroInF(String msg) {
        super(msg);
    }

    public DivisionByZeroInF(String msg, Throwable cause) {
        super(msg, cause);
    }
}