import java.util.*;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        final long mod = 1000000007;
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        List<Long> coef = new ArrayList<>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
            coef.add((n / i) - (n / (i + 1)));
        }
        for (long i = 0; i < n - coef.stream().mapToLong(Long::longValue).sum(); i++) {
            coef.add(1L);
        }
        Collections.reverse(coef);
        int nn = coef.size();
        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = coef.get(j) * tmp;
                dp[i][j] %= mod;
            }
        }
        long sum = 0;
        for (int i = 0; i < nn; i++) {
            sum += dp[k][i];
            sum %= mod;
        }
        System.out.println(sum);
    }
}