package EpamJavaCourse.HW_1_conditionStatement;

import java.util.Arrays;

public class Task1 {

    private Task1() {
    }

    public static int task1(int n) {
        if (n > 0) {
            return n * n;
        } else if (n < 0) {
            return n * (-1);
        }
        return n;
    }

    public static int task2(int n) {
        String number = String.valueOf(n);
        char[] digits1 = number.toCharArray();
        Arrays.sort(digits1);
        StringBuilder mas = new StringBuilder();
        for (int i = digits1.length - 1; i >= 0; i--) {
            mas.append(digits1[i]);
        }
        return Integer.parseInt(mas.toString());
    }
}

