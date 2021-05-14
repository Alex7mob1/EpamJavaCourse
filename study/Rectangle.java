package automationCoursesEpam.study;

public class Rectangle extends AbstractFigure {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideA = sideB;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA * sideB);
    }

    @Override
    public double square() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "rec" + this.perimeter() + " . " + this.square();
    }
}
