public class PoisonMatango extends Matango {
    int poisonCount = 5;
    public void poisonAttack(h) {
        if (poisonCount != 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            h.hp -= hp/5;
            poisonCount -= 1;
        } 
    }
}
