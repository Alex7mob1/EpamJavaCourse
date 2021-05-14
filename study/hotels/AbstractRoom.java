package EpamJavaCourse.study.hotels;

public abstract class AbstractRoom {
    private double square;

    public AbstractRoom(double square) {
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "square=" + square;
    }
}
