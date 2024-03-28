import java.util.*;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        List<Integer> coef = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef.add((n / i) - (n / (i + 1)));
        }
        for (int i = 0; i < n - coef.stream().mapToInt(Integer::intValue).sum(); i++) {
            coef.add(1);
        }
        Collections.reverse(coef);
        int nn = coef.size();
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = coef.get(j) * tmp;
                dp[i][j] %= mod;
            }
        }
        int sum = 0;
        for (int i = 0; i < nn; i++) {
            sum += dp[k][i];
            sum %= mod;
        }
        System.out.println(sum);
    }
}