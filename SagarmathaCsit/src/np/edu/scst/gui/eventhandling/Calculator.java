/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui.eventhandling;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    
    Calculator(){
        
        JLabel numLabel1 = new JLabel("Num 1");
        JTextField num1  = new JTextField(20);
        JLabel numLabel2 = new JLabel("Num 2");
        JTextField num2  = new JTextField(20);
        
        JButton add = new JButton("Add");
        JLabel result = new JLabel("Result is: ");
        
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1 = num1.getText();
                String n2 = num2.getText();
                int res = Integer.valueOf(n1)+Integer.valueOf(n2);
                result.setText("Result is: "+ res);
            }
        });
        
        
        add(num1);
        add(num2);
        add(add);
        add(result);
        
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(700, 500);
        setTitle("Calculator");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
