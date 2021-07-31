package Vistula.JavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
    private CounterPanel countPane;

    public CounterListener(CounterPanel panel) {
        this.countPane = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Up")) {
            countPane.increment();
        } else if (actionCommand.equals("Down")) {
            countPane.decrement();
        } else if (actionCommand.equals("Reset")) {
            countPane.reset();
        } else {
            System.out.println("Error: Unexpected ActionCommand ");
        }
    }
}
