public class Main {
    public static void main(String[] args) {
        Hero.setRandomMoney();
        System.out.println("クラス呼び出し:" + Hero.money);
        Hero h1 = new Hero();
        System.out.println("メソッド呼び出し:" + h1.money);
    }
}
