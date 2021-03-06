package Module5.api;

import module5.Room;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class TripAdvisorAPI implements Api {
    private Room[] rooms;

    public TripAdvisorAPI() {
        rooms = new Room[5];
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(2016, Calendar.SEPTEMBER,1);
        rooms[0]= new Room(IdProvider.getNewId(), 1000,2,calendar.getTime(),"Hilton","Kiev");
        calendar.set(2016,Calendar.OCTOBER,1);
        rooms[1]= new Room(IdProvider.getNewId(), 1500,2,calendar.getTime(),"Hilton","Odessa");
        calendar.set(2016,Calendar.NOVEMBER,1);
        rooms[2]= new Room(IdProvider.getNewId(), 2000,2,calendar.getTime(),"Hilton","Kharkiv");
        calendar.set(2016,Calendar.DECEMBER,1);
        rooms[3]= new Room(IdProvider.getNewId(), 3000,3,calendar.getTime(),"Hilton","Lviv");
        calendar.set(2016,Calendar.JANUARY,1);
        rooms[4]= new Room(IdProvider.getNewId(), 5000,3,calendar.getTime(),"Hilton","Boston");
    }

    @Override
    public Room[] getAll() {
        Room[] r = new Room[rooms.length];
        System.arraycopy(rooms,0,r,0,rooms.length);
        return r;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return RoomSearchProvider.findRooms(rooms,price,persons,city,hotel);
    }
}
