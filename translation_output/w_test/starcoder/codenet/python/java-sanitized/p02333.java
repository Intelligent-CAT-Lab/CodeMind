import java.util.*;
import java.math.*;

public class p02333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int modulo = (int) Math.pow(10, 9) + 7;
        int ans = 0;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += (k - i) * Math.pow(k, n) * combination(k, i);
                } else {
                    ans -= (k - i) * Math.pow(k, n) * combination(k, i);
                }
            }
            ans = ans % modulo;
        }
        System.out.println(ans);
    }

    public static int combination(int n, int m) {
        int res = 1;
        for (int i = 0; i < m; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}