package curriculum_A;

public class Qes1_13 {
    public static void main(String[] args) {
        // 1. ローカル変数の宣言
        byte byteVar;
        short shortVar;
        int intVar;
        long longVar;
        float floatValue; // floatValue を使う
        double doubleVar;
        char charVar;
        String stringVar;
        boolean booleanVar;
        
        // 2. 各変数の初期化
        byteVar = 0;
        shortVar = 0;
        intVar = 0;
        longVar = 0;
        floatValue = 0.0f;
        doubleVar = 0.0;
        charVar = '\u0000';
        stringVar = "";
        booleanVar = false;
        
        // 3. 各変数に指定された値を代入
        byteVar = 10;
        shortVar = 100;
        intVar = 1000;
        longVar = 10000;
        floatValue = 9.5f; // floatValue に代入
        doubleVar = 10.5;
        charVar = 'a';
        stringVar = "ハロー";
        booleanVar = true;
        
        // 4. コンソール出力
        // 数値の合計を計算して出力
        int sum = byteVar + shortVar + intVar + (int) longVar;
        System.out.println(sum + "\t" + sum);

        // 数値の積を計算して出力
        long product = byteVar * shortVar * intVar * (long) longVar;
        System.out.println(product + "\t" + product);

        // 浮動小数点の計算をして出力
        double division = doubleVar / 100;
        System.out.println(division + "\t" + division);

        // 引き算の結果を出力
        int subtraction = 10 - shortVar;
        System.out.println(subtraction + "\t" + subtraction);

        System.out.println(); // 空行で区切り

        // 5. 文字列連結の修正
        String num = "20";
        int num1 = 23;
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));

        System.out.println(); // 空行で区切り

        // 6. 自己紹介の変数宣言と出力
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        System.out.println(); // 空行で区切り

        // 7. BMIの計算と出力
        double bmi = weight / (height * height / 10000);
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        System.out.println(); // 空行で区切り

        // 8. 変数の再代入とコンソール出力
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";

        bmi = weight / (height * height / 10000);

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        System.out.println(); // 空行で区切り

        // 9. 和算での再代入とコンソール出力
        age += age; // 24 + 24
        height += height; // 168.5 + 168.5
        weight += weight; // 64.2 + 64.2

        // age を元の24に戻す
        age = 24;

        bmi = weight / (height * height / 10000);

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");

        System.out.println(); // 空行で区切り

        // 10. 年齢が25歳以上ならtrueを出力（if文を使わずに）
        System.out.println(age >= 25);

        System.out.println(); // 空行で区切り

        // 11. 数値を文字列に変換して繋げる
        String ageStr = String.valueOf(age);
        String heightStr = String.valueOf(height);
        String weightStr = String.valueOf(weight);

        System.out.println(ageStr + heightStr + weightStr);

        System.out.println(); // 空行で区切り

        // 12. 文字列型を整数型に変換して出力
        int ageInt = Integer.parseInt(ageStr);
        int heightInt = Integer.parseInt(heightStr.split("\\.")[0]); // 小数点以下を無視
        System.out.println(ageInt + " " + heightInt);

        System.out.println(); // 空行で区切り

        // 13. 変換後の数値で条件判定（if文を使わずに）
        System.out.println(ageInt >= 25 || heightInt >= 160);
    }
}
