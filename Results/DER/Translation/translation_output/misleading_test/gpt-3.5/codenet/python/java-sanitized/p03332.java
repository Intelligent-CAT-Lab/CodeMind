import java.util.*;

public class p03332 {
    static int MOD = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        
        long result = solve(N, A, B, K);
        System.out.println(result);
    }

    static long[] getInv(int N) {
        long[] inv = new long[N + 1];
        inv[1] = 1;
        for (int i = 2; i <= N; i++) {
            inv[i] = (-(MOD / i) * inv[MOD % i]) % MOD;
        }
        return inv;
    }

    static long[] getCmb(int N) {
        long[] inv = getInv(N);
        long[] nCr = new long[N + 1];
        nCr[0] = 1;
        for (int i = 1; i <= N; i++) {
            nCr[i] = (nCr[i - 1] * (N - i + 1) % MOD * inv[i]) % MOD;
        }
        return nCr;
    }

    static long solve(int N, int A, int B, int K) {
        long ans = 0;
        long[] nCr = getCmb(N);
        for (int a = 0; a <= N; a++) {
            int b = (K - A * a) / B;
            if ((A * a + B * b == K) && (0 <= b && b <= N)) {
                ans = (ans + (nCr[a] * nCr[b]) % MOD) % MOD;
            }
        }
        return ans;
    }
}