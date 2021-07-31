package Vistula.egzamin_1;

import java.util.*;

public class AtlasPanstw extends HashMap<String, OpisPanstwa> {

    public String znajdzPanstwoPoStolice(String stolica) {
        for (String key :
                keySet()) {
            if (get(key).getStolica().compareTo(stolica) == 0)
                return key;
        }
        return null;
    }

    public HashSet<String> znajdzZbiórPanstwZKontynentu(String kontynent) {
        HashSet<String> zbior = new HashSet<>();
        for (String key :
                keySet()) {
            if (get(key).getKontynent().compareTo(kontynent) == 0)
                zbior.add(key);
        }
        return zbior;
    }


}
