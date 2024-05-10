public class Main {
    public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i * i;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = makeArray(6);
        for (int element : array) {
            System.out.println(element);
        }
    }
}