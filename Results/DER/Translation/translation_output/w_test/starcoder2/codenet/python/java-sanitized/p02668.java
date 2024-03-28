import java.util.*;
import java.io.*;

public class p02668 {
    static final int MOD = (int)1e9 + 7;
    static final int MAX = 1000000;
    static int[] pow2 = new int[MAX + 10];
    static int[] ipow2 = new int[MAX + 10];
    static int[] dp = new int[MAX + 10];
    static int[] B = new int[MAX + 10];
    static int[] C = new int[MAX + 10];

    static void make_power(int a, int L) {
        int B = Integer.highestOneBit(L);
        pow2[0] = 1;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                pow2[i] = (int)((long)pow2[i - (1 << n)] * a % MOD);
            }
            a = (int)((long)a * a % MOD);
        }
        for (int i = 0; i < L; i++) {
            pow2[i] = pow2[i];
        }
    }

    static void make_ipower(int a, int L) {
        int B = Integer.highestOneBit(L);
        ipow2[0] = 1;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                ipow2[i] = (int)((long)ipow2[i - (1 << n)] * a % MOD);
            }
            a = (int)((long)a * a % MOD);
        }
        for (int i = 0; i < L; i++) {
            ipow2[i] = ipow2[i];
        }
    }

    static void update(int[] dp) {
        for (int i = 0; i < dp.length; i++) {
            B[i] = dp[i];
        }
        for (int i = 0; i < dp.length; i++) {
            C[i] = (int)((long)dp[i] * i % MOD * ipow2[i] % MOD);
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = (int)((long)dp[i - 1] + C[i - 1]) % MOD;
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = (int)((long)dp[i] * pow2[i] % MOD);
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = (int)((long)dp[i] + i * B[i - 1] % MOD) % MOD;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        make_power(2, M + 10);
        make_ipower((1 + MOD) / 2, M + 10);
        for (int i = 0; i < M + 1; i++) {
            dp[i] = pow2[i];
        }
        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }
        System.out.println(dp[M]);
    }
}