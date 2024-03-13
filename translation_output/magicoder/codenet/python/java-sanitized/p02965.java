import java.util.*;
import java.io.*;

public class p02965 {
    static final int MOD = 998244353;
    static final int MAX = 100000;
    static long[] factorials = new long[MAX + 1];
    static long[] finvs = new long[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        getFactorials(M * 3 / 2 + N);
        long p = 1;
        for (int i = 1; i <= M * 3 / 2 + N; i++) {
            p = p * modInv(i) % MOD;
            finvs[i] = p;
        }

        long[] odds = new long[M + 1];
        for (int i = 0; i <= M; i += 2) {
            odds[i] = i;
        }

        long[] oc1 = new long[M + 1];
        long[] oc2 = new long[M + 1];
        for (int i = 0; i <= M; i++) {
            oc1[i] = ncr(N, odds[i]);
            oc2[i