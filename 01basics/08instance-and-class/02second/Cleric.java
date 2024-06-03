import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;
    Random rand = new Random();

    public void selfAid() {
        System.out.println(this.name + "は、セルフエイドを唱えた");
        this.mp -= 5;
        this.hp = MAX_HP;
        System.out.println("HPが最大値まで回復した！");
    }

    public int pray(int sec) {
        System.out.println(this.name + "は、" + sec + "秒間祈った");
        int recover = sec + rand.nextInt(3);
        int actualRecover = Math.min(this.MAX_HP - this.mp, recover);
        this.mp += actualRecover;
        System.out.println("MPが" + actualRecover + "回復した!");
        return actualRecover;
    }
}
