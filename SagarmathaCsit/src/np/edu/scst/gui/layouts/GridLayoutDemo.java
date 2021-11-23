/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui.layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    GridLayoutDemo() {
        JLabel name = new JLabel("Name: ");
        JLabel email = new JLabel("Email: ");
        JLabel password = new JLabel("Password: ");
        JLabel confirmPassword = new JLabel("Confirm Psw: ");

        setLayout(new GridLayout(2,2));

        add(name);
        add(email);
        add(password);
        add(confirmPassword);

        setVisible(true);
        setTitle("Card Layout");
        setSize(500, 500);
        setDefaultCloseOperation(2);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
