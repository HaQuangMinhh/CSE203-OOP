package test;

import java.awt.Point;
import javax.swing.JFrame;

public class launchPage extends JFrame{
    private signUp signUp1 = new signUp();
    public launchPage() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(new Point(200, 200));
        this.add(signUp1);
        this.pack();
    }
}
