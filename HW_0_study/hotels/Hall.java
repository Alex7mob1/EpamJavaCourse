package EpamJavaCourse.HW_0_study.hotels;

public class Hall extends AbstractRoom {

    public Hall(double square) {
        super(square);
    }

    @Override
    public String toString() {
        return "Hall{" + super.toString() + "}";
    }
}
