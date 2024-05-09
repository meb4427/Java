package 05-08task02;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(
            email("依頼", "aaa@example.com", "ご確認をお願いいたします")
        );
    }

    public static String email(String title, String address, String text) {
        String str = address + "に，以下のメールを送信しました。\n"
                                + "件名:" + title + "\n"
                                + "本文:" + text;
        // return str;
    }
}