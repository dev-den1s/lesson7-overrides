package hillel.lesson8Interface.practise.interfaces;

import hillel.lesson8Interface.practise.interfaces.IGrowable;

public class Groot implements IGrowable {
    @Override
    public void grow() {
        System.out.println("I'm Groot and i'm grow");
    }
}
