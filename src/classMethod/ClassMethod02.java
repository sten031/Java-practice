// パッケージがclassMethodと宣言
package classMethod;

// classMethod.human.Human02をインポート
import classMethod.human.Human02;

public class ClassMethod02 {
    public static void main(String[] args) {
        // import文がない場合は、パッケージ名が必要
        // classMethod.human.Human02 yamada = new classMethod.human.Human02();
        Human02 yamada = new Human02();
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        // import文がない場合は、毎回、パッケージ名が必要
        // classMethod.human.Human02 sato = new classMethod.human.Human02("佐藤", 25);
        Human02 sato = new Human02("佐藤", 25);
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }
}