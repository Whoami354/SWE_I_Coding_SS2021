package Aufgabe01;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class OperatorHandler implements EventHandler<ActionEvent> {
    private Calc calc;
    private TextField input;
    private char operator;

    public OperatorHandler(Calc calc, TextField input, char operator) {
        this.calc = calc;
        this.input = input;
        this.operator = operator;
    }

    @Override
    public void handle(ActionEvent event) {
        calc.setanOperator(operator);
        input.setText(String.valueOf(calc.getTos()));
    }
}
