public class Main {
    public static void main(String[] args) {
        Character[] c = new Character[5];
        c[0] = new Hero("クラウド", 150);
        c[1] = new Hero("バレット", 255);
        c[2] = new Thief("ジダン", 80);
        c[3] = new Wizard("ユウナ", 65);
        c[4] = new Wizard("ルールー", 75);

        for (Character ch : c) {
            ch.hp += 50;
            System.out.println(ch.name + "のHPが" + ch.hp + "になった！");
        }
    }    
}
