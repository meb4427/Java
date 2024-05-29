public class Cleric {
    String name;
    int hp;
    final int MAX_HP = 50;
    int mp;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "は，selfAidを唱えた！");
        this.mp -= 5;
        this.hp = MAX_HP;
        System.out.println("HPが最大値まで回復した！");
    }

    public void pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒間，天に祈った！");
        int recover = new java.util.Random().nextInt(3) + sec;

        int actualRecover = Math.min(MAX_MP - mp, recover);
        this.mp += actualRecover;
        System.out.println("MPが" + actualRecover + "回復した！");
    }
}
