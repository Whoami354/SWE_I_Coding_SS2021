package Aufgabe2;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] shuffle = {1, 41, 37, 20, 15, 12, 2, 9, 10, 40};
        int res[];
        Shuffle shuffle1 = new Shuffle();
        System.out.println(Arrays.toString(shuffle));
        res = shuffle1.removeDouble(shuffle);
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
