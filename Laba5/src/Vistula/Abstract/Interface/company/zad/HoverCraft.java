package Vistula.Abstract.Interface.company.zad;

public class HoverCraft implements IsSeaVessel, IsLandVehicle {
    private String name;
    private int displacement;
    private int maxPassengers;
    private int maxSpeed;
    private int numWeels;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDisplacement() {
        return this.displacement;
    }
    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    @Override
    public void setMaxPassengers(int passengers) {
        this.maxPassengers = passengers;
    }
    @Override
    public void launch() {
        System.out.println("Poplyli");
    }

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

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }
}
