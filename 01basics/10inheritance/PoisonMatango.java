public class PoisonMatango extends Matango {
    int poisonCount = 5;

    public void attack(Hero h) {
        super.attack(h);
        if (poisonCount > 0) {
            System.out.println("さらに，お化けキノコ" + this.suffix + "は毒の胞子をばらまいた！");
            System.out.println(h.name + "は" + h.hp / 5 + "のダメージを受けた！");
            h.hp -= h.hp / 5;
            System.out.println(h.name + "のHPは" + h.hp + "となった！");
            this.poisonCount--;
            System.out.println("お化けキノコ" + this.suffix + "は，あと" + this.poisonCount + "回の胞子攻撃をしてくるぞ！");
        }
    }

    public PoisonMatango(char suffix) {
        super(suffix);
    }
}
