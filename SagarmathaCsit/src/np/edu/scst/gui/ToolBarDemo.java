/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui;

import javax.swing.*;
import java.awt.*;

public class ToolBarDemo extends JFrame {

    public ToolBarDemo() {

        JButton jButton = new JButton("Pen");
        JLabel jLabel = new JLabel("Line");
        JCheckBox jCheckBox = new JCheckBox("Fill");

        JToolBar jToolBar = new JToolBar("My ToolBar", JToolBar.HORIZONTAL);
        jToolBar.add(jButton);
        jToolBar.add(jLabel);
        jToolBar.add(jCheckBox);

        setLayout(new BorderLayout());

        add(BorderLayout.NORTH, jToolBar);

        setVisible(true);
        setTitle("ToolBar Layout");
        setSize(500, 500);
        setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {
        new ToolBarDemo();
    }
}
