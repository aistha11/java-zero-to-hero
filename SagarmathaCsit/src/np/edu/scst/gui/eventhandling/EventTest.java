/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui.eventhandling;

import java.awt.*;

/**
 *
 * @author dell
 */
public class EventTest extends Frame {

    TextField t;
    Button b;

    EventTest() {
        setTitle("Old way of handling events");
        setSize(300, 200);
        setLayout(new FlowLayout());
        t = new TextField(20);
        b = new Button("Click");
        add(t);
        add(b);
        setVisible(true);
        
    }

    

    public static void main(String[] args) {
        new EventTest();
    }
    
    public boolean action(Event e, Object obj) {
        String caption = (String) obj;
        String msg = "Hello";
        if (e.target instanceof Button) {
            if (caption == "Click") {
                t.setText(msg);
            }
        }
        return true;
    }
}
