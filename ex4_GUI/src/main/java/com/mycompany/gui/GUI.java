/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author copbu
 */
public class GUI {

    public static void main(String[] args) {
       JFrame frame = new JFrame("List: ");
       frame.setLocation(100,200);
       frame.setSize(700,500);
       JLabel lblname = new JLabel("Name: ");
       JTextField txtName = new JTextField("Duy_Khang");
       JButton btnEx = new JButton("Submit");
       btnEx.addActionListener((e)->{
           System.out.println("TEST");
           
       });
       frame.setLayout(new FlowLayout());
       frame.add(lblname);
       frame.add(txtName);
       frame.add(btnEx);
       //frame.pack();
       frame.setVisible(true);
    }
}
