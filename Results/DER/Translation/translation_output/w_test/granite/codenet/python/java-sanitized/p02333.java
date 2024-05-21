import java.util.Scanner;

public class p02333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        long mod = 100000007;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += (long) Math.pow(k - i, n) * combination(k, i) % mod;
                } else {
                    ans -= (long) Math.pow(k - i, n) * combination(k, i) % mod;
                }
            }
            ans = (ans % mod + mod) % mod;
        }
        System.out.println(ans);
    }

    public static long combination(int n, int m) {
        if (m > n - m) {
            m = n - m;
        }
        long up = 1;
        long down = 1;
        for (int i = 0; i < m; i++) {
            up = up * (n - i) % 100000007;
            down = down * (i + 1) % 100000007;
        }
        return up / down;
    }
}