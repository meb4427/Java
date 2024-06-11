public class Hero{
    String name;
    int hp;
    static int money;
    
    private static final String DEFAULT_NAME = "ミナト";
    private static final int DEFAULT_HP = 100;

    public String toString() {
        return "名前:" + this.name + " / HP:" + this.hp;
    }

    public static void setRandomMoney() {
        Hero.money = (int)(Math.random() * 1000);
    }

    // コンストラクタ
    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Hero(String name) {
        this(name, DEFAULT_HP);
    }

    public Hero(int hp) {
        this(DEFAULT_NAME, hp);
    }

    public Hero() {
        this(DEFAULT_NAME, DEFAULT_HP);
    }
}
