public class Matango {
    int hp = 50;
    final int LEVEL = 10;
    char suffix;

    public void attack(Hero h) {
        System.out.println("キノコ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }

    public Matango(char suffix) {
        this.suffix = suffix;
    }
}
