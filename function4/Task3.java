package EpamJavaCourse.function4;

public class Task3 {

    private Task3() {
    }

    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <= 0) {
            throw new NumberFormatException();
        }
        int progresion = a1;
        int sum = progresion;
        for (int i = 1; i < n; i++) {
            progresion = progresion + t;
            sum = sum * progresion;
        }
        return sum;
    }
}