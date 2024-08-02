package com.lorenzotardini.clrestaurant;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class CLRApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CLRApplication.class.getResource("mainpanel.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setResizable(false);
        stage.setMinHeight(940.0);
        stage.setMinWidth(1500.0);
        stage.getIcons().add(new Image(new FileInputStream("..\\CLRestaurant\\src\\main\\assets\\pizzaslice.png")));
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}