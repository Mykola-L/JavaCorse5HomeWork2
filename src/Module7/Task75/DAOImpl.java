package Module7.Task75;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Save for " + room.getClass());
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Delete for " + room.getClass());
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Update for " + room.getClass());
        return room;
    }

    @Override
    public Room findById(long id) {
        System.out.println("findById for " + id);
        return null;
    }

    // this is for the task 5.9
    @Override
    public List<Room> getAll() {
        return new ArrayList<>();
    }
}