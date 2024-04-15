package Quiz3;

import java.util.HashMap;
import java.util.Map;

public class HotelManager {
    Map<String, Room> map = new HashMap<>();

    public void assignRoom(Person guest, int roomNumber) {
        if (!map.containsKey(String.valueOf(roomNumber))) {
            Room room = new Room();
            room.roomNumber = roomNumber;
            map.put(String.valueOf(roomNumber), room);
        }
        Room room = map.get(String.valueOf(roomNumber));
        room.guest = guest;
    }

    public void displayInfo() {
        for (Map.Entry<String, Room> entry : map.entrySet()) {
            Room room = entry.getValue();
            if (room.guest != null) {
                Person guest = room.guest;
                System.out.println("Room " + room.roomNumber + ": " + guest.getName() + " " + guest.getSurname() + " (ID: " + guest.getId() + ")");
            } else {
                System.out.println("Room " + room.roomNumber + ": Empty");
            }
        }
    }
}
