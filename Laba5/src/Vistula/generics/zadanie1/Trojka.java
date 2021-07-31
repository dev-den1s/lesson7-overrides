package Vistula.generics.zadanie1;

public class Trojka<T, B, D> {
    private T pierwsze;
    private B drugie;
    private D trzecie;

    public Trojka(T pierwsze, B drugie, D trzecie) {
        this.pierwsze = pierwsze;
        this.drugie = drugie;
        this.trzecie = trzecie;
    }

    @Override
    public String toString() {
        return "Trojka{" +
                "kraj=" + pierwsze +
                ", miasto=" + drugie +
                ", numer=" + trzecie +
                '}';
    }
}
