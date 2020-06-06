package classMethod.human;

public class Human03 {
    public String name;
    public int age;
    public String profession;

    public Human03() {
        this.name = "山田";
        this.age = 20;
        this.profession = "プログラマー";
    }

    public String getProfile() {
        // String型の戻り値を返す
        return "年齢は" + this.age + "、職業は" + this.profession;
    }

    public void greet(String friend) {
        if (friend == null) {
            System.out.println("挨拶する友達がわかりません！");
            // friendがnullの場合は、ここで処理を終了
            return;
        }
        System.out.println(friend + "さん、こんちには！");
    }
}