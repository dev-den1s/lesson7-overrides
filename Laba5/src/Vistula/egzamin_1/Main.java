package Vistula.egzamin_1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AtlasPanstw panstwa = new AtlasPanstw();
        Scanner sc = new Scanner(System.in);
        panstwa.put("Polska", new OpisPanstwa("Warszawa", "Europa"));
        panstwa.put("Ukraina", new OpisPanstwa("Kyiv", "Europa"));
        panstwa.put("Białoruś", new OpisPanstwa("Minsk", "Europa"));
        panstwa.put("Japan", new OpisPanstwa("Tokyo", "Azja"));


        //zanlezenie panstwa
        System.out.println("Zanjdz panstwo po stolice : ");
        String stolica = sc.nextLine();
        String panstwo = panstwa.znajdzPanstwoPoStolice(stolica);

        if (panstwo == null)
            System.out.println("Nie znaleziono panstwa");
        else
            System.out.println("Panstwo -> " + panstwo + " ;");

        //Zadanie z kontynentami
        System.out.println("Zanjdz zbiór panstw z jednego kontynentu : ");
        String kontynent = sc.nextLine();
        HashSet<String> zbiorZKontynetu = panstwa.znajdzZbiórPanstwZKontynentu(kontynent);

        if (zbiorZKontynetu.isEmpty())
            System.out.println("Nie znaleziono panstwa");
        else
            System.out.println("Zbiór panstw z jednego kontynentu -> " + zbiorZKontynetu + " ;");


    }


}
