/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui.eventhandling;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public class KeyEvents extends JFrame {
    KeyEvents(){
        JTextField jTextField = new JTextField(20);
        jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released");
            }
        });
        add(jTextField);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(700, 500);
        setTitle("Calculator");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new KeyEvents();
    }
}
