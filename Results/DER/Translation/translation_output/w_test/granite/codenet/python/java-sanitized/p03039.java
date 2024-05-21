import java.util.*;

public class p03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        int INF = 100000007;
        if (n <= m) {
            int M = -(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1);
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = (ans + Ms) % INF;
                    } else {
                        int d = j - i;
                        ans = (ans + d * m * m + M) % INF;
                    }
                }
            }
        } else {
            int M = -(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1);
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = (ans + Ms) % INF;
                    } else {
                        int d = j - i;
                        ans = (ans + d * m * m + M) % INF;
                    }
                }
            }
        }
        ans = (int) ((long) ans * Math.pow(Math.factorial(n * m - 2), INF - 2) % INF);
        System.out.println(ans);
    }
}