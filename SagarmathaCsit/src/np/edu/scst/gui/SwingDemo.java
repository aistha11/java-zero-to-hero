/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.gui;

import java.awt.Color;
import javax.swing.*;
import javax.swing.tree.*;

public class SwingDemo extends JFrame {

    public SwingDemo() {

        // JPanel
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.GRAY);

        // UI FOR LOGIN EXAMPLE
        // JLabel
        JLabel username = new JLabel("Name? ");
        jPanel.add(username);
        // JTextField
        JTextField jTextField = new JTextField("Enter username", 11);
        jPanel.add(jTextField);
        JLabel password = new JLabel("Password? ");
        jPanel.add(password);
        // JPassword Field
        JPasswordField jPasswordField = new JPasswordField(8);
        jPanel.add(jPasswordField);
        // JButton
        JButton login = new JButton("Login");
        JButton jButton1 = new JButton("News");
        JButton jButton2 = new JButton("Shop");
        JButton jButton3 = new JButton("Venue");
        
        jButton1.setToolTipText("View all news");
        
        jPanel.add(login);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);

        // JCheckBox
        JCheckBox isSportPerson = new JCheckBox("Are you a sport Person?");
        jPanel.add(isSportPerson);

        // JRadioButton
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        gender.add(other);

        jPanel.add(male);
        jPanel.add(female);
        jPanel.add(other);

        // JComboBox
        String[] sportsCategories = {"Football", "Basketball", "Cricket", "Chess"};
        JComboBox sportsCat = new JComboBox(sportsCategories);
        jPanel.add(sportsCat);

        // JList
        String[] leagueList = {"PPL", "UCL", "NBA", "T-20"};
        JList leagues = new JList(leagueList);
        jPanel.add(leagues);
        
        // JTextArea
        JTextArea desc = new JTextArea(10,5);
        //jPanel.add(desc);
        
        //JScrollPane
        JScrollPane jScrollPane = new JScrollPane(desc,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        jPanel.add(jScrollPane);
        
        // JTable
        String[] header = {"Name","Roll No","Class"};
        String[][] tbContent = {
            {"Ram","10","7"},
            {"Ram","10","7"},
            {"Ram","10","7"},
            {"Ram","10","7"},
        };
        JTable jTable = new JTable(tbContent,header);
        JScrollPane jScrollPaneTable = new JScrollPane(jTable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jPanel.add(jScrollPaneTable);
        //jPanel.add(jTable); // This doesnt work as header is not displayed
        
        // JTree
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("MenuBar");
        DefaultMutableTreeNode menuNode = new DefaultMutableTreeNode("Menu");
        DefaultMutableTreeNode menuItemNode = new DefaultMutableTreeNode("Menu Item");
        DefaultMutableTreeNode menu2Node = new DefaultMutableTreeNode("Menu 2");
        DefaultMutableTreeNode menuItem2Node = new DefaultMutableTreeNode("Menu Item 2");
        
        menu2Node.add(menuItem2Node);
        
        menuNode.add(menuItemNode);
        menuNode.add(menu2Node);
        
        rootNode.add(menuNode);
        
        JTree jtree = new JTree(rootNode);
        jPanel.add(jtree);
        
        // JSlider
        JSlider range = new JSlider(0,0,100,77);
        jPanel.add(range);
                
        add(jPanel);
        setTitle("E-Sports");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Can use 2 as int

    }

    public static void main(String[] args) {
        new SwingDemo();

    }
}
