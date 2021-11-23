/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class SwingDemo2 extends JFrame{
    SwingDemo2(){
        
        JMenuBar menu = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");
        JMenu saveAsMenu = new JMenu("Save As");
        JMenu helpMenu = new JMenu("Help");
        
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem pdfItem = new JMenuItem("pdf");
        JMenuItem pngItem = new JMenuItem("png");
        
        helpMenu.setEnabled(false);
        
        saveAsMenu.add(pdfItem);
        saveAsMenu.add(pngItem);
        
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsMenu);
        
        menu.add(fileMenu);
        menu.add(viewMenu);
        menu.add(helpMenu);
        
        fileMenu.setMnemonic('f');
        viewMenu.setMnemonic('v');
        helpMenu.setMnemonic('h');

        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
        
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.red);
        
        
        
        setLayout(new FlowLayout());
        
        add(jPanel);
        add(menu);
        
        
        setTitle("Home");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SwingDemo2();
    }
}
