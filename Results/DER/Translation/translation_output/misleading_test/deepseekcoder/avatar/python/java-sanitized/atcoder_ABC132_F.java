import java.util.*;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long mod = (long)Math.pow(10, 9) + 7;

        List<Long> coef = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef.add((n / i) - (n / (i + 1)));
        }
        for (int i = 0; i < n - coef.stream().mapToLong(Long::longValue).sum(); i++) {
            coef.add(1L);
        }
        Collections.reverse(coef);

        long[][] dp = new long[k + 1][coef.size()];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = coef.size() - 1; j >= 0; j--) {
                tmp += dp[i - 1][coef.size() - 1 - j];
                tmp %= mod;
                dp[i][j] = coef.get(j) * tmp;
                dp[i][j] %= mod;
            }
        }

        long sum = 0;
        for (int i = 0; i < coef.size(); i++) {
            sum += dp[k][i];
            sum %= mod;
        }
        System.out.println(sum);
    }
}