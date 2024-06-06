public class Wizard extends Character {
    public void run() {
        System.out.println(this.name + "はテレポートした！");
    }

    public void attack() {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵は３ポイントのダメージ");
    }

    public Wizard(String n, int h) {
        this.name = n;
        this.hp = h;
    }

    public Wizard() {
        this.name = "魔導士";
        this.hp = 20;
    }
}
