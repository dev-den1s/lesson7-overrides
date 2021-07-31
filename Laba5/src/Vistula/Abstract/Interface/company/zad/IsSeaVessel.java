package Vistula.Abstract.Interface.company.zad;

public interface IsSeaVessel extends Vehicle{
    static final boolean isSeaVessel = true;
    public int getDisplacement();
    public void setDisplacement(int displacement);
    public void launch();
}
