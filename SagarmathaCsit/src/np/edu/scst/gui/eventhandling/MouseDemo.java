/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui.eventhandling;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class MouseDemo extends JFrame{
    MouseDemo(){
        
        JButton jButton = new JButton("Click Me");
        
        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited");
            }
        });
        
        add(jButton);
        
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(700, 500);
        setTitle("Calculator");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new MouseDemo();
    }
}
