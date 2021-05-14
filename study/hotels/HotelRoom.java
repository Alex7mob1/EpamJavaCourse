package EpamJavaCourse.study.hotels;

public class HotelRoom extends AbstractRoom {
    private int number;
    private Hall hall;
    private BathRoom bathRoom;
    private Room[] rooms;

    public HotelRoom(int number, Hall hall, BathRoom bathRoom, Room[] rooms) {
        super(0);
        this.number = number;
        this.hall = hall;
        this.bathRoom = bathRoom;
        this.rooms = rooms;
    }

    public HotelRoom(int number, double hallSquare, double bathRoomSquare, double... roomsSquare) {
        super(0);
        this.number = number;
        this.hall = new Hall(hallSquare);
        this.bathRoom = new BathRoom(bathRoomSquare);
        rooms = new Room[roomsSquare.length];
        for (int i = 0; i < roomsSquare.length; i++) {
            rooms[i] = new Room(roomsSquare[i]);
        }
    }

    public HotelRoom(int number) {
        super(0);
        this.number = number;
        this.hall = new Hall(5);
        this.bathRoom = new BathRoom(3);
        rooms = new Room[]{new Room(10)};
    }

    public double getRoomsSquare() {
        double sum = 0;
        for (int i = 0; i < rooms.length; i++) {
            sum += rooms[i].getSquare();
        }
        return sum;
    }

    public double square() {
        return hall.getSquare() + bathRoom.getSquare() + getRoomsSquare();
    }


}
