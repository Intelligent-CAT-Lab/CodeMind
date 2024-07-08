import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        int len = s.length();
var newVariable_0 = s.replace("0", "").length();var newVariable_1 = s.replace("0", "");        int countRed = len - newVariable_1.length();
var newVariable_2 = s.replace("1", "").length();var newVariable_3 = s.replace("1", "");        int countBlue = len - newVariable_3.length();
var newVariable_4 = Math.min(countRed, countBlue);        int result = newVariable_4 * 2;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
