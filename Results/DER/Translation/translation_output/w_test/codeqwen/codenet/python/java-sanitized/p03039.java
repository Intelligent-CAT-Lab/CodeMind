import java.util.Scanner;

public class p03039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        long INF = (long) Math.pow(10, 9) + 7;
        if (n <= m) {
            long M = (-(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1)) % INF;
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = (ans + Ms) % INF;
                    } else {
                        long d = j - i;
                        ans = (ans + d * m * m + M) % INF;
                    }
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;
            long M = (-(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1)) % INF;
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = (ans + Ms) % INF;
                    } else {
                        long d = j - i;