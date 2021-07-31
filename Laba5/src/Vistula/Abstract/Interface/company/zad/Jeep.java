package Vistula.Abstract.Interface.company.zad;

public class Jeep  implements IsLandVehicle{

    private int numWeels;
    private String name;
    private int maxPassengers;
    private int maxSpeed;

    public Jeep(int numWeels, String name, int maxPassengers, int maxSpeed) {
        this.numWeels = numWeels;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getNumWeels() {
        return 0;
    }
    @Override
    public void setNumWeels(int weels) {
        this.numWeels = weels;
    }

    @Override
    public void drive() {
        System.out.println("Pojechalismy");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    @Override
    public void setMaxPassengers(int passengers) {
        this.maxPassengers = passengers;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }
}
