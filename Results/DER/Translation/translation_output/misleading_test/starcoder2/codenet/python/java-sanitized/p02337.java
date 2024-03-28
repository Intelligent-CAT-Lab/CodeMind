import java.util.*;

public class p02337 {
    static int mod = (int)1e9 + 7;
    static int[][] star = new int[1001][1001];
    static {
        for (int i = 0; i < 1001; i++) {
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 0;
        }
    }

    static int search(int n, int k) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != 0) {
            return star[n][k] % mod;
        } else {
            star[n][k] = (search(n-1, k-1) + k * search(n-1, k)) % mod;
            return star[n][k];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 0; i <= k; i++) {
            ans += search(n, i);
            ans = ans % mod;
        }
        System.out.println(ans);
    }
}