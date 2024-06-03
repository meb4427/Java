public class Hero {
    private String name;
    private int hp;

    public void bye() {
        System.out.println("勇者は別れを告げた");
    }

    private void die() {
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GAMEOVERです。");
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した！");
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");

        System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
        this.hp -= 2;
        if (this.hp <= 0) {
            this.die();
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String v) {
        if (v == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        } 
        if (v.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        } 
        if (v.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = v;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int h) {
        this.hp = h;
    }

    public Hero() {
        this.name = "ミナト";
        this.hp = 100;
    }
}
