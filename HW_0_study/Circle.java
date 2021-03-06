package EpamJavaCourse.HW_0_study;

public class Circle extends AbstractFigure {

    private int x;
    private int y;
    private int radius;
    //private final double PI = 3.14;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: " + this.perimeter() + " " + this.square();
    }
}
