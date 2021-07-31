package Vistula.JavaSwing;

import javax.swing.*;

public class SimpleFrame extends JFrame {
    public SimpleFrame() {
        this.setSize(200, 200);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //makes the frame visible
    public void showIt() {
        this.setVisible(true);
    }

    //makes the frame visible and sets the title text
    public void showIt(String text) {
        this.setTitle(text);
        this.setVisible(true);
    }

    ////makes the frame visible and sets the title text
    //and the position of the window
    public void showIt(String text, int x, int y) {
        this.setLocation(x, y);
        this.setTitle(text);
        this.setVisible(true);
    }

    public void hideIt() {
        this.setVisible(false);
    }
}
