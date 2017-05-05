package Module7.Task75;

import java.util.*;

public class BookingComAPI extends APIAbstract {

    public BookingComAPI() {
        List<Room> rooms = new ArrayList<>();
        Calendar calendar1 = new GregorianCalendar(2017,0,1);
        Calendar calendar2 = new GregorianCalendar(2017,0,3);
        Calendar calendar3 = new GregorianCalendar(2017,0,4);
        Calendar calendar4 = new GregorianCalendar(2017,0,5);
        Calendar calendar5 = new GregorianCalendar(2017,0,7);
        rooms.add(new Room(11111, 50, 4, calendar1.getTime(), "Marriott", "Dnipro"));
        rooms.add(new Room(11112, 70, 2, calendar2.getTime(), "Radisson Blu", "Kremenchuk"));
        rooms.add(new Room(11113, 75, 3, calendar3.getTime(), "Ltava", "Poltava"));
        rooms.add(new Room(11114, 30, 5, calendar4.getTime(), "Sofiya", "Uman"));
        rooms.add(new Room(11115, 3000, 1, calendar5.getTime(), "Hyatt", "Kyiv"));
        setRooms(rooms);
    }

}