import java.util.Scanner;

public class p03039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        long INF = (long)Math.pow(10, 9) + 7;
        long M, Ms;
        if (n <= m) {
            M = -(m - 1) * m * (2 * m - 1) / 6 + m * m * (m - 1) / 2;
            Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
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
            int temp = n;
            n = m;
            m = temp;
            M = -(m - 1) * m * (2 * m - 1) / 6 + m * m * (m - 1) / 2;
            Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
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
        long factorialNM = factorial(n * m);
        long factorialK = factorial(k);
        long factorialKMinus2 = factorial(k - 2);
        ans = (factorialNM / (factorialK * factorialKMinus2)) * ans % INF;
        System.out.println(ans);
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
            result %= (long)Math.pow(10, 9) + 7;
        }
        return result;
    }
}