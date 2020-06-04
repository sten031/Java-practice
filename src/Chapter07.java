public class Chapter07 {
    public static void main(String[] args) {
        int lunchMoney = 300;
        if (lunchMoney >= 800) {
            System.out.println("チャーシューメンが食べれます");
        } else if (lunchMoney > 600) {
            System.out.println("ラーメンが食べれます");
        } else {
            System.out.println("どのラーメンも食べれません");
        }
    }
}