import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p04004 {
    static final long MOD = 1000000007;
    static final int U = 1000000;
    static long[] power2 = new long[U];
    static long[] power2_inv = new long[U];
    static long[] power3 = new long[U];
    static long[] power3_inv = new long[U];
    static long[] fact = new long[U];
    static long[] fact_inv = new long[U];
    static long[] x = new long[U];
    static long[] coef = new long[U];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        makePower(2, U, MOD);
        makePower(modPow(2, MOD - 2, MOD), U, MOD);
        makePower(3, U, MOD);
        makePower(modPow(3, MOD - 2, MOD), U, MOD);
        makeFact(U, MOD);

        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i - 1] + MOD - power2[i - 1] * power3_inv[K + i - 1] % MOD * fact[K + i - 1] % MOD * fact_inv[i - 1] % MOD * fact_inv[i] % MOD) % MOD;
        }

        for (int i = 0; i < M; i++) {
            coef[i] = fact[N + i] * fact_inv[i] % MOD * fact_inv[N] % MOD * power3[K + i] % MOD;
        }

        long answer = 0;
        for (int i = 0; i < M; i++) {
            answer = (answer + coef[i] * x[N + i] % MOD) % MOD;
        }

        System.out.println(answer);
    }

    static void makePower(long a, int L, long MOD) {
        int B = Integer.toBinaryString(L).length();
        long[] x = new long[1 << B];
        x[0] = 1;
        x[1] = a;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                x[i] = x[i - 1] * (a * x[i - 1] % MOD) % MOD;
            }
        }
        if (a == 2) {
            System.arraycopy(x, 0, power2, 0, L);
        } else if (a == modPow(2, MOD - 2, MOD)) {
            System.arraycopy(x, 0, power2_inv, 0, L);
        } else if (a == 3) {
            System.arraycopy(x, 0, power3, 0, L);
        } else {
            System.arraycopy(x, 0, power3_inv, 0, L);
        }
    }

    static void makeFact(int U, long MOD) {
        fact[0] = 1;
        for (int i = 1; i < U; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        fact_inv[U - 1] = modPow(fact[U - 1], MOD - 2, MOD);
        for (int i = U - 2; i >= 0; i--) {
            fact_inv[i] = fact_inv[i + 1] * (i + 1) % MOD;
        }
    }

    static long modPow(long a, long b, long MOD) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}