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
        sc.close();

        // 主処理
        int result = 0;
        int count = 0;
        int max = Math.min(a, b);
System.out.println("[INST]16;max;Math.min(a, b);"+max);
        for (int i = max; 0 < i; i--) {
            if (a % i == 0 && b % i == 0) {
                count++;
                if (count == k) {
                    result = i;
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
