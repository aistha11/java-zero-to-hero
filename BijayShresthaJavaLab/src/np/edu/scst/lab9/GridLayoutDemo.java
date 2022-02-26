/*
 * Create any five components of java swing, now using  GridLayout, arrange them in a formation of 2x3 grids inside a JPanel.
 */
package np.edu.scst.lab9;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    GridLayoutDemo() {
        JLabel jLabel1 = new JLabel("First Jlabel");
        JButton jbtn1 = new JButton("JButton 1");
        JLabel jLabel2 = new JLabel("Second Jlabel");
        JButton jbtn2 = new JButton("JButton 2");
        JLabel jLabel3 = new JLabel("Third Jlabel");
        setLayout(new GridLayout(2, 3));
        add(jLabel1);
        add(jbtn1);
        add(jLabel2);
        add(jbtn2);
        add(jLabel3);
        setVisible(true);
        setTitle("GridLayout");
        setSize(300, 200);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
