package Vistula.generics.zadanie1;

public class Main {
    public static void main(String[] args) {
        Main r = new Main();
        r.run();
    }

    public void run() {
        Trojka<String, String, Integer>[] europa = new Trojka[3];
        europa[0] = new Trojka<>("Polska", "Warszawa", 38);
        europa[1] = new Trojka<>("Ukraina", "Charków", 88);
        europa[2] = new Trojka<>("Turcja", "Stambul", 77);
        for (Trojka<String, String, Integer> t :
                europa) {
            System.out.println(t.toString());
        }
    }

}
