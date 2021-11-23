/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui;
import javax.swing.*;

public class ConfirmDialogBoxDemo {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit?");
        System.out.println(choice);
    }
}
