package EpamJavaCourse.introductionOOP5;

public class Main {
    public static void main(String[] args) {
//        Rectangle p = new Rectangle(1,2);
//        System.out.println(p.perimeter());
//
//        Rectangle p2 = new Rectangle();
//        System.out.println(p2);
//
//        System.out.println(p2.perimeter());
//
//        p2.replaceSides();
//        System.out.println(p2);
        Rectangle[] arr = new Rectangle[4];
        arr[0] = new Rectangle(4, 5);
        arr[1] = new Rectangle(9, 4);
        arr[2] = new Rectangle(3, 6);
        arr[3] = new Rectangle();
        ArrayRectangles test = new ArrayRectangles(arr);

        test.addRectangle(new Rectangle());

//        ArrayRectangles boom = new ArrayRectangles(arr);
//        boom.numberMinPerimeter();
//        boom.print();

    }
}
