package Module10.Task4;

public class DivisionByZeroInG extends RuntimeException{
    public DivisionByZeroInG(String msg) {
        super(msg);
    }

    public DivisionByZeroInG(String msg, Throwable cause) {
        super(msg, cause);
    }
}
