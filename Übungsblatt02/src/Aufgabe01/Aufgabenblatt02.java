package Aufgabe01;

public class Aufgabenblatt02 {
    public static void main(String[] args) {
        Aufgabenblatt02 clerk = new Aufgabenblatt02();
        String str;
        str = "1000000.6566";
        System.out.println(str + " ---> " + clerk.String2Double(str));
        str = "543.321E10";
        System.out.println(str + " ---> " + clerk.String2Double(str));
    }

    public static double String2Double(String str) {
        int strLen = str.length();
        int[] array = new int[3];
        int setIndex = 0;
        int counter = 0;
        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) == '.') {
                setIndex = 1;
            } else if (str.charAt(i) == 'E') {
                setIndex = 2;
            } else {
                short digit = (short) ((short) str.charAt(i) - 48);
                array[setIndex] = array[setIndex] * 10 + digit;
                if (setIndex == 1) {
                    counter++;
                }
            }
        }
        double second = array[1] / (Math.pow(10, counter));
        double total = (array[0] + second) * Math.pow( 10, array[2]);
        return total;

    }

}
