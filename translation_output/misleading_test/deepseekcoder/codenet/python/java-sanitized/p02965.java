import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02965 {
    static final long MOD = 998244353;
    static long[] factorials;
    static long[] finvs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        factorials = new long[M * 3 / 2 + N + 1];
        finvs = new long[M * 3 / 2 + N + 1];

        getFactorials(M * 3 / 2 + N, MOD);
        getInvFactorials(M * 3 / 2 + N, MOD);

        long odds = 0;
        for (int i = M % 2; i <= M; i += 2) {
            odds += ncr(N, i, MOD) * ncr(N - 1, i, MOD) % MOD;
        }