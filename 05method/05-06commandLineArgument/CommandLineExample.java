public class CommandLineExample {
    public static void main(String[] args) {
        // コマンドライン引数が提供されているか確認
        if (args.length > 0) {
            System.out.println("コマンドライン引数が指定されました：");

            // 引数を一つずつ表示
            for (int i = 0; i < args.length; i++) {
                System.out.println((i + 1) + "番目の引数: " + args[i]);
            }
        } else {
            System.out.println("コマンドライン引数は指定されていません。");
        }
    }
}
