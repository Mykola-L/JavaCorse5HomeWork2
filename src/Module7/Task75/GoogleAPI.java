package Module7.Task75;

import java.util.*;

public class GoogleAPI extends APIAbstract {
    public GoogleAPI(){
        List<Room> rooms = new ArrayList<>();
        Calendar calendar1 = new GregorianCalendar(2017,1,1);
        Calendar calendar2 = new GregorianCalendar(2017,1,2);
        Calendar calendar3 = new GregorianCalendar(2017,0,25);
        Calendar calendar4 = new GregorianCalendar(2017,0,7);
        Calendar calendar5 = new GregorianCalendar(2017,0,5);
        rooms.add(new Room(31111, 25, 2, calendar1.getTime(), "Ritz", "Zhitomyr"));
        rooms.add(new Room(31112, 75, 3, calendar2.getTime(), "Marriott", "Poltava"));
        rooms.add(new Room(31113, 175, 2, calendar3.getTime(), "Hyatt", "Obuhiv"));
        rooms.add(new Room(31114, 30, 3, calendar4.getTime(), "Dnipro", "Dnipro"));
        rooms.add(new Room(31115, 200, 1, calendar5.getTime(), "Radisson Blu", "Kremenchuk"));
        setRooms(rooms);
    }
}
