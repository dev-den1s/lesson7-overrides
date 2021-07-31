package Vistula.Lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class TestInterfaceFunc {
    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<>();
        boxes.add(new Box(1, 1));
        boxes.add(new Box(2, 2));
        boxes.add(new Box(3, 3));
        boxes.sort(new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.a * o1.b.compareTo(o2.a * o2.b);
            }
        });
        System.out.println(boxes);

        boxes.sort((x,y)->x.b.compareTo(y.b));
    }
}

class Box {
    Integer a;
    Integer b;

    public Box(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
