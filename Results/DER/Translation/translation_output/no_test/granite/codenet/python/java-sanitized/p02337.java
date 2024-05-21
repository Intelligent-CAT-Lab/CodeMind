import java.util.*;

public class p02337 {
    static int mod = 100000007;
    static long[][] star = new long[1001][1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < 1001; i++) {
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 0;
        }
        for (int i = 2; i < 1001; i++) {
            for (int j = 2; j < 1001; j++) {
                star[i][j] = (star[i-1][j-1] + j * star[i-1][j]) % mod;
            }
        }
        long ans = 0;
        for (int i = 0; i <= k; i++) {
            ans += star[n][i];
            ans = ans % mod;
        }
        System.out.println(ans);
    }
}