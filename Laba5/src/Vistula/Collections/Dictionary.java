package Vistula.Collections;

import java.util.*;

public class Dictionary extends TreeMap<String, TreeSet<String>> {

    public void put(String word, String meaning) {
        if (!containsKey(word)) {
            TreeSet<String> set = new TreeSet<>();
            set.add(meaning);
            put(word, set);
        } else if (!get(word).contains(meaning))
            get(word).add(meaning);
    }


    public Dictionary opositDictionary() {
        Dictionary engPol = new Dictionary();
        for (String key :
                keySet()) {
            for (String word:
                 get(key)) {
                engPol.put(word,key);
            }
        }
        return engPol;
    }
}
