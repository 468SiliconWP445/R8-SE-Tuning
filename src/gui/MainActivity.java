package com.a604958692.r8setuning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainActivity extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/a604958692/r8setuning/view.fxml")); //root
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);

        primaryStage.setTitle("R8 SE Tuning");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
