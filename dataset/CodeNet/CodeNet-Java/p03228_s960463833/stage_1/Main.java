import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();        int a = Integer.parseInt(newVariable_0);
var newVariable_1 = sc.next();        int b = Integer.parseInt(newVariable_1);
var newVariable_2 = sc.next();        int k = Integer.parseInt(newVariable_2);

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
