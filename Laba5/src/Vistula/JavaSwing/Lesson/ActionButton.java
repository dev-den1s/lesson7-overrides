package Vistula.JavaSwing.Lesson;

import javax.swing.*;
import java.awt.*;

public class ActionButton extends JButton {
    private String text;

    public ActionButton(String text) {
        this.setSize(30, 30);
        this.setText(text);
        this.setBackground(Color.blue);
        this.setForeground(Color.red);
        this.setVisible(true);
    }
}
