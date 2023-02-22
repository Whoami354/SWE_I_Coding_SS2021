package Aufgabe01;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class OperandHandler implements EventHandler<ActionEvent> {
    private Calc calc;
    private int digit;
    private TextField input;

    public OperandHandler(Calc calc, int digit, TextField input) {
        this.calc = calc;
        this.digit = digit;
        this.input = input;
    }

    @Override
    public void handle(ActionEvent event) {
        calc.setanOperand(digit);
        input.setText(String.valueOf(calc.getOperand()));
    }
}
