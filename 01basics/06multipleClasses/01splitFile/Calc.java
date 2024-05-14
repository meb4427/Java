public class Calc {
    public static void main(String[] args) {
        int a = 10; int b = 20;
        int total = CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        System.out.println("足すと" + total + "，引くと" + delta);
        // こちらのエラーは，
        // "javac Calc.java"
        //  の実行後，問題なく出力できたので，無視して良いものと考えています。
    }
}
