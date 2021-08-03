package hillel.lesson7HashCode;

import java.util.Objects;

public class Man extends Human {
    private int p_cm;

    public Man(String name, int age, int cm) {
        super(name, age);
        this.p_cm = cm;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Man man = (Man) o;
//        return p_cm == man.p_cm;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.p_cm);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Man man = (Man) o;
        return this.p_cm == man.p_cm;
    }

}
