package Aufgabe01;

public class Calc {
    private char operation = '=';
    private Number tos = new Number();
    private Number operand = new Number();
    private boolean reset = true;

    public void setanOperand(int op) {
        if (reset) {
            tos = new Number();
            reset = false;
        }
        if (operation == '=') {
                tos.appendDigits(op);
        } else {
            operand.appendDigits(op);
        }
    }

    public void setanOperator(char operation) {
        if (operation == '=') {
            reset = true;
        }
        if (this.operation != '=') {
            if (this.operation == '+') {
                tos = tos.add(operand);
            } else {
                tos = tos.sub(operand);
            }
            operand = new Number();
            this.operation = operation;
        } else {
            this.operation = operation;
        }
    }

    public Number getTos() {
        return tos;
    }

    public Number getOperand() {
        if (operation == '=') {
            return tos;
        }
        return operand;
    }

    public void toggleSign() {
        if (operation != '=') {
            operand.toggleSign();
        } else {
            tos.toggleSign();
        }
    }
}
