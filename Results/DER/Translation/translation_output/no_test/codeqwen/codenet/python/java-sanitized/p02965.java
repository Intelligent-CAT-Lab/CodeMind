import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02965 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        int[] factorials = getFactorials(M * 3 / 2 + N, MOD);
        int[] finvs = modInv(M * 3 / 2 + N, MOD);

        int[] odds = new int[M % 2 + M];
        for (int i = M % 2; i <= M; i += 2) {
            odds[i] = i;
        }
        int halves = (M * 3 - odds[M]) / 2;

        int[] oc1 = ncr(N, odds, MOD);
        int[] oc2 = ncr(N - 1, odds, MOD);

        int c1 = 0;
        for (int i = 0; i < halves + N - 1; i++) {
            c1 = (c1 + (long) factorials[i] * finvs[i] % MOD * finvs[halves + N - 1 - i] % MOD * oc1[i]) % MOD;
        }

        int[] c2 = new int[M * 3 / 2 + N + 1];
        Arrays.fill(c2, 1);
        int p = 1;
        for (int i = 0; i < halves + N - 1; i++) {
            p = (p * finvs[i]) % MOD;
            c2[i] = p;
        }
        for (int i = halves + N - 2; i >= 0; i--) {
            c2[i] = (c2[i + 1] - c2[i + 2]) * N % MOD;
        }

        int c2