package Module8;

import java.util.List;


public abstract class AbstractDAOImpl<T extends HasIdentification> implements AbstractDAO<T> {

    @Override
    public void saveAll(List<T> items) {
        for (T item : items) {
            save(item);
        }
    }

    @Override
    public void delete(T item) {
        deleteById(item.getId());
    }

    @Override
    public void deleteAll(List<T> items) {
        for (T item : items) {
            deleteById(item.getId());
        }
    }
}
