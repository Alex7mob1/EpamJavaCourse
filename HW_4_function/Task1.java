package EpamJavaCourse.HW_4_function;

public class Task1 {

    private Task1() {
    }

    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || array.length == 0 || order == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < array.length - 1; i++) {
            if ((SortOrder.ASC.equals(order) && array[i] > array[i + 1]) || (SortOrder.DESC.equals(order) && array[i] < array[i + 1])) {
                return false;
            }
        }
        return true;
    }
}
