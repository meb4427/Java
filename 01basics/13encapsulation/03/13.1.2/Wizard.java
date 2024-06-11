public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MPが不正です。処理を中断します。");
        }
        this.mp = mp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("名前が短すぎます。処理を中断します。");
        }
        this.name = name;
    }

    public Wand getWand() {
        return this.wand;
    }

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public Wizard() {
        this.hp = 50;
        this.mp = 50;
        this.name = "魔法使い";
        this.wand = new Wand();}
}
