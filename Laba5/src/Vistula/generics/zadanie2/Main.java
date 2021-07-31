package Vistula.generics.zadanie2;

import java.util.Random;


public class Main {
    Random r = new Random();

    public static void main(String[] args) {
        Box[] box = new Box[3];
        for (int i = 0; i < 3; i++)
            box[i] = Box.generateRandomBox();
        for (Box b :
                box) {
            System.out.println(b);
        }
        System.out.println("================");

        Box.printMax(box);
        System.out.println("================");
        for (Box b :
                box) {
            System.out.println(b);
        }
    }
}
