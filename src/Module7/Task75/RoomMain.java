package Module7.Task75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoomMain {
    public static void main(String[] args) {
        API bookingAPI = new BookingComAPI();
        API tripAdvisorAPI = new TripAdvisorAPI();
        API googleAPI = new GoogleAPI();
        List<API> apis = new ArrayList<>();
        apis.add(bookingAPI);
        apis.add(tripAdvisorAPI);
        apis.add(googleAPI);
        Controller controller = new Controller(apis);
        // find all rooms for 2 persons with price <= 500
        List<Room> rooms1 = controller.requestRooms(500, 2, "", "");
        // find all rooms in Poltava
        List<Room> rooms2 = controller.requestRooms(0, 0, "Poltava", "");
        // find rooms in Ritz hotels for 2 people
        List<Room> rooms3 = controller.requestRooms(0, 2, "", "Ritz");
        System.out.println(rooms1);
        System.out.println(rooms2);
        System.out.println(rooms3);
        // get equal rooms for BookingComAPI and TripAdvisorAPI
        List<Room> rooms4 = controller.check(bookingAPI, tripAdvisorAPI);
        System.out.println(rooms4);
        // get equal rooms for BookingComAPI and GoogleAPI
        List<Room> rooms5 = controller.check(bookingAPI, googleAPI);
        System.out.println(rooms5);
        // get equal rooms for TripAdvisorAPI and GoogleAPI
        List<Room> rooms6 = controller.check(tripAdvisorAPI, googleAPI);
        System.out.println(rooms6);
    }
}
