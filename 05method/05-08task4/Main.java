public class Main {
    public static void main(String[] args) {
        System.out.println(calcTriangleArea(10.0, 5.0));
        System.out.println(calcCircleArea(5.0));
    }

    public static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }

    public static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }
}
