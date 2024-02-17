import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

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
