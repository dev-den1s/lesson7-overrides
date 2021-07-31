package Vistula.Abstract.Interface.company.zad;

public class Frigate implements IsSeaVessel{
    private String name;
    private int displacement;
    private int maxPassengers;
    private int maxSpeed;

    public Frigate(String name, int displacement, int maxPassengers, int maxSpeed) {
        this.name = name;
        this.displacement = displacement;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getDisplacement() {
        return this.displacement;
    }
    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Poplyli");
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
