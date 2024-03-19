import java.util.Scanner;

public class p03039 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int ans = 0;
        int INF = 1000000007;
        if (n <= m) {
            int M = -((m - 1) * m * (2 * m - 1)) / 3 + m * m * (m - 1);
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n + 1; i++) {
                for (int j = i; j <= n + 1; j++) {
                    if (i == j) {
                        ans = ans + Ms;
                    } else {
                        int d = j - i;
                        ans = ans + d * m * m + M;
                    }
                    ans = ans % INF;
                }
            }
        } else {
            (n, m) = (m, n);
            int M = -((m - 1) * m * (2 * m - 1)) / 3 + m * m * (m - 1);
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n + 1; i++) {
                for (int j = i; j <= n + 1; j++) {
                    if (i == j) {
                        ans = ans + Ms;
                    } else {
                        int d = j - i;
                        ans = ans + d * m * m + M;
                    }
                    ans = ans % INF;
                }
            }
        }

        int factorial = 1;
        for (int i = 1; i <= n * m - 2; i++) {
            factorial = (factorial * i) % INF;
        }
        for (int i = 1; i <= n * m - k; i++) {
            factorial = (factorial * i) % INF;
        }
        for (int i = 1; i <= k - 2; i++) {
            factorial = (factorial * i) % INF;
        }
        ans = (factorial * ans) % INF;

        System.out.println(ans);
    }
}