package EpamJavaCourse.HW_4_function;

public class Task4 {

    private Task4() {
    }

    public static double sumGeometricElements(int a1, double t, int alim) {
        if (a1 <= alim || alim < 0 || t <= 0.0 || t >= 1.0) {
            throw new IllegalArgumentException();
        } else {
            double sum = 0;
            for (double i = a1; i > alim && i >= 0.000000001; i = i * t) {
                sum = sum + i;
            }
            return Math.round(sum);
        }
    }
}