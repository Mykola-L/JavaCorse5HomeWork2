package Module7.Task75;

import java.util.List;

public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    // additional task 5.9
    List<Room> getAll();
}