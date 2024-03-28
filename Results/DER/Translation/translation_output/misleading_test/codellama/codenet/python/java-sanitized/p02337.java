import java.util.Scanner;

public class p02337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;
        int[][] star = new int[1001][1001];
        for (int i = 0; i < 1001; i++) {
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 0;
        }
        int ans = 0;
        for (int i = 0; i <= k; i++) {
            ans += search(n, i, star, mod);
            ans %= mod;
        }
        System.out.println(ans);
    }

    private static int search(int n, int k, int[][] star, int mod) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != 0) {
            return star[n][k] % mod;
        } else {
            star[n][k] = (search(n-1, k-1, star, mod) + k * search(n-1, k, star, mod)) % mod;
            return star[n][k] % mod;
        }
    }
}