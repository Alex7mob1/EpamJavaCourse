package EpamJavaCourse.study.hotels;

public class ProgramHotel {
    public static void main(String[] args) {
        HotelRoom room1 = new HotelRoom(1);
        HotelRoom room2 = new HotelRoom(2, new Hall(2), new BathRoom(3), new Room[]{new Room(4), new Room(5)});
        HotelRoom room3 = new HotelRoom(3, 4, 2, 4, 6, 7);

        HotelRoom[] rooms = new HotelRoom[]{room1, room2, room3};
        HotelRooms.printSquareRooms(rooms);
    }
}
