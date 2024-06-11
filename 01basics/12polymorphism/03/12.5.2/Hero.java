public class Hero extends Character {
    public void run() {
        System.out.println(this.name + "は撤退した！");
    }

    public void attack() {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵は10ポイントのダメージ");
    }

    public Hero(String n, int h) {
        this.name = n;
        this.hp = h;
    }

    public Hero() {
        this.name = "勇者";
        this.hp = 100;
    }
}
