package curriculum_A;

public class Qes1_13 {
    public static void main(String[] args) {
        // 変数の宣言と初期化
        byte byteValue = 10;
        short shortValue = 100;
        int intValue = 1000;
        long longValue = 10000L;
        float floatValue = 9.5F;
        double doubleValue = 10.5;
        char charValue = 'a';
        String stringValue = "ハロー";
        boolean booleanValue = true;
        
        // 各出力を計算して表示
        // 1. 11110 11110
        int sum = byteValue + shortValue + intValue + (int)longValue;
        System.out.println(sum + "\t" + sum);
        
        // 2. 20 20
        int byteShortSum = byteValue + shortValue;
        System.out.println(byteShortSum + "\t" + byteShortSum);
        
        // 3. a ハロー true
        System.out.println(charValue + " " + stringValue + " " + booleanValue);
        
        // 4. 11130 11130 数字を全て足す
        int allSum = byteValue + shortValue + intValue + (int)longValue;
        System.out.println(allSum + "\t" + allSum);
        
        // 5. 10000000000 10000000000 小数点以外の数字を全てかける
        long product = (long)byteValue * shortValue * intValue * longValue;
        System.out.println(product + "\t" + product);
        
        // 6. 0.105 0.105 10.5割る100をする
        float division = (float)doubleValue / 100;
        System.out.println(division + "\t" + division);
        
        // 7. -90 -90 10引く100をする
        int subtraction = 10 - shortValue;
        System.out.println(subtraction + "\t" + subtraction);

        // 空行を表示
        System.out.println();
        
        // 「ハローJAVA43」を表示
        String num = "20";
        int num1 = 23;
        int numAsInt = Integer.parseInt(num);
        int result = numAsInt + num1;
        System.out.println("ハローJAVA" + result);

        // 空行を表示
        System.out.println();
        
        // 人の情報を変数に格納
        String name = "山田太郎";
        int age = 18;
        double height = 170.5; // cm
        double weight = 62.2;  // kg
        String favoriteFood = "寿司";
        
        // フォーマットに従って出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        // BMIの計算
        double heightInMeters = height / 100; // 身長をメートルに変換
        double bmi = weight / (heightInMeters * heightInMeters); // BMI計算

        // BMIを表示
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        // 空行を表示
        System.out.println();
        
        // 再代入
        name = "鈴木一郎";
        age = 24;
        height = 168.5; // cm
        weight = 64.2;  // kg
        favoriteFood = "オムライス";
        
        // フォーマットに従って再度出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        // BMIの再計算
        heightInMeters = height / 100; // 身長をメートルに変換
        bmi = weight / (heightInMeters * heightInMeters); // BMI計算

        // BMIを表示
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です"); // BMIを小数点1位で表示

        // 空行を表示
        System.out.println();
        
        // 和算による再代入
        age = age + 24; // 年齢を再代入（24歳 + 24歳）
        height = height + 168.5; // 身長を再代入（168.5cm + 168.5cm）
        weight = weight + 64.2; // 体重を再代入（64.2kg + 64.2kg）
        
        // BMIの再計算
        heightInMeters = height / 100; // 身長をメートルに変換
        bmi = weight / (heightInMeters * heightInMeters); // BMI計算

        // フォーマットに従って再度出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です"); // BMIを小数点2位で表示

        // 空行を表示
        System.out.println();
        
        // 年齢が25歳以上ならtrueを出力
        System.out.println(age >= 25);

        // 空行を表示
        System.out.println();
        
        // 年齢・身長・体重を文字列型に変換して繋げて出力
        String ageStr = Integer.toString(24);
        String heightStr = Double.toString(168.5);
        String weightStr = Double.toString(64.2);
        
        System.out.println(ageStr + heightStr + weightStr);

        // 空行を表示
        System.out.println();
        
        // 年齢・身長を整数型に変換して出力
        int ageInt = Integer.parseInt(ageStr);
        int heightInt = (int) Double.parseDouble(heightStr);

        System.out.println(ageInt + " " + heightInt);

        // 空行を表示
        System.out.println();

        // 年齢が25もしくは身長が160以上ならtrueを出力
        System.out.println(ageInt >= 25 || heightInt >= 160);
    }
}
