import java.util.*;

public class p03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        long ans = 0;
        long INF = 1000000000000L;
        if (n <= m) {
            long M = (m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        long d = j - i;
                        ans += d * m * m + M;
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
                        ans += Ms;
                    } else {
                        long d = j - i;
                        ans += d * m * m + M;
                    }
                    ans = ans % INF;
                }
            }
        }
        long nm = n * m;
        long nmk = n * m - k;
        long kmk = k - 2;
        long ans2 = (factorial(nm - 2) / (factorial(nm - k) * factorial(kmk))) * ans;
        ans2 = ans2 % INF;
        System.out.println(ans2);
    }

    public static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long ans = 1;
        for (long i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}