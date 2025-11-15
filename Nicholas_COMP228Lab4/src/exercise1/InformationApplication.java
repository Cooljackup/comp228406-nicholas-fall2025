// COMP228-406 - Lab 4 - Nicholas Bonneville
// Lab 4 - Exercise 1

// Write a Java application using JavaFx which allows the user to enter student information.

package exercise1;

// Imports necessary packages.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;

public class InformationApplication extends Application {

    // Instance variables.
    public TextField name, address, city, province, postalCode, phoneNumber, email;
    public RadioButton computerScience, business;
    public ComboBox<String> coursesBox;
    public ListView<String> coursesList;
    public CheckBox studentCouncil, volunteerWork;
    public TextArea outputDisplay;
    public ObservableList<String> computerScienceCourses = FXCollections.observableArrayList("Java", "C#", "Python");
    public ObservableList<String> businessCourses = FXCollections.observableArrayList("Marketing", "Finance", "Law");

    // JavaFX entry point method.
    public void start(Stage stage) {

        // First Column (Column 0).
        GridPane labels = new GridPane();
        labels.setVgap(18);

        labels.add(new Label("Name:"), 0, 0);
        labels.add(new Label("Address:"), 0, 1);
        labels.add(new Label("City:"), 0, 2);
        labels.add(new Label("Province:"), 0, 3);
        labels.add(new Label("Postal Code:"), 0, 4);
        labels.add(new Label("Phone Number:"), 0, 5);
        labels.add(new Label("Email:"), 0, 6);


        // Second Column (Column 1).
        GridPane labelInputs = new GridPane();
        labelInputs.setVgap(10);

        name = new TextField();
        labelInputs.add(name, 0, 0);
        address = new TextField();
        labelInputs.add(address, 0, 1);
        city = new TextField();
        labelInputs.add(city, 0, 2);
        province = new TextField();
        labelInputs.add(province, 0, 3);
        postalCode = new TextField();
        labelInputs.add(postalCode, 0, 4);
        phoneNumber = new TextField();
        labelInputs.add(phoneNumber, 0, 5);
        email = new TextField();
        labelInputs.add(email, 0, 6);


        // Third Column (Column 2).
        GridPane additionalActivities = new GridPane();
        additionalActivities.setVgap(40);

        studentCouncil = new CheckBox("Student Council");
        additionalActivities.add(studentCouncil, 0, 1);
        volunteerWork = new CheckBox("Volunteer Work");
        additionalActivities.add(volunteerWork, 0, 4);


        // Fourth Column (Column 3). Also contains logic for showing the appropriate classes when a major is selected.
        GridPane major = new GridPane();
        major.setVgap(20);

        computerScience = new RadioButton("Computer Science");
        business = new RadioButton("Business");
        ToggleGroup majorToggle = new ToggleGroup();
        computerScience.setToggleGroup(majorToggle);
        business.setToggleGroup(majorToggle);
        HBox majorBox = new HBox(20, computerScience, business);
        coursesBox = new ComboBox<>();
        coursesBox.setPrefWidth(150);
        coursesList = new ListView<>();
        coursesList.setPrefHeight(120);

        major.add(majorBox, 0, 0);
        major.add(coursesBox, 0, 1);
        major.add(coursesList, 0, 2);

        computerScience.setOnAction(event -> coursesBox.setItems(computerScienceCourses));
        business.setOnAction(event -> coursesBox.setItems(businessCourses));
        coursesBox.setOnAction(event -> {
            String selected = coursesBox.getValue();
            if (selected != null && !coursesList.getItems().contains(selected)) {
                coursesList.getItems().add(selected);
            }
        });


        // Display output with button. Contains logic for properly displaying the information correctly and formatting it.
        Button displayButton = new Button("Display");
        HBox buttonBox = new HBox(displayButton);
        buttonBox.setAlignment(Pos.CENTER);
        outputDisplay = new TextArea();
        outputDisplay.setEditable(false);
        outputDisplay.setPrefHeight(200);

        displayButton.setOnAction(event -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(name.getText()).append(", ")
                    .append(address.getText()).append(", ")
                    .append(city.getText()).append(", ")
                    .append(province.getText()).append(", ")
                    .append(postalCode.getText()).append(", ")
                    .append(phoneNumber.getText()).append(", ")
                    .append(email.getText()).append("\n\n");

            stringBuilder.append("Major: ");
            if (computerScience.isSelected())
                stringBuilder.append("Computer Science\n");
            else if (business.isSelected())
                stringBuilder.append("Business\n");
            else
                stringBuilder.append("\n");

            stringBuilder.append("\nCourses:\n");
            for (String c : coursesList.getItems()) {
                stringBuilder.append("* ").append(c).append("\n");
            }

            stringBuilder.append("\nActivities:\n");
            if (studentCouncil.isSelected())
                stringBuilder.append("* Student Council\n");
            if (volunteerWork.isSelected())
                stringBuilder.append("* Volunteer Work\n");

            outputDisplay.setText(stringBuilder.toString());
        });


        // Window grid Layout.
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(20);
        grid.add(labels, 0, 0);
        grid.add(labelInputs, 1, 0);
        grid.add(additionalActivities, 2, 0);
        grid.add(major, 3, 0);
        BorderPane root = new BorderPane();
        root.setCenter(grid);
        root.setBottom(new VBox(buttonBox, outputDisplay));

        // General window setup.
        stage.setTitle("Information Application");
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
    }

    // Launches JavaFX.
    public static void main(String[] args) {
        launch(args);
    }
}