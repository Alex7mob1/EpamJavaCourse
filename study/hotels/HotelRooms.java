package EpamJavaCourse.study.hotels;

public class HotelRooms {
    public static void printSquareRooms(HotelRoom[] rooms) {
        for (HotelRoom room: rooms) {
            System.out.println(room.getSquare());
        }
    }
}
