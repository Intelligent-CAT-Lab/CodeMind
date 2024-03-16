import java.util.Scanner;

public class p03039 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        int INF = 1000000007;

        if (n <= m) {
            int M = -((m - 1) * m * (2 * m - 1)) / 3 + m * m * (m - 1) % INF;
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6 % INF;

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        int d = j - i;
                        ans += d * m * m + M;
                    }
                    ans %= INF;
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;

            int M = -((m - 1) * m * (2 * m - 1)) / 3 + m * m * (m - 1) % INF;
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6 % INF;

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        int d = j - i;
                        ans += d * m * m + M;
                    }
                    ans %= INF;
                }
            }
        }

        ans = (int) (Math.factorial(n * m - 2) / (Math.factorial(n * m - k) * Math.factorial(k - 2))) * ans % INF;

        System.out.println(ans);
    }
}