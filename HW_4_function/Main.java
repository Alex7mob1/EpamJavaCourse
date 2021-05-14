package EpamJavaCourse.HW_4_function;


public class Main {
    public static void main(String[] args) {
        int[] array;
        array = new int[]{15, 10, 3};
        //System.out.println("isSorted = " + isSorted(null, SortOrder.DESC));

        //System.out.println("transform = " + Arrays.toString(transform(array, SortOrder.DESC)));

//        int a1 = 1;
//        int t = 2;
//        int n = 1;
//
//        System.out.println("multiArithmeticElements = " + multiArithmeticElements(a1, t, n));
//
        int a1=1000000000;
        double t =0.999999999999;
        int alim=20;

        System.out.println("sumGeometricElements = " + Task4.sumGeometricElements(a1,t,alim));

    }
}
