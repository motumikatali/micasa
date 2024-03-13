package com.example.micasa;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;

public class HelloApplication extends Application {

    private Pane carPane1;
    private Pane carPane2;
    private Pane carPane3;
    private Pane carPane4;
    private Pane carPane5;
    private Pane carPane6;

    private boolean carPane1Visible = false;
    private boolean carPane2Visible = false;
    private boolean carPane3Visible = false;
    private boolean carPane4Visible = false;
    private boolean carPane5Visible = false;
    private boolean carPane6Visible = false;

    @Override
    public void start(Stage primaryStage) {
        // Create buttons
        Button btnCar1 = new Button("AUDI");
        Button btnCar2 = new Button("M. BENZ");
        Button btnCar3 = new Button("CARDILLAC");
        Button btnCar4 = new Button("FERRARI");
        Button btnCar5 = new Button("FORD MUSTANG");
        Button btnCar6 = new Button("LANDROVER");

        // Create car panes
        carPane1 = createCarPane();
        carPane2 = createCarPane();
        carPane3 = createCarPane();
        carPane4 = createCarPane();
        carPane5 = createCarPane();
        carPane6 = createCarPane();

        // Set action handlers for buttons
        btnCar1.setOnAction(e -> displayCar1());
        btnCar2.setOnAction(e -> displayCar2());
        btnCar3.setOnAction(e -> displayCar3());
        btnCar4.setOnAction(e -> displayCar4());
        btnCar5.setOnAction(e -> displayCar5());
        btnCar6.setOnAction(e -> displayCar6());

        // Layout for buttons
        HBox buttonBox1 = new HBox(90, btnCar1, btnCar2, btnCar3,btnCar4, btnCar5, btnCar6 );
       // HBox buttonBox2 = new HBox(10, btnCar4, btnCar5, btnCar6);
        buttonBox1.setPadding(new Insets(50));
       // buttonBox2.setPadding(new Insets(10));

        // Layout for car panes
        // Layout for car panes
        GridPane carGrid = new GridPane();
        carGrid.setAlignment(Pos.CENTER);
        carGrid.setHgap(10); // Horizontal gap between panes
        carGrid.setVgap(10); // Vertical gap between panes
        carGrid.setPadding(new Insets(10));

        // Add car panes to the grid
        carGrid.add(carPane1, 0, 0);
        carGrid.add(carPane2, 1, 0);
        carGrid.add(carPane3, 2, 0);
        carGrid.add(carPane4, 0, 1);
        carGrid.add(carPane5, 1, 1);
        carGrid.add(carPane6, 2, 1);

        // Set column and row constraints to make the grid layout flexible
        ColumnConstraints colConstraints = new ColumnConstraints();
        colConstraints.setPercentWidth(33.33);
        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setPercentHeight(50);

        carGrid.getColumnConstraints().addAll(colConstraints, colConstraints, colConstraints);
        carGrid.getRowConstraints().addAll(rowConstraints, rowConstraints);


        // Main layout
        VBox root = new VBox(10, buttonBox1, carGrid);
        root.setPadding(new Insets(10));

        // Create scene
        Scene scene = new Scene(root, 600, 600);

        // Set stage title and scene, then show the stage
        primaryStage.setTitle("Car Gallery");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        primaryStage.show();

    }

    private Pane createCarPane() {
        Pane pane = new Pane();
        pane.setMinSize(300, 300); // Increase the size of the panes
        pane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        return pane;
    }

    private void setBackgroundImage(Pane pane, Image image) {
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(100, 100, true, true, true, true)); // Adjust the BackgroundSize to ensure the image fills the pane
        pane.setBackground(new Background(backgroundImage));
    }


    private void displayCar1() {
        // Load and display image for Car 1
        Image image = new Image("C://Users//LEARNER//Desktop//micasa//micasa//src//main//resources//com//example//micasa//audi.jpg");
        if (carPane1Visible) {
            carPane1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            setBackgroundImage(carPane1, image);
        }
        carPane1Visible = !carPane1Visible;
    }

    // Implement displayCar2() to display image for Car 2
    private void displayCar2() {
        Image image = new Image("C://Users//LEARNER//Desktop//micasa//micasa//src//main//resources//com//example//micasa//benz.jpg");
        if (carPane2Visible) {
            carPane2.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            setBackgroundImage(carPane2, image);
        }
        carPane2Visible = !carPane2Visible;
    }

    // Implement displayCar3() to display image for Car 3
    private void displayCar3() {
        Image image = new Image("C://Users//LEARNER//Desktop//micasa//micasa//src//main//resources//com//example//micasa//cardillac.jpg");
        if (carPane3Visible) {
            carPane3.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            setBackgroundImage(carPane3, image);
        }
        carPane3Visible = !carPane3Visible;
    }

    // Implement displayCar4() to display image for Car 4
    private void displayCar4() {
        Image image = new Image("C://Users//LEARNER//Desktop//micasa//micasa//src//main//resources//com//example//micasa//ferrari.jpg");
        if (carPane4Visible) {
            carPane4.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            setBackgroundImage(carPane4, image);
        }
        carPane4Visible = !carPane4Visible;
    }

    // Implement displayCar5() to display image for Car 5
    private void displayCar5() {
        Image image = new Image("C://Users//LEARNER//Desktop//micasa//micasa//src//main//resources//com//example//micasa//fordMustang.jpg");
        if (carPane5Visible) {
            carPane5.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            setBackgroundImage(carPane5, image);
        }
        carPane5Visible = !carPane5Visible;
    }

    // Implement displayCar6() to display image for Car 6
    private void displayCar6() {
        Image image = new Image("C://Users//LEARNER//Desktop//micasa//micasa//src//main//resources//com//example//micasa//landrover.jpg");
        if (carPane6Visible) {
            carPane6.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            setBackgroundImage(carPane6, image);
        }
        carPane6Visible = !carPane6Visible;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
