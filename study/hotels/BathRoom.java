package EpamJavaCourse.study.hotels;

public class BathRoom extends AbstractRoom {

    public BathRoom(double square) {
        super(square);
    }

    @Override
    public String toString() {
        return "Bathroom{" + super.toString() + "}";
    }
}
