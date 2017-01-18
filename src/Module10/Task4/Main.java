package Module10.Task4;

public class Main {
    static int f(int a, int b){
        try{
            return g(a, b);
        }
        catch (DivisionByZeroInG e){
            throw new DivisionByZeroInF("Cannot calculate the return value",e);
        }
    }

    static int g(int a, int b){
        if (b!=0) {
            return Math.round(a*100.0f/b);
        }
        else{
            throw new DivisionByZeroInG("Division by zero in g(a,b). g called with a="+a+", b="+b);
        }
    }

    public static void main(String[] args) {
        try{
            int a = 50;
            int b = 0;
            int percent = f(a, b);
            System.out.println(a+" is "+percent+"% of "+b);
        }
        catch (DivisionByZeroInF e){
            e.printStackTrace();
        }
    }
}
