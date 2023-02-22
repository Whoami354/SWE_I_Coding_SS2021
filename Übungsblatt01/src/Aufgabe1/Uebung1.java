package Aufgabe1;

import java.util.Arrays;

public class Uebung1 {
    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] c = {1, 1, 2};
        int[] d = {1, 2, 1};
        int[] e = {3, 1, 4, 1, 5, 9, 2, 6, 5, 4};
        int res[];
        Uebung1 clerk = new Uebung1();
        System.out.println(Arrays.toString(a));
        res = clerk.removeDouble(a);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(b));
        res = clerk.removeDouble(b);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(c));
        res = clerk.removeDouble(c);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(d));
        res = clerk.removeDouble(d);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(e));
        res = clerk.removeDouble(e);
        System.out.println(Arrays.toString(res));
    }

    public int[] removeDouble(int aArray[]) {
        int zwErg[] = new int[aArray.length];
        int alreadyFilled = 0;
        for (int i = 0; i < aArray.length; i++) {
            int currentElement = aArray[i];
            if (!contains(currentElement, zwErg, alreadyFilled)) {
                zwErg[alreadyFilled] = currentElement;
                alreadyFilled += 1;
            }
        }
        int erg[] = new int[alreadyFilled];
        for (int i = 0; i < alreadyFilled; i++) {
            erg[i] = zwErg[i];
        }
        return erg;
    }

    private boolean contains(int theValue, int allValues[], int filledUntil) {
        for (int i = 0; i < filledUntil; i++) {
            if (allValues[i] == theValue) {
                return true;
            }
        }
        return false;
    }
}
