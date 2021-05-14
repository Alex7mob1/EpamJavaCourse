package EpamJavaCourse.study;

public class Lection {

    public static void main(String[] args) {
        Circle figura1 = new Circle(1, 2, 5);
        Rectangle figura2 = new Rectangle(4, 6);
        AbstractFigure[] masfig = {figura1, figura2, new Circle(1, 3, 7)};
        for (int i = 0; i < masfig.length; i++) {
            masfig[i].show();
        }
        FigureList figureList = new FigureList(masfig);
        figureList.showPerimeter();

        AbstractFigure maxPerimeterFigure = figureList.getMaxPerimeter();
        System.out.println(maxPerimeterFigure);
    }
}
