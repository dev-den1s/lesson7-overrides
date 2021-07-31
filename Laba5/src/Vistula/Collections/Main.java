package Vistula.Collections;

import java.util.*;

public class Main {
    Random r = new Random();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        //zadanie1();
        //zadanie2();
        //zadanie3();
        zadanie4();
    }

    private void zadanie1() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(list.size() + 1), r.nextInt(11));
        }
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        Set<Integer> set = new HashSet<Integer>();
        set.addAll(list);
        System.out.println(set);
    }

    private void zadanie2() {
        List<Integer> f_list = new ArrayList<>();
        List<Integer> s_list = new ArrayList<>();
        List<Integer> wspolna = new ArrayList<>();
        List<Integer> just_f = new ArrayList<>();
        List<Integer> xor = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            f_list.add(r.nextInt(16));
            s_list.add(r.nextInt(16));
        }
        //
        wspolna.addAll(f_list);
        wspolna.retainAll(s_list);
        System.out.println(wspolna);
        //
        just_f.addAll(f_list);
        just_f.removeAll(s_list);
        System.out.println(just_f);
        //Xor
        List<Integer> helper = new ArrayList<>();
        xor.addAll(f_list);
        xor.addAll(s_list);
        xor.removeAll(wspolna);
        System.out.println(xor);
        //set
        set.addAll(f_list);
        set.addAll(s_list);
    }

    private void zadanie3() {
        List<Paczka> shop = new ArrayList<>();
        shop.add(new Paczka(3.0, 3.0, 3.0));
        shop.add(new Paczka());
        shop.add(new Paczka(1.0, 1.0, 1.0));
        System.out.println(shop);



//        // sort by Comparable
//        shop.sort(null);
//        System.out.println(shop);
        // sort
        shop.sort(Paczka.paczkaComparators.get("By Mass"));
        System.out.println(shop);
//        // sort
//        shop.sort(comparator_byObj);
//        System.out.println(shop);


    }

    private void zadanie4() {
        Dictionary polAng = new Dictionary();
        polAng.put("masakra", "bad");
        polAng.put("masakra", "awful");
        polAng.put("swietnie", "good");
        polAng.put("samochód", "car");
        polAng.put("samochód", "vehicle");

        System.out.println(polAng);
        Dictionary angPol = polAng.opositDictionary();
        System.out.println(angPol);

    }

}
