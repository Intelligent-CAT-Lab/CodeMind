import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class p02992 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N < i * i) {
                break;
            }
            ns.add(i);
            ns.add(N / i);
        }
        ns = ns.stream().distinct().sorted().collect(Collectors.toList());

        int[] m = new int[ns.size()];
        for (int i = 0; i < ns.size(); i++) {
            m[i] = ns.get(i);
        }
        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size(); i++) {
            l[i] = (N / ns.get(i)) - (N / ns.get(i + 1));
        }

        int[][] dp = new int[K + 1][ns.size()];
        dp[0][m[N]] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0; j < ns.size(); j++) {
                int nn = ns.get(j);
                int nj = m[N / nn];
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        int result = 0;
        for (int i = 0; i < ns.size(); i++) {
            result += dp[K][i];
        }
        System.out.println(result % MOD);
    }
}