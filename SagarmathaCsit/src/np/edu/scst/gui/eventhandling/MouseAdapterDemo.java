/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui.eventhandling;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterDemo extends JFrame {
    MouseAdapterDemo(){
        
        JButton jButton = new JButton("Click Me");
        
        jButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        add(jButton);
        
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(700, 500);
        setTitle("Mouse Adapter");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
