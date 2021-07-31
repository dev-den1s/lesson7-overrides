package Vistula.JavaSwing;

import javax.swing.*;
import java.awt.*;

public class CounterPanel extends JPanel {
    private CounterModel counter;
    private JLabel valueLabel;

    public CounterPanel() {
        this.counter = new CounterModel();

        BorderLayout bordLay = new BorderLayout();
        this.setLayout(bordLay);

        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton resetButton = new JButton("Reset");
        valueLabel = new JLabel("" + this.counter.getValue(), SwingConstants.CENTER);

        this.add(upButton, BorderLayout.WEST);
        this.add(downButton, BorderLayout.EAST);
        this.add(valueLabel, BorderLayout.CENTER);
        this.add(resetButton, BorderLayout.SOUTH);

        CounterListener counterListener = new CounterListener(this);
        upButton.addActionListener(counterListener);
        downButton.addActionListener(counterListener);
        resetButton.addActionListener(counterListener);
    }

    public void increment() {
        counter.increment();
        valueLabel.setText("| " + counter.getValue() + " |");
    }

    public void decrement() {
        counter.decrement();
        valueLabel.setText("| " + counter.getValue() + " |");
    }

    public void reset(){
        counter.reset();
        valueLabel.setText("| " + counter.getValue() + " |");
    }
}
