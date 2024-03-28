import java.util.*;
import java.io.*;

public class p02980 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int mod = 998244353;

        if (N > M) {
            N = M - N;
        }

        int[] fact = new int[M + 1];
        int[] powm = new int[M + 1];
        int[] pown = new int[M + 1];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            powm[i] = (powm[i - 1] * (M + 1)) % mod;
            pown[i] = (pown[i - 1] * (N + 1)) % mod;
        }

        int[] inv_fact = new int[M + 1];
        inv_fact[M] = pow(fact[M], mod - 2);
        for (int i = M - 1; i >= 0; i--) {
            inv_fact[i] = (inv_fact[i + 1] * (i + 1)) % mod;
        }

        long ans = 0;
        for (int i = 0; i <= N; i++) {
            ans += (-1) * (pow(fact[N], mod - 2)) % mod * (pow(fact[M], mod - 2)) % mod * (pow(fact[i], mod - 2)) % mod * (pow(inv_fact[i], mod - 2)) % mod * (pow(inv_fact[N - i], mod - 2)) % mod * (pow(inv_fact[M - i], mod - 2)) % mod * (powm[N - i]) % mod * (pown[M - i]) % mod;
            ans = ans % mod;
        }

        System.out.println(ans);
    }

    public static int pow(int n, int m) {
        if (m == 0) {
            return 1;
        } else if (m == 1) {
            return n;
        } else if (m % 2 == 0) {
            return pow(n, m / 2) * pow(n, m / 2);
        } else {
            return pow(n, m / 2) * pow(n, m / 2) * n;
        }
    }
}