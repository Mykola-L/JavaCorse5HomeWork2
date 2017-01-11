package Module9;

import java.util.Comparator;
import java.util.function.ToIntBiFunction;


public class UserComparator implements Comparator<User> {
    private final ToIntBiFunction<User, User> compareRule;

    public UserComparator(ToIntBiFunction<User, User> compareRule) {
        this.compareRule = compareRule;
    }

    @Override
    public int compare(User u1, User u2) {
        return compareRule.applyAsInt(u1,u2);
    }
}
