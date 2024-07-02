import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]8;s;sc.next();"+s);

        // 主処理
        int len = s.length();
System.out.println("[INST]11;len;s.length();"+len);
        int countRed = len - s.replace("0", "").length();
System.out.println("[INST]12;None;s.replace('0', '').length();"+s.replace("0", "").length());
System.out.println("[INST]12;None;s.replace('0', '');"+s.replace("0", ""));
        int countBlue = len - s.replace("1", "").length();
System.out.println("[INST]13;None;s.replace('1', '').length();"+s.replace("1", "").length());
System.out.println("[INST]13;None;s.replace('1', '');"+s.replace("1", ""));
        int result = Math.min(countRed, countBlue) * 2;
System.out.println("[INST]14;None;Math.min(countRed, countBlue);"+Math.min(countRed, countBlue));

        // 出力
        System.out.println(result);
        sc.close();
    }
}
