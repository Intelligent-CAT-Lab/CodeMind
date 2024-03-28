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

        // (1) æ°åã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ°åãå¥æ°ã®æ