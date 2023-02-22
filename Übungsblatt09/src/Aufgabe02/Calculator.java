package Aufgabe02;

public class Calculator {
    private char operation = '0';
    private int[] operand = new int[2];

    public int getResult() {
        if (operation == '+') {
            return operand[0] + operand[1];
        } else {
            return operand[0] - operand[1];
        }
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setOperand(int operand) {
        if (operation == '+' || operation == '-') {
            this.operand[1] *= 10;
            this.operand[1] += operand;
        } else {
            this.operand[0] *= 10;
            this.operand[0] += operand;
        }
    }

}
