import java.util.*;
import java.math.*;
public class p03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        long INF = 1000000007;
        if (n <= m) {
            long M = -(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1);
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = ans + Ms;
                    } else {
                        long d = j - i;
                        ans = ans + d * m * m + M;
                    }
                    ans = ans % INF;
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;
            long M = -(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1);
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = ans + Ms;
                    } else {
                        long d = j - i;
                        ans = ans + d * m * m + M;
                    }
                    ans = ans % INF;
                }
            }
        }
        BigInteger ans1 = BigInteger.valueOf(ans);
        BigInteger n1 = BigInteger.valueOf(n * m - 2);
        BigInteger k1 = BigInteger.valueOf(k);
        BigInteger n2 = BigInteger.valueOf(n * m - k);
        BigInteger k2 = BigInteger.valueOf(k - 2);
        BigInteger ans2 = n