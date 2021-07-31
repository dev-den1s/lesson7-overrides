package Vistula.egzamin_2;

import java.util.Random;

public class TestRPG {
    public static void main(String[] args) {

        Hero hero1 = Hero.generateRandomHero();
        Hero hero2 = Hero.generateRandomHero();
        System.out.println("Informacja o wylosowanych Heroes :");
        System.out.println(hero1 + "\n" + hero2);

        Duel(hero1,hero2);

    }

    public static void Duel(Hero h1, Hero h2) {
        Random r = new Random();
        int who;
        //while (h1.health > 0 || h2.health > 0) - chciałem zrobić taki warunek, ale on mnie nagle nie działa, już ni miałem czasu sprawdzać
        while (true) {
            System.out.println("----------------------------");
            //Pierwszy atakuje h1
            // jezeli h1 jest Wizzard to dzieki "who" losuje
            // 0 - to maggiczna ataka
            // 1 - to zwykła ataka
            // jezeli h1 jest Knight to atakuje zwykle
            if (h1 instanceof Wizard) {
                who = r.nextInt(3);
                if (who == 0)
                    ((Wizard) h1).magicAttack(h2);
                else
                    ((Wizard) h1).Atack(h2);
            } else
                ((Knight) h1).Atack(h2);

            System.out.println();
            //sprawdzenie czy h1 zabił h2
            if(h2.health<=0)
                break;


            // jezeli h2 jest Wizzard to dzieki "who" losuje
            // 0 - to maggiczna ataka
            // 1 - to zwykła ataka
            // jezeli h2 jest Knight to atakuje zwykle
            if (h2 instanceof Wizard) {
                who = r.nextInt(3);
                if (who == 0)
                    ((Wizard) h2).magicAttack(h1);
                else
                    ((Wizard) h2).Atack(h1);
            } else
                ((Knight) h2).Atack(h1);
            if(h1.health<=0)
                break;
        }
    }
}
