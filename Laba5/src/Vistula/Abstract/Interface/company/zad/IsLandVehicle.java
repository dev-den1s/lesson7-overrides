package Vistula.Abstract.Interface.company.zad;

public interface IsLandVehicle extends Vehicle {
    boolean isLandVehicle = true;
    public int getNumWeels();
    public void setNumWeels(int weels);
    public void drive();
}
