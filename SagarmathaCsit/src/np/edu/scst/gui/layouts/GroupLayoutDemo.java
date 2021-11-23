/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui.layouts;

import javax.swing.*;
import java.awt.*;

public class GroupLayoutDemo extends JFrame {

    GroupLayoutDemo() {
        JButton north = new JButton("North");
        JButton west = new JButton("West");
        JButton east = new JButton("East");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");

        JPanel jPanel = new JPanel();
        GroupLayout gL = new GroupLayout(jPanel);
        jPanel.setLayout(gL);
        
        add(jPanel);
        
        // revisit now

        

        setVisible(true);
        setTitle("Card Layout");
        setSize(500, 500);
        setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {
        new GroupLayoutDemo();
    }
}
