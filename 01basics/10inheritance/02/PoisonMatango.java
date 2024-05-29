public class PoisonMatango extends Matango {
    int poisonPoint = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    @Override
    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonPoint > 0) {
            System.out.println("さらに、毒の胞子をばらまいた！");
            System.out.println(h.name + "に、" + h.hp/5 + "のダメージ");
            h.hp -= h.hp/5;
            this.poisonPoint--;
            System.out.println(h.name + "のHPは、" + h.hp + "になった");
            System.out.println("PoisonMatango" + this.suffix + "は、あと" + this.poisonPoint + "回、胞子をまき散らすぞ！");
        }
    }

}
