/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxlayouts;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class TestHBox extends Application {

    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        Button btn = new Button("Click");
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setMargin(textField, new Insets(20, 20, 20, 20));
        hbox.setMargin(btn, new Insets(20, 20, 20, 20));
        ObservableList list = hbox.getChildren();
        list.addAll(textField, btn);
        Scene scene = new Scene(hbox);
        stage.setTitle("Hbox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
