package automationCoursesEpam.arrays3;

public class Task1 {

    public static void main(String s[]) {

    }

    private Task1() {
    }

    public static int[] task1(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] % 2 == 0 && array[array.length - i - 1] % 2 == 0) {
                int swap = array[array.length - i - 1];
                array[array.length - i - 1] = array[i];
                array[i] = swap;
            }
        }
        return array;
    }
}