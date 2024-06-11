public class Thief extends Character {
    public void run() {
        System.out.println(this.name + "はサササッと逃げた！");
    }

    public void attack() {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵は５ポイントのダメージ");
    }

    public Thief(String n, int h) {
        this.name = n;
        this.hp = h;
    }

    public Thief() {
        this.name = "盗賊";
        this.hp = 40;
    }
}
