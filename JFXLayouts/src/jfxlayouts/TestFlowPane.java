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
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TestFlowPane extends Application {

    @Override
    public void start(Stage stage) {
        Button btn1 = new Button("Button1");
        Button btn2 = new Button("Button2");
        Button btn3 = new Button("Button3");
        FlowPane fp = new FlowPane();
        fp.setHgap(15);
        fp.setMargin(btn1, new Insets(20, 0, 20, 20));
        ObservableList list = fp.getChildren();
        list.addAll(btn1, btn2, btn3);
        Scene scene = new Scene(fp);
        stage.setTitle("FlowPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
