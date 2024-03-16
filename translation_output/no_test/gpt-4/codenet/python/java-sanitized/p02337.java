import java.util.Scanner;

public class p02337 {

    private static final int MAX = 1001;
    private static final long MOD = 1000000007;
    private static Long[][] star = new Long[MAX][MAX];

    static {
        // Initializing the dynamic programming table
        for (int i = 0; i < MAX; i++) {
            star[i][1] = 1L;
            star[i][i] = 1L;
            star[i][0] = 0L;
        }
    }

    public static long search(int n, int k) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != null) { // We use null check in Java instead of checking against None
            return star[n][k] % MOD;
        } else {
            star[n][k] = (search(n - 1, k - 1) + k * search(n - 1, k)) % MOD;
            return star[n][k];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // No need to set recursion limit as done in Python, Java handles deep recursion well.

        // Reading values of n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;

        for (int i = 0; i <= k; i++) {
            ans += search(n, i);
            ans = ans % MOD;
        }

        System.out.println(ans);

        scanner.close();
    }
    
}