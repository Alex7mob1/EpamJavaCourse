package EpamJavaCourse.loopStatement2;


public final class MainUtils {

    private MainUtils() {
    }

    public static int task1(int value) {
        if (value > 0) {
            String number = String.valueOf(value);
            char[] digits1 = number.toCharArray();
            int total = 0;
            int x = 0;
            for (char c : digits1) {
                x = Character.getNumericValue(c);
                if (x % 2 == 1) {
                    total = total + x;
                }
            }
            return total;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int task2(int value) {
        if (value > 0) {
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
            throw new IllegalArgumentException();
        }
    }

    public static int task3(int value) {
        if (value > 1) {
            int a = 0;
            int b = 1;
            int fib = 0;
            int sum = 1;
            for (int i = 2; i < value; i++) {
                fib = a + b;
                a = b;
                b = fib;
                sum = sum + fib;
            }
            return sum;
        } else if (value == 1) {
            return 0;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
