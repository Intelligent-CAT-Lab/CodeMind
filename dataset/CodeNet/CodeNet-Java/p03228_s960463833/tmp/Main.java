import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
System.out.println("[INST]8;a;Integer.parseInt(sc.next());"+a);
System.out.println("[INST]8;None;sc.next();"+sc.next());
        int b = Integer.parseInt(sc.next());
System.out.println("[INST]9;b;Integer.parseInt(sc.next());"+b);
System.out.println("[INST]9;None;sc.next();"+sc.next());
        int k = Integer.parseInt(sc.next());
System.out.println("[INST]10;k;Integer.parseInt(sc.next());"+k);
System.out.println("[INST]10;None;sc.next();"+sc.next());

        // 主処理
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                if (a % 2 == 1) {
                    a--;
                }
                b += a / 2;
                a /= 2;

            } else {
                if (b % 2 == 1) {
                    b--;
                }
                a += b / 2;
                b /= 2;
            }

        }
        String result = a + " " + b;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
