package Module7.Task_1_3;

import java.util.Comparator;
import java.util.function.ToIntBiFunction;


public class OrderComparator implements Comparator<Order> {
    private final ToIntBiFunction<Order, Order> compareRule;

    public OrderComparator(ToIntBiFunction<Order, Order> compareRule) {
        this.compareRule = compareRule;
    }

    @Override
    public int compare(Order o1, Order o2) {
        return compareRule.applyAsInt(o1, o2);
    }
}
