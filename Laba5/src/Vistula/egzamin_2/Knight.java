package Vistula.egzamin_2;

public class Knight extends Hero {

    public Knight(String name, int strength, int health) {
        super(name, strength, health);

    }
    //dodałem by uprosić wyświetlenie na ekran tytułu gracza
    public String getClassName(){
        return "Knight";
    }

    @Override
    public void Atack(Hero h) {
        System.out.println(this.getClassName()+" " + this.name + " takes his sword ...");
        if (this.strength >= h.health) {
            h.health -= strength;
            System.out.println(h.getClassName() +" " + h.name + " został zabity przez " + "Knight " + this.name);
        } else {
            h.health -= strength;
            System.out.println("Knight" + " " +this.name + " caused " + this.strength + " damage " +
                    " to " + h.getClassName() + " " +h.name);
            System.out.println("Zdrowie " + h.getClassName() +" " + h.name + " = " + h.health);
        }
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                '}';
    }
}
