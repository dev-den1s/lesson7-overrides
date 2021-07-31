package Vistula.generics.zadanie2;

import java.util.Arrays;

public class Box implements Comparable<Box> {
    private int width;
    private int heigth;
    private int depth;
    private final int volume;

    public Box(int width, int heigth, int depth) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
        this.volume = width * heigth * depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", heigth=" + heigth +
                ", depth=" + depth +
                '}';
    }

    public static Box generateRandomBox() {
        return new Box(myRandom(10, 40), myRandom(10, 40), myRandom(10, 40));
    }

    public static int myRandom(int x, int y) {
        return x + (int) (Math.random() * ((y - x) + 1));
//        (myRandom(10,40))
    }

    @Override
    public int compareTo(Box o) {
        if (this.volume > o.volume)
            return 1;
        else if (this.volume < o.volume)
            return -1;
        else
            return 0;
    }

    static void printMax(Comparable[] arr) {
        Comparable[] tab = new Comparable[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tab[i] = arr[i];
        }
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }

}
