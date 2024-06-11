public class Main {
    public static void main(String[] args) {
        Cleric c = new Cleric();
        c.name = "修道";
        c.hp = 30;
        c.mp = 80;
        
        c.selfAid();
        c.pray(15);
    }
}