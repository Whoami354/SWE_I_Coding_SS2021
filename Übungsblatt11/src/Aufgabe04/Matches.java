package Aufgabe04;

public class Matches {
    public static void main(String[] args) {
        Matches helper = new Matches();
        int[] ha = {42, 21, 7, 5, 42, 21, 7};
        int[] a = {1, 1};
        int[] b = {42, 21, 7, 5, 5, 21};
        int[] c = {42, 21, 3, 4, 5, 6, 7, 42, 21};
        System.out.println(helper.prePostMatch(ha));
        System.out.println(helper.prePostMatch(a));
        System.out.println(helper.prePostMatch(b));
        System.out.println(helper.prePostMatch(c));
    }

    public int prePostMatch(int[] aArray) {
        int i;
        for (i = aArray.length / 2; i > 0; i--) {
            boolean isPrePostFix = true;
            for (int j = 0; j < i; j++) {
                if (aArray[j] != aArray[aArray.length - i + j]) {
                    isPrePostFix = false;
                    break;
                }
            }
            if(isPrePostFix){
                return i;
            }
        }
        return i;
    }
}
