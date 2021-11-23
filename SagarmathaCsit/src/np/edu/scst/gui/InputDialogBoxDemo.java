/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui;
import javax.swing.*;

public class InputDialogBoxDemo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter name: ");
        System.out.println(name);
    }
}
