package hillel.lesson7HashCode;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Human denis = new Human("Denis", 20);
        Human yurii = new Human("Yurii", 20);
        Human seryi = new Human("Sergei", 20);

        if (denis.hashCode() == seryi.hashCode())
            System.out.println("Sergei i Denis have the same hashcode " +
                    denis.hashCode() + " = " + seryi.hashCode());
        if (denis.hashCode() == denis.hashCode())
            System.out.println("Denis i Denis have the same hashcode" +
                    denis.hashCode() + " = " + denis.hashCode());


    }

}
