package Module7.Task75;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl2 implements DAO {
    private List<Room> rooms = new ArrayList<>();

    @Override
    public Room save(Room room) {
        rooms.add(room);
        return room;
    }

    // remove all rooms that are equal to room
    @Override
    public boolean delete(Room room) {
        List<Room> roomsToDelete = new ArrayList<>();
        roomsToDelete.add(room);
        return rooms.removeAll(roomsToDelete);
    }

    @Override
    public Room update(Room room) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getId() == room.getId()) {
                rooms.set(i, room);
                return room;
            }
        }
        return null;
    }

    @Override
    public Room findById(long id) {
        for (Room room: rooms) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    // Task 5.9
    @Override
    public List<Room> getAll() {
        return rooms;
    }
}