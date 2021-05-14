package automationCoursesEpam.study;

public class FigureList {
    private AbstractFigure[] masfig;
    private int count;


    public FigureList() {
        this.masfig = new AbstractFigure[10];
        this.count = 0;
    }


    public void add(AbstractFigure figure) {
        if (count == masfig.length) throw new ArrayIndexOutOfBoundsException();
        masfig[count] = figure;
        count++;
    }

    public FigureList(AbstractFigure[] masfig) {
        this.masfig = masfig;
        this.count = masfig.length;
    }

    public void showPerimeter() {
        System.out.println("-------------");
        for (AbstractFigure figure : masfig) {
            System.out.println(figure.perimeter());
        }
    }

    public AbstractFigure getMaxPerimeter() {
        AbstractFigure maxPerimeterFigure = masfig[0];
        for (AbstractFigure figure : masfig) {
            if (figure.perimeter() > maxPerimeterFigure.perimeter()) {
                maxPerimeterFigure = figure;
            }
        }
        return maxPerimeterFigure;
    }
}
