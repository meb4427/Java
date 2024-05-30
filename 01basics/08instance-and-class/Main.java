public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;

        Cleric c = new Cleric();
        c.name = "聖職者";
        c.hp = 25;
        c.mp = 5;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        h.slip();
        c.selfAid();
        c.pray(3);
        h.run();
    }
}