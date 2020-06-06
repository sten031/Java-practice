public class Human01 {
    // フィールド（メンバ変数）を宣言
    public String name;
    public int age;

    // 引数なしのコンストラクタ
    public Human01() {
        // 初期化処理：フィールドに初期値を設定
        name = "山田";
        age = 20;
    }

    // 引数ありのコンストラクタ
    public Human01(String name, int age) {
        // 初期化処理：フィールドに初期値を設定
        // 引数の変数をthis（自分自身のインスタンス）のフィールドに代入
        // 「name = name;」とするとインスタンスでなく、引数のnameに代入となるので注意！
        this.name = name;
        this.age = age;
    }
}