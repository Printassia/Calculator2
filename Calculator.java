package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Calculator extends Application {
    private final TextField input = new TextField();
    private final Button btnZero = new Button("0");
    private final Button btnOne = new Button("1");
    private final Button btnTwo = new Button("2");
    private final Button btnThree = new Button("3");
    private final Button btnFour = new Button("4");
    private final Button btnFive = new Button("5");
    private final Button btnSix = new Button("6");
    private final Button btnSeven = new Button("7");
    private final Button btnEight = new Button("8");
    private final Button btnNine = new Button("9");
    private final Button btnAdd = new Button("+");
    private final Button btnSubtract = new Button("-");
    private final Button btnDivide = new Button("/");
    private final Button btnMultiply = new Button("x");
    private final Button btnDecimalPoint = new Button(".");
    private final Button btnCalculate = new Button("=");
    private final Button btnClear = new Button("C");

    @Override
    public void start(Stage primaryStage) {
        //GridPane properties
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(20);

        //Input TextField
        gridPane.add(inputHBoxTextField(), 0, 0, 3, 1);

        //Number 7
        gridPane.add(btnSeven, 0, 1);
        btnSeven.setOnMouseClicked(actionEvent -> input.appendText("7"));
        GridPane.setMargin(btnSeven, new Insets(0, 0, 0, 15));

        //Number 8
        gridPane.add(btnEight, 1, 1);
        btnEight.setOnMouseClicked(actionEvent -> input.appendText("8"));

        //Number 9
        gridPane.add(btnNine, 2, 1);
        btnNine.setOnMouseClicked(actionEvent -> input.appendText("9"));

        //Number 4
        gridPane.add(btnFour, 0, 2);
        btnFour.setOnMouseClicked(actionEvent -> input.appendText("4"));
        GridPane.setMargin(btnFour, new Insets(0, 0, 0, 15));

        //Number 5
        gridPane.add(btnFive, 1, 2);
        btnFive.setOnMouseClicked(actionEvent -> input.appendText("5"));

        //Number 6
        gridPane.add(btnSix, 2, 2);
        btnSix.setOnMouseClicked(actionEvent -> input.appendText("6"));

        //Number 1
        gridPane.add(btnOne, 0, 3);
        btnOne.setOnMouseClicked(actionEvent -> input.appendText("1"));
        GridPane.setMargin(btnOne, new Insets(0, 0, 0, 15));

        //Number 2
        gridPane.add(btnTwo, 1, 3);
        btnTwo.setOnMouseClicked(actionEvent -> input.appendText("2"));

        //Number 3
        gridPane.add(btnThree, 2, 3);
        btnThree.setOnMouseClicked(actionEvent -> input.appendText("3"));

        //Number 0
        gridPane.add(btnZero, 0, 4);
        btnZero.setOnMouseClicked(actionEvent -> input.appendText("0"));
        GridPane.setMargin(btnZero, new Insets(0, 0, 0, 15));

        //Decimal Point
        gridPane.add(btnDecimalPoint, 0, 5);
        btnDecimalPoint.setOnMouseClicked(actionEvent -> input.appendText("."));
        GridPane.setMargin(btnDecimalPoint, new Insets(0, 0, 0, 15));

        //Add
        gridPane.add(btnAdd, 1, 4);
        btnAdd.setOnMouseClicked(actionEvent -> input.appendText("+"));

        //Subtract
        gridPane.add(btnSubtract, 1, 5);
        btnSubtract.setOnMouseClicked(actionEvent -> input.appendText("-"));

        //Multiply
        gridPane.add(btnMultiply, 2, 4);
        btnMultiply.setOnMouseClicked(actionEvent -> input.appendText("*"));

        //Divide
        gridPane.add(btnDivide, 2, 5);
        btnDivide.setOnMouseClicked(actionEvent -> input.appendText("/"));

        //Calculate Button
        gridPane.add(btnCalculate, 0, 6);
        //Compute the equation
        btnCalculate.setOnAction(e -> calculate(e));

        GridPane.setMargin(btnCalculate, new Insets(0, 0, 0, 15));

        //Clear Button
        gridPane.add(btnClear, 1, 6);

        //Scene
        primaryStage.setScene(new Scene(gridPane, 280, 300));
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

    /** HBox UI: Display Input TextField
     * Clear input TextField
     */
    public HBox inputHBoxTextField() {
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(0, 0, 5, 0));
        hbox.getChildren().add(input);
        //Clear the input TextField
        btnClear.setOnAction(actionEvent -> input.clear());
        return hbox;
    }

    /** Calculation */
    public void calculate(ActionEvent e) {
        //Read numbers from the TextFields
        String getNumberInput = input.getText();
        int answer = 0;

        String[] splitNumbers = getNumberInput.split("[+]|[-]|[*]|[/]");
        String number1 = splitNumbers[0];
        String number2 = splitNumbers[1];

        //Perform calculations based on operators
        if (getNumberInput.contains("+")) {
            answer = Integer.parseInt(number1) + Integer.parseInt(number2);
        } else if (getNumberInput.contains("-")) {
            answer = Integer.parseInt(number1) - Integer.parseInt(number2);
        } else if (getNumberInput.contains("*")) {
            answer = Integer.parseInt(number1) * Integer.parseInt(number2);
        } else if (getNumberInput.contains("/")){
            answer = Integer.parseInt(number1) / Integer.parseInt(number2);
        }

        //Display Results
        int results = answer;
        if (e.getSource() == btnCalculate){input.setText("" + results);}
    }
    /** Launch Application */
    public static void main(String[] args) {
        launch(args);
    }
}