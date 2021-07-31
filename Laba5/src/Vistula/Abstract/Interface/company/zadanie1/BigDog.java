package Vistula.Abstract.Interface.company.zadanie1;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woow");
    }

    public void greets(Dog another) {
        if (another instanceof BigDog)
            System.out.println("Woooooooooow");
        else
            System.out.println("Wooow");
    }

    public void greets(BigDog dog) {
        System.out.println("Woooooooow");
    }
}
