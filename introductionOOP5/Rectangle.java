package automationCoursesEpam.introductionOOP5;

public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(double a) {
        this.sideA = a;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double area() {
        double area;
        area = sideA * sideB;
        return area;
    }

    public double perimeter() {
        double perimeter;
        perimeter = 2 * sideA + 2 * sideB;
        return perimeter;
    }

    public boolean isSquare() {
        return sideA == sideB;
    }

    public void replaceSides() {
        double replace;
        replace = sideA;
        sideA = sideB;
        sideB = replace;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + sideA +
                ", b=" + sideB +
                '}';
    }
}
