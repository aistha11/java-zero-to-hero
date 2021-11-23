/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui.layouts;
import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo extends JFrame{

    CardLayoutDemo() {
        
        JLabel username = new JLabel("Username: ");
        JLabel password = new JLabel("Password: ");
        
        username.setBounds(10,10,50,20);
        username.setBounds(10,30,50,40);
        
        add(username);
        add(password);
        
        setVisible(true);
        setTitle("Card Layout");
        setSize(500, 500);
        setDefaultCloseOperation(2);
    }
    
    
    
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
