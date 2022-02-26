/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxlayouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TestGridPane extends Application {

    @Override
    public void start(Stage stage) {
        Text t1 = new Text("Email");
        Text t2 = new Text("Password");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Button btn = new Button("Submit");
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(t1, 0, 0);
        gridPane.add(tf1, 1, 0);
        gridPane.add(t2, 0, 1);
        gridPane.add(tf2, 1, 1);
        gridPane.add(btn, 0, 2);
        Scene scene = new Scene(gridPane);
        stage.setTitle("Grid Pane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
