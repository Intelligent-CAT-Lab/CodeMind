import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]8;s;sc.next();"+s);
        sc.close();

        // 主処理
        String result = s.replace("?", "D");
System.out.println("[INST]12;result;s.replace('?', 'D');"+result);

        // 出力
        System.out.println(result);
    }
}
