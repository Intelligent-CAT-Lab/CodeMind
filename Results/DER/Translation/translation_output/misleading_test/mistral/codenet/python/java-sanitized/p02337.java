import java.util.*;

public class p02337 {
    static int mod = 1000000007;
    static int[][] star = new int[1001][1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;

        for (int i = 1; i <= k; i++) {
            ans += search(n, i);
            ans = ans % mod;
        }

        System.out.println(ans);
    }

    public static int search(int n, int k) {
        if (n < k) {
            return 0;
        }
        if (star[n][k] != null) {
            return star[n][k] % mod;
        }
        star[n][k] = (search(n - 1, k - 1) + k * search(n - 1, k)) % mod;
        return star[n][k];
    }
}