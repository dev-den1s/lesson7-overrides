package Vistula.JavaSwing;

public class CounterModel {
    private int value;

    public CounterModel() {
        this.value = value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void reset() {
        value = 0;
    }

    public int getValue(){
        return this.value;
    }
}
