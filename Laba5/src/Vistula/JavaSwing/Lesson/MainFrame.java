package Vistula.JavaSwing.Lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    //JButton button = new JButton("Start!");
    ActionButton button = new ActionButton("Start!");
    JLabel label = new JLabel("This is it!!");
    TextField textField = new TextField("...");

    public MainFrame() throws HeadlessException {
        // interface settings
        this.setSize(400, 400);
        this.setLocation(100, 100);
        this.setTitle("(My first application)");
        //this.setBackground(Color.BLACK);
        //this.setForeground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //layout manager
        setLayout(new GridLayout(3, 1));

        // components
        this.add(button);
        this.add(label);
        this.add(textField);

        //listeners
        // the same that under
//        ActionListener ac = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setText(textField.getText());
//            }
//        };

        //the same that below
        button.addActionListener(e->label.setText(textField.getText()));
    }

    public void showApp() {
        this.setVisible(true);
    }
}
