package EpamJavaCourse.HW_9_exeption;

public class Main {
    public static void main(String[] args) throws MatrixException {
        double[][] mass;
        mass = new double[3][3];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j]=j++;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.println(mass[i][j]);
            }
        }

        Matrix matrix = new Matrix(mass);
        System.out.println(matrix);
    }
}
