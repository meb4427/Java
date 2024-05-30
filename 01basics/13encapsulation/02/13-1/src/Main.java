public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        // Wand wa = new Wand();
        Wizard wi = new Wizard();

        System.out.println(wi.getWand().getName());
        wi.heal(h);
    }
}
