public class Main {
    public static void main(String[] args) {
        System.out.print(
            introduceOneself("湊大輔", 22, 169.9f, '辰')
            );
    }

    public static String introduceOneself(String name, int age, float height, char zodiac) {
        return "私の名前は" + name + "です。歳は" + age + "歳です。身長は" + height + "cmです。十二支は" + String.valueOf(zodiac) + "です。"; 
    }
}
