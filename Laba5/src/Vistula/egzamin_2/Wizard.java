package Vistula.egzamin_2;

public class Wizard extends Hero{
    int mana;

    public Wizard(String name, int strength, int health, int mana) {
        super(name, strength, health);
        this.mana = mana;
    }

    //dodałem by uprosić wyświetlenie na ekran tytułu gracza
    public String getClassName(){
        return "Wizard";
    }

    public void magicAttack(Hero h){
        System.out.println(this.getClassName()+" "  + this.name + " zaczyna się piętrzyć ...");
        if (this.mana >= h.health) {
            h.health -= mana;
            System.out.println(h.getClassName() +" " + h.name + " został zabity przez " + this.getClassName()+" "  + this.name);

        } else {
            h.health -= mana;
            System.out.println(this.getClassName()+" "  + this.name + " caused " + this.mana + " damage" +
                    " to " + h.getClassName() +" " + h.name);
            System.out.println("Zdrowie " + h.getClassName() +" " + h.name + " = " + h.health);
        }
    }
    @Override
    public void Atack(Hero h) {
        System.out.println(this.getClassName()+" "  + this.name + " takes his staff ...");
        if (this.strength >= h.health) {
            h.health -= strength;
            System.out.println(h.getClassName() +" " + h.name + " został zabity przez " + this.getClassName()+" "  + this.name);
        } else {
            h.health -= strength;
            System.out.println(this.getClassName()+" "  + this.name + " caused " + this.strength + " damage" +
                    " to " + h.getClassName() +" " + h.name);
            System.out.println("Zdrowie " + h.getClassName() +" "+ h.name + " = " + h.health);
        }
    }
    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", mana=" + mana +
                '}';
    }
}
