package com.nighthacks.fx.daynightterminator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        DayNightTerminator terminator = DayNightTerminator.colorful(); // Or greyscale()
        
        StackPane root = new StackPane();
        root.getChildren().add(terminator);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Day Night Terminator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
