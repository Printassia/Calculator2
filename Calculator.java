/** JavaFX GUI Calculator */
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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
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
        //GridPane UI properties
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.styleProperty().set("-fx-background-color: #084B83;");

        //Input TextField
        gridPane.add(inputHBoxTextField(), 0,0,3,1);
        //Expand the input field automatically with the gridPane layout
        input.prefWidthProperty().bind(gridPane.widthProperty());
        input.prefHeightProperty().bind(gridPane.heightProperty());
        input.setMaxHeight(100);

        //Number 7
        gridPane.add(btnSeven, 0, 1);
        btnSeven.setOnMouseClicked(actionEvent -> input.appendText("7"));
        GridPane.setMargin(btnSeven, new Insets(0, 0, 0, 38));
        btnSeven.setPadding(new Insets(10,25,10,25));
        btnSeven.setFont(Font.font("Times",FontWeight.BOLD, 15));
        btnSeven.prefWidthProperty().bind(gridPane.widthProperty());
        btnSeven.prefHeightProperty().bind(gridPane.heightProperty());
        btnSeven.setMaxSize(10,10);
        btnSeven.setTextFill(Color.rgb(0,167,255));

        //Number 8
        gridPane.add(btnEight, 1, 1);
        btnEight.setOnMouseClicked(actionEvent -> input.appendText("8"));
        btnEight.setPadding(new Insets(10,25,10,25));
        btnEight.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnEight.setTextFill(Color.rgb(0,167,255));

        //Number 9
        gridPane.add(btnNine, 2, 1);
        btnNine.setOnMouseClicked(actionEvent -> input.appendText("9"));
        btnNine.setPadding(new Insets(10,25,10,25));
        btnNine.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnNine.setTextFill(Color.rgb(0,167,255));

        //Number 4
        gridPane.add(btnFour, 0, 2);
        btnFour.setOnMouseClicked(actionEvent -> input.appendText("4"));
        btnFour.setPadding(new Insets(10,25,10,25));
        btnFour.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnFour.setTextFill(Color.rgb(0,167,255));
        GridPane.setMargin(btnFour, new Insets(0, 0, 0, 38));

        //Number 5
        gridPane.add(btnFive, 1, 2);
        btnFive.setOnMouseClicked(actionEvent -> input.appendText("5"));
        btnFive.setPadding(new Insets(10,25,10,25));
        btnFive.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnFive.setTextFill(Color.rgb(0,167,255));

        //Number 6
        gridPane.add(btnSix, 2, 2);
        btnSix.setOnMouseClicked(actionEvent -> input.appendText("6"));
        btnSix.setPadding(new Insets(10,25,10,25));
        btnSix.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnSix.setTextFill(Color.rgb(0,167,255));

        //Number 1
        gridPane.add(btnOne, 0, 3);
        btnOne.setOnMouseClicked(actionEvent -> input.appendText("1"));
        btnOne.setPadding(new Insets(10,25,10,25));
        btnOne.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnOne.setTextFill(Color.rgb(0,167,255));
        GridPane.setMargin(btnOne, new Insets(0, 0, 0, 38));

        //Number 2
        gridPane.add(btnTwo, 1, 3);
        btnTwo.setOnMouseClicked(actionEvent -> input.appendText("2"));
        btnTwo.setPadding(new Insets(10,25,10,25));
        btnTwo.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnTwo.setTextFill(Color.rgb(0,167,255));

        //Number 3
        gridPane.add(btnThree, 2, 3);
        btnThree.setOnMouseClicked(actionEvent -> input.appendText("3"));
        btnThree.setPadding(new Insets(10,25,10,25));
        btnThree.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnThree.setTextFill(Color.rgb(0,167,255));

        //Number 0
        gridPane.add(btnZero, 0, 4);
        btnZero.setOnMouseClicked(actionEvent -> input.appendText("0"));
        btnZero.setPadding(new Insets(10,25,10,25));
        btnZero.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnZero.setTextFill(Color.rgb(0,167,255));
        GridPane.setMargin(btnZero, new Insets(0, 0, 0, 38));

        //Decimal Point
        gridPane.add(btnDecimalPoint, 0, 5);
        btnDecimalPoint.setOnMouseClicked(actionEvent -> input.appendText("."));
        btnDecimalPoint.setPadding(new Insets(10,25,10,25));
        btnDecimalPoint.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnDecimalPoint.setTextFill(Color.rgb(0,167,255));
        GridPane.setMargin(btnDecimalPoint, new Insets(0, 0, 0, 38));

        //Add
        gridPane.add(btnAdd, 1, 4);
        btnAdd.setOnMouseClicked(actionEvent -> input.appendText("+"));
        btnAdd.setPadding(new Insets(10,25,10,25));
        btnAdd.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnAdd.setTextFill(Color.rgb(0,167,255));

        //Subtract
        gridPane.add(btnSubtract, 1, 5);
        btnSubtract.setOnMouseClicked(actionEvent -> input.appendText("-"));
        btnSubtract.setPadding(new Insets(10,25,10,25));
        btnSubtract.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnSubtract.setTextFill(Color.rgb(0,167,255));

        //Multiply
        gridPane.add(btnMultiply, 2, 4);
        btnMultiply.setOnMouseClicked(actionEvent -> input.appendText("*"));
        btnMultiply.setPadding(new Insets(10,25,10,25));
        btnMultiply.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnMultiply.setTextFill(Color.rgb(0,167,255));

        //Divide
        gridPane.add(btnDivide, 2, 5);
        btnDivide.setOnMouseClicked(actionEvent -> input.appendText("/"));
        btnDivide.setPadding(new Insets(10,25,10,25));
        btnDivide.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnDivide.setTextFill(Color.rgb(0,167,255));

        //Calculate Button
        gridPane.add(btnCalculate, 0, 6);
        btnCalculate.setPadding(new Insets(10,25,10,25));
        btnCalculate.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnCalculate.setTextFill(Color.rgb(0,167,255));
        GridPane.setMargin(btnCalculate, new Insets(0, 0, 0, 38));
        //Compute the equation(from the calculate method) when clicked on the calculate button
        btnCalculate.setOnAction(e -> calculate(e));

        //Clear Button
        gridPane.add(btnClear, 1, 6);
        btnClear.setPadding(new Insets(10,25,10,25));
        btnClear.setFont(Font.font("Times", FontWeight.BOLD, 15));
        btnClear.setTextFill(Color.rgb(0,167,255));

        //Scene & Title
        primaryStage.setScene(new Scene(gridPane, 280, 420));
        primaryStage.setMaxWidth(300);
        primaryStage.setMaxHeight(480);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

    /** HBox UI: Display Input TextField
     * Clear input TextField
     */
    public HBox inputHBoxTextField() {
        HBox hbox = new HBox();

        //Preset input TextField to zero, align zero to the right & enlarge the font size
        input.setPromptText("0");
        input.setAlignment(Pos.BOTTOM_RIGHT);
        input.setFont(Font.font(30));

        //Change the input TextField border color
        input.setStyle("-fx-border-color: white");

        //Clear the input TextField when the clear button is pressed
        btnClear.setOnAction(actionEvent -> input.clear());

        //Add input TextField to HBox to be added to Gridpane
        hbox.getChildren().add(input);
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
            answer = Double.parseDouble(number1) + Double.parseDouble(number2);
        } else if (getNumberInput.contains("-")) {
            answer = Double.parseDouble(number1) - Double.parseDouble(number2);
        } else if (getNumberInput.contains("*")) {
            answer = Double.parseDouble(number1) * Double.parseDouble(number2);
        } else if (getNumberInput.contains("/")){
            answer = Double.parseDouble(number1) / Double.parseDouble(number2);
        }

        //Display Results
        double results = answer;
        if (e.getSource() == btnCalculate){input.setText(String.format("%.1f", results));}
        
    /** Launch Application */
    public static void main(String[] args) {
        launch(args);
    }
}
