package Vistula.JavaSwing.Lesson;

import javax.swing.*;

public class TextField extends JTextField {
    private String text;
    public TextField(String text) {
        this.text=text;
        this.setSize(70,30);
        this.setText(text);
    }
}
