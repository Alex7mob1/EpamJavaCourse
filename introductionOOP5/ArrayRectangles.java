package automationCoursesEpam.introductionOOP5;

public class ArrayRectangles {

    private Rectangle[] rectangleArray;

    public ArrayRectangles(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        rectangleArray = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle... rectangles) {
        if (rectangles == null) {
            throw new IllegalArgumentException("Array Rectangles");
        }
        rectangleArray = new Rectangle[rectangles.length];

        System.arraycopy(rectangles, 0, rectangleArray, 0, rectangles.length);
    }

    public void print() {
        for (Rectangle rectangle : rectangleArray) {
            System.out.println(rectangle);
        }
    }

    public boolean addRectangle(Rectangle rectangle) {
        if (rectangleArray == null || rectangle == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] == null) {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    public int numberMaxArea() {
        double valueMaxArea = 0;
        int indexMaxArea = 0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i].area() > valueMaxArea) {
                valueMaxArea = rectangleArray[i].area();
                indexMaxArea = i;
            }
        }
        return indexMaxArea;
    }

    public int numberMinPerimeter() {
        double valueMinPerimeter = rectangleArray[0].perimeter();
        int indexMinPerimeter = 0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i].perimeter() <= valueMinPerimeter) {
                valueMinPerimeter = rectangleArray[i].perimeter();
                indexMinPerimeter = i;
            }
        }
        return indexMinPerimeter;
    }

    public int numberSquares() {
        int calcSquares = 0;
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle.isSquare()) {
                calcSquares++;
            }
        }
        return calcSquares;
    }
}