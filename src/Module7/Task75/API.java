package Module7.Task75;

import java.util.List;

public interface API {
    List<Room> findRooms(int price, int persons, String city, String hotel);
}