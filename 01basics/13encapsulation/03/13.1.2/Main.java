public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        Wizard w = new Wizard();

        System.out.println((w.getWand().getName()));
        w.getWand();

        w.heal(h);
    }
}    