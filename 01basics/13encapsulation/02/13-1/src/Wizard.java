public class Wizard {
    private String name;
    private int hp;
    private int mp;
    
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
    public int getHp() {
        return this.hp;
    }

    public void setHp(int h) {
        if (h < 0) {
            this.hp = 0;
        } else {
            this.hp = h;
        }
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int m) {
        if (m < 0) {
            throw new IllegalArgumentException("MPが不適切です。0以上の整数で設定してください。");
        }
        this.mp = m;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String s) {
        if (s == null || s.length() < 3) {
            throw new IllegalArgumentException("名前が短過ぎます。3文字以上で設定してください。");
        }
        this.name = s;
    }

    public Wand getWand() {
        return this.wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("装備する杖を設定する必要があります。");
        }
        this.wand = wand;
    }

    public Wizard(Wand defaultWand) {
        if (defaultWand == null) {
            throw new IllegalArgumentException("装備する杖を設定する必要があります。");
        }
    }

    public Wizard() {
        this.hp = 100;
        this.mp = 50;
        this.name = "アサカ";
        this.wand = new Wand("ああああ", 200);
    }
}
