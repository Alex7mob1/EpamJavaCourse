package automationCoursesEpam.arrays3;

public class Task3 {
    public static void main(String[] args) {
    }


    public static int[][] task3(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i < j) {
                    matrix[i][j] = 1;
                } else if (i > j) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
