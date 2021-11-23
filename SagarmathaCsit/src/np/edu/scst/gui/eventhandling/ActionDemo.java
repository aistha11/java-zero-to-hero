/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui.eventhandling;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class ActionDemo extends JFrame implements ActionListener{
    ActionDemo(){
        
        JButton jButton = new JButton("Click Me");
        JButton jButton1 = new JButton("Click Me One");
        
        jButton.addActionListener(this);
        jButton1.addActionListener(this);
        
        add(jButton);
        add(jButton1);
        
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(1000, 500);
        setTitle("Action Demo");
        setDefaultCloseOperation(2);
    }
    
    public static void main(String[] args) {
        new ActionDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was Clicked");
    }
}
