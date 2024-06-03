public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        System.out.println(h1.name);
        System.out.println(h1.hp);

        Hero h2 = new Hero();
        System.out.println(h2.name);
        System.out.println(h2.hp);

        Thief t = new Thief("高田");
        System.out.println(t.name);
        System.out.println(t.hp);
        System.out.println(t.mp);
    }
}
