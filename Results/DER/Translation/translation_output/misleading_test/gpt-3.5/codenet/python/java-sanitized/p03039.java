import java.util.Scanner;

public class p03039 {
    private static long INF = (long) (1e9 + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        long ans = 0;
        long M, Ms;

        if (n <= m) {
            M = -(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1);
            Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M %= INF;
            Ms %= INF;
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
            M = -(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1);
            Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M %= INF;
            Ms %= INF;
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

        long nCk = factorial(n * m - 2) / (factorial(n * m - k) * factorial(k - 2));
        ans = nCk % INF * ans % INF;
        System.out.println(ans);
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
            result %= INF;
        }
        return result;
    }
}