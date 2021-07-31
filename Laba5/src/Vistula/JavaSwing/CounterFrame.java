package Vistula.JavaSwing;

import java.awt.*;

public class CounterFrame extends SimpleFrame {
    public CounterFrame() {
        CounterPanel panel = new CounterPanel();
        this.getContentPane().add(panel, BorderLayout.CENTER);
    }

}
