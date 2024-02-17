import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        int len = s.length();
        int countRed = len - s.replace("0", "").length();
        int countBlue = len - s.replace("1", "").length();
        int result = Math.min(countRed, countBlue) * 2;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
