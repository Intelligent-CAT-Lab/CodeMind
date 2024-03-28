import java.util.Arrays;
import java.util.Scanner;

public class p03332 {
    private static final int MOD = 998244353;

    public static int getInv(int N) {
        int[] inv = new int[N + 1];
        Arrays.fill(inv, 0);
        inv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i <= N; i++) {
            inv[i] = (MOD / i) * inv[(MOD % i)];
        }
        return inv[N];
    }

    public static int getCmb(int N) {
        int[] inv = getInv(N);
        int[] nCr = new int[N + 1];
        Arrays.fill(nCr, 0);
        nCr[0] = 1;
        nCr[0] = 1;
        for (int i = 1; i <= N; i++) {
            nCr[i] = (nCr[i - 1] * (N - i + 1) * inv[i]) % MOD;
        }
        return nCr[N];
    }

    public static int solve(int N, int A, int B, int K) {
        int ans = 0;
        int[] nCr = getCmb(N);
        for (int a = 0; a <= N; a++) {
            int b = (K - A * a) / B;
            if (A * a + B * b == K && 0 <= b <= N) {
                ans += (nCr[a] * nCr[b]);
                ans %= MOD;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(solve(N, A, B, K));
    }
}