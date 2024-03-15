import java.util.*;

public class p03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        long ans = 0;
        long INF = 1000000007;
        if (n <= m) {
            long M = (m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
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
            (n, m) = (m, n);
            long M = (m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
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
        long factorial = (long) Math.factorial(n * m - 2);
        factorial = factorial / (long) Math.factorial(n * m - k) / (long) Math.factorial(k - 2);
        ans = ans * factorial;
        ans = ans % INF;
        System.out.println(ans);
    }
}