package Module7.Task75;

import java.util.*;

public class TripAdvisorAPI extends APIAbstract {
    public TripAdvisorAPI(){
        List<Room> rooms = new ArrayList<>();
        Calendar calendar1 = new GregorianCalendar(2016,11,11);
        Calendar calendar2 = new GregorianCalendar(2016,11,13);
        Calendar calendar3 = new GregorianCalendar(2016,11,14);
        Calendar calendar4 = new GregorianCalendar(2016,11,25);
        Calendar calendar5 = new GregorianCalendar(2016,11,27);
        rooms.add(new Room(21111, 3000, 1, calendar1.getTime(), "Kyiv", "Kyiv"));
        rooms.add(new Room(21112, 60, 3, calendar2.getTime(), "Radisson Blu", "Poltava"));
        rooms.add(new Room(21113, 85, 2, calendar3.getTime(), "Marriott", "Obuhiv"));
        rooms.add(new Room(21114, 30, 3, calendar4.getTime(), "Ritz", "Dnipro"));
        rooms.add(new Room(21115, 3000, 1, calendar5.getTime(), "Hyatt", "Kremenchuk"));
        setRooms(rooms);
    }
}
