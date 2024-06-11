public class Matango {
    int hp;
    char suffix;

    public Matango() {
        this.hp = 30;
        this.suffix = 'A';
    }

    public void attack(Character c) {
        System.out.println("お化けキノコ" + this.suffix + "の攻撃！");
        System.out.println(c.name + "に５ポイントのダメージ！");
        c.hp -= 5;
    }
}
