import java.util.Scanner;

public class p01356 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(solve(n, m, a, b, p, q));
    }

    public static int solve(int n, int m, int a, int b, int p, int q) {
        if (a == 1 && b == 1) {
            if ((p + q) * n <= m) {
                return m - (p + q) * n;
            } else {
                int k = m / (p + q);
                return Math.min(m - k * (p + q), (k + 1) * (p + q) - m);
            }
        } else {
            int ans = m;
            for (int i = Math.min(n - 1, 40); i >= 0; i--) {
                int f = (int) (p * Math.pow(a, i) + q * Math.pow(b, i));
                if (m < f) {
                    ans = Math.min(ans, f - m);
                } else {
                    m -= f;
                }
                ans = Math.min(ans, m);
            }
            return ans;
        }
    }
}