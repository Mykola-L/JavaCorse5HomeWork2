package Module8;

import java.util.*;


public class UserDAO extends AbstractDAOImpl<User> {
    Map<Long,User> users = new HashMap<>();

    @Override
    public User getById(long id) {
        return users.get(id);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<User>(users.values());
    }

    @Override
    public User save(User item) {
        users.put(item.getId(),item);
        return item;
    }

    @Override
    public void deleteById(long id) {
        users.remove(id); users.replace(1l,new User(""));
    }
}
