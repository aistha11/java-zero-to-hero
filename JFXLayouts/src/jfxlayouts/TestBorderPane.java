/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxlayouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TestBorderPane extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane bp = new BorderPane();
        bp.setTop(new TextField("Top"));
        bp.setBottom(new TextField("Bottom"));
        bp.setLeft(new TextField("Left"));
        bp.setRight(new TextField("Right"));
        bp.setCenter(new TextField("Center"));
        Scene scene = new Scene(bp);
        stage.setTitle("BorderPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
