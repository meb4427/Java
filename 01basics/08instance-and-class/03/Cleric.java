import java.util.Random;

public class Cleric {
    String name;
    int hp;
    final int MAX_HP = 50;
    int mp;
    final int MAX_MP = 100;

    public void selfAid() {
        this.mp -= 5;
        this.hp = MAX_HP;
        System.out.println(this.name + "のHPが" + this.hp + "になった！");
    }

    public void pray(int sec) {
        Random rand = new Random();
        int recoverMp = rand.nextInt(3) + sec;
        int actualRecoverMp = Math.min(recoverMp, this.MAX_MP - this.mp);
        this.mp += actualRecoverMp;
        System.out.println(this.name + "のMPが" + this.mp + "になった！");
    }
}
