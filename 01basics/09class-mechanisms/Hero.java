public class Hero {
    String name;
    int hp;
    Sword sword;

    public void attack() {
        System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
        System.out.println("敵に" + this.sword.damage + "ポイントのダメージをあたえた！");
    }

    public Hero(String name) {
        this.name = name;
        this.hp = 1000;
    }

    public Hero() {
        this("ダミー");
    }
}
