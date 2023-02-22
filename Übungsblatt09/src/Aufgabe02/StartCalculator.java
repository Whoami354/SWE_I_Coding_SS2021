package Aufgabe02;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StartCalculator extends Application {
    private TextField input;
    private Calculator calc;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        calc = new Calculator();
        BorderPane root = new BorderPane();

        textField(root);
        setKeyNumbers(root);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mein Kleiner Taschenrechner");
        primaryStage.show();
    }

    public void textField(BorderPane root) {
        input = new TextField();
        input.setMaxWidth(350.0);
        root.setTop(input);
        BorderPane.setAlignment(input, Pos.TOP_CENTER);
    }

    public void setKeyNumbers(BorderPane root) {
        GridPane root2 = new GridPane();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button numbers = new Button(String.valueOf((3 * (2 - j) + i) + 1));
                numbers.setMinSize(50.0, 50.0);
                numbers.setFont(new Font(25));
                numbers.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        input.setText(input.getText() + numbers.getText());
                        calc.setOperand(Integer.parseInt(numbers.getText()));
                    }
                });
                root2.add(numbers, i, j);
            }
        }

        Button numerZero = new Button("0");
        numerZero.setMinSize(50.0, 50.0);
        numerZero.setFont(new Font(25));
        root2.add(numerZero, 1, 3);
        root2.setVgap(20.0);
        root2.setHgap(20.0);
        numerZero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                input.setText(input.getText() + "0");
                calc.setOperand(0);
            }
        });

        Button addition = new Button("+");
        addition.setMinSize(50.0, 50.0);
        addition.setFont(new Font(25));
        root2.add(addition, 5, 0);

        addition.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
               calc.setOperation('+');
               input.setText(input.getText() + "+");
            }
        });

        Button subtract = new Button("-");
        subtract.setMinSize(50.0, 50.0);
        subtract.setFont(new Font(25));
        root2.add(subtract, 5, 1);
        subtract.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calc.setOperation('-');
                input.setText(input.getText() + "-");
            }
        });

        Button equals = new Button("=");
        equals.setMinSize(50.0, 50.0);
        equals.setFont(new Font(25));
        root2.add(equals, 5, 2);
        equals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                input.setText(String.valueOf(calc.getResult()));
            }
        });

        root.setCenter(root2);
        root2.setAlignment(Pos.CENTER);
    }
}
