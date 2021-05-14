package automationCoursesEpam.study;

public abstract class AbstractFigure {
    public abstract double perimeter();

    public abstract double square();

    public void show() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("p =  " + this.perimeter());
        System.out.println("s = " + this.square());
    }
}
