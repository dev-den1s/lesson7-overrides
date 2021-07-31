package Vistula.egzamin_2;

import java.util.Random;

public abstract class Hero {
    String name;
    int strength;
    int health;
    static String names[] = {"Denis", "Vadym", "Ivan", "Sergey", "Yura"};

    public abstract void Atack(Hero h);

    public Hero(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }
    public abstract String getClassName();

    public static Hero generateRandomHero() {
        Hero hero;
        Random r = new Random();
        int who = r.nextInt(2);

        if (who == 0) {
            hero = new Knight(names[r.nextInt(5)], (int) ((Math.random() * (8 - 5)) + 5),
                    (int) ((Math.random() * (15 - 10)) + 10));
        } else {
            hero = new Wizard(names[r.nextInt(5)], (int) ((Math.random() * (8 - 5)) + 5),
                    (int) ((Math.random() * (15 - 10)) + 10), (int) ((Math.random() * (6 - 4)) + 4));
        }
        return hero;
    }
}
