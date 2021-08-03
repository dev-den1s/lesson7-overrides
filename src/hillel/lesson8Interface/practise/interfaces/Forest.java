package hillel.lesson8Interface.practise.interfaces;

import hillel.lesson8Interface.practise.interfaces.IGrowable;

public class Forest implements IGrowable {
    private IGrowable[] growables;

    public Forest(IGrowable[] growables) {
        this.growables = growables;
    }

    @Override
    public void grow() {
        for (IGrowable growable :
                this.growables) {
            growable.grow();
        }
    }
}
