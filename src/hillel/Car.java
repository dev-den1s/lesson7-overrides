package hillel;

import java.util.Objects;

public class Car {
    public int doorsCount;

    public Car() {
        this.doorsCount = 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doorsCount == car.doorsCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(doorsCount);
    }

    public void vzhuh() {
        System.out.println("Rrrrrrrrr");
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "doorsCount=" + doorsCount +
//                '}';
//    }
}
