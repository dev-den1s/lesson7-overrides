package Vistula.Abstract.Interface.company.zadanie1;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog dog){
        System.out.println("Woof woof");
    }
}
