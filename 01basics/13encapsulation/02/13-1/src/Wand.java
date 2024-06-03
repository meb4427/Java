public class Wand {
    private String name;
    private double power;

    public String getName() {
        return this.name;
    }

    public void setName(String s) {
        if (s == null || s.length() < 3) {
            throw new IllegalArgumentException("名前が短過ぎます。3文字以上で設定してください。");
        }
        this.name = s;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double p) {
        if (p > 100 || p < 0.5) {
            throw new IllegalArgumentException("力が不適切です。0.5以上かつ100以下の小数で設定してください。");
        }
        this.power = p;
    }

    public Wand(String n, double defaultPower) {
        if (defaultPower < 0.5 || 100 < defaultPower) {
            throw new IllegalArgumentException("力が不適切です。0.5以上かつ100以下の小数で設定してください。");
        }
        this.name = n;
        this.power = defaultPower;
    }

    public Wand() {
        this.name = "つえー";
        this.power = 20;
    }
}
