package hillel.lesson8Interface.practise.interfaces;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Groot groot = new Groot();
        IGrowable igroot = new Groot();
        OakTree oakTree = new OakTree();
        //groot.yes(3);

    }
}
