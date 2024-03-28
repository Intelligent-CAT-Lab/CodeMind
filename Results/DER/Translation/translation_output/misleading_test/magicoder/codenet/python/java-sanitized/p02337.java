import java.util.*;

public class p02337 {
    static long mod = (long) Math.pow(10, 9) + 7;
    static long[][] star = new long[1001][1001];

    static {
        for (int i = 0; i < 1001; i++) {
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 0;
        }
    }

    static long search(int n, int k) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != 0) {
            return star[n][k] % mod;
        } else {
            star[n][k] = (search(n - 1, k - 1) + k * search(n - 1, k)) % mod;
            return star[n][k];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        for (int i = 0; i <= k; i++) {
            ans += search(n, i);
            ans = ans % mod;
        }
        System.out.println(ans);
    }
}