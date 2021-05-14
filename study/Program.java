package automationCoursesEpam.study;

public class Program{

    public static void main(String[] args) {

        System.out.println(Operation.sum(45, 23));          // 68
        System.out.println(Operation.subtract(45, 23));     // 22
        System.out.println(Operation.multiply(4, 23));      // 92
    }
}
class Operation{

     static int sum(int x, int y){
        return x + y;
    }
     static int subtract(int x, int y){
        return x - y;
    }
    static int multiply(int x, int y){
        return x * y;
    }
}