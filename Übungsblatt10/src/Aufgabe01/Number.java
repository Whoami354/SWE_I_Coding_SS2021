package Aufgabe01;

import java.util.ArrayList;

public class Number {
    private ArrayList<Integer> digits = new ArrayList<Integer>();
    private int sign = 1;

    public void toggleSign() {
        sign *= -1;
    }

    public void appendDigits(int number) {
        digits.add(0, number);
    }

    public Number add(Number newNumber) {
        int carry = 0;
        Number number = new Number();
        Number number1 = new Number();
        if (digits.size() < newNumber.digits.size()) {
            number.digits = new ArrayList<>(newNumber.digits);
            number1 = this;
        } else {
            number.digits = new ArrayList<>(digits);
            number1 = newNumber;
        }
        int i;
        for (i = 0; i < number1.digits.size(); i++) {
            number.digits.set(i, number1.digits.get(i) + number.digits.get(i) + carry);
            if (number.digits.get(i) >= 10) {
                number.digits.set(i, number.digits.get(i) - 10);
                carry = 1;
            } else {
                carry = 0;
            }
        }
        if (carry == 1) {
            if (i >= number.digits.size()) {
                number.digits.add(1);
            } else {
                number.digits.set(i, number.digits.get(i) + 1);
            }
        }
        return number;
    }

    public Number sub(Number negativeResult) {
        int carry2 = 0;
        Number leftnumber = new Number();
        Number rightnumber = new Number();
        if (digits.size() < negativeResult.digits.size()) {
            leftnumber.digits = new ArrayList<>(negativeResult.digits);
            rightnumber = this;
        } else {
            leftnumber.digits = new ArrayList<>(digits);
            rightnumber = negativeResult;
        }
        int i;
        for (i = 0; i < rightnumber.digits.size(); i++) {
            leftnumber.digits.set(i, rightnumber.digits.get(i) - leftnumber.digits.get(i) - carry2);
            if (leftnumber.digits.get(i) < 0) {
                leftnumber.digits.set(i, leftnumber.digits.get(i) + 10);
                carry2 = 1;
            } else {
                carry2 = 0;
            }
        }
        if (carry2 == 1) {
            if (i >= leftnumber.digits.size()) {
                leftnumber.digits.set(i - 1, leftnumber.digits.get(i - 1) - 10);
                leftnumber.toggleSign();
            } else {
                leftnumber.digits.set(i, leftnumber.digits.get(i) - 1);
            }
        }
        return leftnumber;
    }

    @Override
    public String toString() {
        StringBuilder add = new StringBuilder();
        if (sign < 0) {
            add.append('-');
        }
        for (Integer number : digits) {
            add.insert(0, number);
        }
        return String.valueOf(add);
    }
}
