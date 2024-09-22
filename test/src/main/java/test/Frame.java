package test;

import javax.swing.JFrame;


public class Frame extends JFrame {
    private login login = new login();
    
    public Frame() {
        this.setVisible(false);
        this.setTitle("Hello!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(login);
        this.pack();
    }
}
