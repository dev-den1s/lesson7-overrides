package hillel;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Now i'm trying to understand Git");
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();
        electricCar.vzhuh();
        electricCar.vzhuh();

        System.out.println("hashcode" +
                car.hashCode());
    }

    private double pow(double a, double b) {
        return Math.pow(a, b);
    }

}
