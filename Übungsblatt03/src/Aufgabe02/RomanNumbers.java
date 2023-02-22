package Aufgabe02;

import java.util.Arrays;

public class RomanNumbers {
    public static void main(String[] args) {
        //Aufgabe a)
        RomanNumbers rn = new RomanNumbers();
        int testnumber = 123;
        System.out.println(rn.romanCountercool(testnumber));
        int testnumber2 = 9;
        System.out.println(rn.romanCountercool(testnumber2));
        int testnumber3 = 40;
        System.out.println(rn.romanCountercool(testnumber3));
        int testnumber4 = 90;
        System.out.println(rn.romanCountercool(testnumber4));
        int testnumber5 = 4;
        System.out.println(rn.romanCountercool(testnumber5));
        int testnumber6 = 42;
        System.out.println(rn.romanCountercool(testnumber6));
        int testnumber7 = 1234;
        System.out.println(rn.romanCountercool(testnumber7));
        int testnumber8 = 2008;
        System.out.println(rn.romanCountercool(testnumber8));
    }

    public StringBuilder romanCountercool(int number) {
        //festlegung der Werte
        int[] rome = {1000, 900, 400, 500, 100, 90, 50, 40, 10, 9, 8, 5, 4, 1};
        //Festlegung der Buchstaben für die Zahlen
        String[] symbols = {"M", "CM", "D", "CD", "C", "L", "XC", "XL", "X", "IX", "VIII", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rome.length; i++) {
            //wie oft die zahl reinpasst
            int sum = number / rome[i];
            //wieviel davon übrig bleibt
            number = number % rome[i];
            String[] counter = new String[sum];
            Arrays.fill(counter, symbols[i]);
            for (int j = 0; j < counter.length; j++) {
                result.append(counter[j]);
            }
        }
        return result;
    }
}
