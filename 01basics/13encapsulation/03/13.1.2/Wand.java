public class Wand {
    private String name;
    private double power;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        this.name = name;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("杖の魔力が異常です。処理を中断します。");
        }
        this.power = power;
    }

    public Wand() {
        this.name = "魔法の杖";
        this.power = 10.0;
    }
}
