package Module7.Task75;

import java.util.*;

public class Controller {
    private List<API> apis = new ArrayList<>();
    private DAO dao = new DAOImpl2();
    public Controller(List<API> apis){
        this.apis = apis;
    }

    public List<Room> requestRooms(int price, int persons, String city, String hotel) {
        List<Room> foundRooms = new ArrayList<>();
        for (API api: apis){
            foundRooms.addAll(api.findRooms(price, persons, city, hotel));                    // find rooms using the given API
        }
        return foundRooms;
    }

    // this method returns only 1 room from every 'equal' pair, even if other fields are different
    public List<Room> check(API api1, API api2) {
        List<Room> rooms1 = api1.findRooms(0, 0, "", "");
        List<Room> rooms2 = api2.findRooms(0,0,"", "");
        List<Room> foundRooms = new ArrayList<>();
        for (Room r1: rooms1){
            for (Room r2: rooms2){
                if (r1.equals(r2)) {
                    foundRooms.add(r1);
                }
            }
        }
        return foundRooms;
    }

    /* Additional Task 5.10 */
    public Room save(Room room) {
        return dao.save(room);
    }

    /* Additional Task 5.10 */
    public boolean delete(Room room) {
        return dao.delete(room);
    }

    /* Additional Task 5.10 */
    public Room update(Room room) {
        return dao.update(room);
    }

    /* Additional Task 5.10 */
    public Room findById(long id){
        return dao.findById(id);
    }
}