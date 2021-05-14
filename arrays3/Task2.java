package automationCoursesEpam.arrays3;

public class Task2 {
    public static void main(String[] args) {
    }

    public static int task2(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max1 = array[0];
        int max2 = array[array.length - 1];
        int indexMax1 = 0;
        int indexMax2 = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (max1 < array[i]) {
                max1 = array[i];
                indexMax1 = i;
            }
            if (max2 < array[array.length - 1 - i]) {
                max2 = array[array.length - 1 - i];
                indexMax2 = array.length - 1 - i;
            }
        }
        return indexMax2 - indexMax1;
    }
}