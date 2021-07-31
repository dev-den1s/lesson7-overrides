package Vistula.Abstract.Interface.company.zadanie1;

import Vistula.Abstract.Interface.company.zad.Vehicle;

public class Main {

    public static void main(String[] args) {
        Main main=new Main();
        //main.run1();
        main.run2();
        System.out.println("11111111111111111f");
    }
    public void run2(){
        Vehicle vehicle;
    }
    public void run1(){
        Animal[] a= new Animal[3];
        a[0] = new Cat("Vadik");
        a[1] = new Dog("Yura");
        a[2] = new BigDog("Denis");
        //List<Cat> animals = new List<Cat>();

        BigDog bd = new BigDog("Vania");

        for (Animal an :
                a) {
            an.greets();
            if(an instanceof BigDog)
                ((BigDog)an).greets(bd);
        }
    }
}
