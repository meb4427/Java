public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        Cleric c = new Cleric();
        c.name = "聖職者";

        h.slip();
        c.selfAid();
        c.pray(2);
        m1.run();
        m2.run();
        h.run();
    }
}
