/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui.layouts;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {

    BorderLayoutDemo() {
        
       JButton north = new JButton("North");
       JButton west = new JButton("West");
       JButton east = new JButton("East");
       JButton south = new JButton("South");
       JButton center = new JButton("Center");
       
        setLayout(new BorderLayout());

        add(BorderLayout.NORTH,north);
        add(BorderLayout.WEST,west);
        add(BorderLayout.EAST,east);
        add(BorderLayout.SOUTH,south);
        add(BorderLayout.CENTER,center);

        setVisible(true);
        setTitle("Card Layout");
        setSize(500, 500);
        setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
