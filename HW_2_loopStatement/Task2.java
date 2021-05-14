package EpamJavaCourse.HW_2_loopStatement;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(task2(14));
    }

    public static int task2(int value) {
        if (value >= 0) {
            String bin = Integer.toBinaryString(value);
            char[] array = bin.toCharArray();
            int sum = 0;
            int x = 0;
            for (char c : array) {
                x = c - '0';
                if (x == 1) {
                    sum = sum + x;
                }
            }
            return sum;
        } else {
            return 0;
        }
    }
}

