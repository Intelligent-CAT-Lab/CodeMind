import java.util.Scanner;

public class p02337 {
    static final int MOD = 1000000007;
    static final int MAX = 1001;
    static int[][] star = new int[MAX][MAX];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= MAX; i++) {
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 0;
        }

        int ans = 0;
        for (int i = 0; i <= k; i++) {
            ans = (ans + search(n, i)) % MOD;
        }

        System.out.println(ans);
    }

    static int search(int n, int k) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != 0) {
            return star[n][k] % MOD;
        } else {
            star[n][k] = (search(n - 1, k - 1) + k * search(n - 1, k)) % MOD;
            return star[n][k];
        }
    }
}