import java.util.*;

public class p02965 {
    private static final int INF = Integer.MAX_VALUE;
    private static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] factorials = new int[M * 3 / 2 + N + 1];
        Arrays.fill(factorials, 1);
        for (int i = 2; i <= M * 3 / 2 + N; i++) {
            factorials[i] = factorials[i - 1] * i;
            factorials[i] %= MOD;
        }

        int[] finvs = new int[M * 3 / 2 + N + 1];
        Arrays.fill(finvs, 1);
        for (int i = 2; i <= M * 3 / 2 + N; i++) {
            int p = (MOD - finvs[i]) / i;
            p %= MOD;
            finvs[i] = p;
        }

        int[] c = new int[M * 3 / 2 + N + 1];
        int oc1 = ncr(N, M % 2, MOD);
        int oc2 = ncr(N - 1, M % 2, MOD);

        int halves = (M * 3 - M % 2) / 2;
        c[halves + N - 1] = oc1;
        c[halves + N - 2] = oc2;

        int c1 = 0;
        for (int i = halves; i < halves + N - 1; i++) {
            c1 += c[i] * factorials[i + N - 1 - i];
            c1 %= MOD;
        }

        int c2a = 0;
        int c2b = 0;
        for (int i = halves; i < halves + N - 1; i++) {
            c2a += c[i] * factorials[i + N - 1 - i];
            c2b += c[i] * factorials[i + N - 2 - i];
        }

        int c2 = (c2a - c2b) * N % MOD;

        System.out.println((c1 - c2).sum() % MOD);
    }

    private static int ncr(