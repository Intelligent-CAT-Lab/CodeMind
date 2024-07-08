import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();        int a = Integer.parseInt(newVariable_0);
var newVariable_1 = sc.next();        int b = Integer.parseInt(newVariable_1);
var newVariable_2 = sc.next();        int k = Integer.parseInt(newVariable_2);
        sc.close();

        // 主処理
        int result = 0;
        int count = 0;
        int max = Math.min(a, b);
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
