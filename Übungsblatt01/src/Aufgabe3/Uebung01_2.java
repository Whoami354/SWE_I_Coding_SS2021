package Aufgabe3;

import java.util.Arrays;

public class Uebung01_2 {
    public static void main(String[] args) {
        int[] atLeastdouble = {1, 2, 1, 3, 1, 5, 2, 2, 5, 5};
        int[] atLeastdouble2 = {1, 1, 1};
        int[] output = counter(atLeastdouble);
        int[] output2 = counter(atLeastdouble2);
        System.out.println(Arrays.toString(output));
        System.out.println(Arrays.toString(output2));
    }

    public static int[] counter(int[] leastdouble) {
        int[] middleres = new int[leastdouble.length];
        int counter = 0;
        for (int i = 0; i < leastdouble.length; i++) {
            if (isfirst(leastdouble, i) || islast(leastdouble, i)) {
                middleres[counter] = leastdouble[i];
                counter++;
            }
        }
        int[] result = new int[counter];
        for (int j = 0; j < counter; j++) {
            result[j] = middleres[j];
        }
        return result;
    }

    private static boolean isfirst(int[] leastdouble, int i) {
        for (int k = 0; k < i; k++) {
            if (leastdouble[k] == leastdouble[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean islast(int[] leastdouble, int i) {
        for (int g = (leastdouble.length - 1); g > i; g--) {
            if (leastdouble[g] == leastdouble[i]) {
                return false;
            }
        }
        return true;
    }
}
