package Module7.Task75;

import java.util.*;

/* This is a helper abstract class to keep our code DRY */
public abstract class APIAbstract implements API {
    private List<Room> rooms;
    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> foundRooms = new ArrayList<>();
        for (Room r: rooms){
            // we accept empty strings and 0-parameters, like it is done in real search engines
            if ((r.getPrice() <= price || price == 0) &&                    // we look for prices smaller-than or equal
                    (r.getPersons() == persons || persons == 0) &&
                    (r.getCityName().equals(city) || city.equals("")) &&
                    (r.getHotelName().equals(hotel) || hotel.equals(""))) {
                foundRooms.add(r);
            }
        }
        return foundRooms;
    }

    protected void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

}