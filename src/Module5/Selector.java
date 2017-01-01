package Module5;

@FunctionalInterface
public interface Selector<T>{
    boolean check(T item);
}
