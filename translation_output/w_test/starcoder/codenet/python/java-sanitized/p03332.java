import java.util.*;
import java.lang.*;
import java.io.*;

public class p03332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 998244353;
        int[] inv = new int[N + 1];
        int[] nCr = new int[N + 1];
        inv[1] = 1;
        nCr[0] = 1;
        for (int i = 2; i <= N; i++) {
            inv[i] = (-(MOD / i) * inv[MOD % i]) % MOD;
        }
        for (int i = 1; i <= N; i++) {
            nCr[i] = (nCr[i - 1] * (N - i + 1) * inv[i]) % MOD;
        }
        int ans = 0;
        for (int a = 0; a <= N; a++) {
            int b = (K - A * a) / B;
            if (A * a + B * b == K && 0 <= b && b <= N) {
                ans += (nCr[a] * nCr[b]) % MOD;
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }
}