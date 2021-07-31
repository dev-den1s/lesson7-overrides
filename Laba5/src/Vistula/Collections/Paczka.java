package Vistula.Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Paczka implements Comparable<Paczka> {
    Double masa;
    Double obijetosc;
    Double cena;
    static HashMap<String, Comparator<Paczka>> paczkaComparators = new HashMap<>();


    static{
        paczkaComparators.put("By Mass", (x, y) -> x.masa.compareTo(y.masa));
        paczkaComparators.put("By Objetosc", (x, y) -> x.obijetosc.compareTo(y.obijetosc));
    }




    public Paczka() {
        this.cena = 5.00;
        this.masa = 5.00;
        this.obijetosc = 5.00;

    }

    public Paczka(double masa, double obijetosc, double cena) {
        this.masa = masa;
        this.obijetosc = obijetosc;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Paczka{" +
                "masa=" + masa +
                ", obijetosc=" + obijetosc +
                ", cena=" + cena +
                '}';
    }

    //@Override
    public int compareTo(Paczka o) {
        return this.masa.compareTo(o.masa);
    }
}
