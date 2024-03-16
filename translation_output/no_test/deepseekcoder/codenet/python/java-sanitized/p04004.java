import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p04004 {
    static final long MOD = (long) Math.pow(10, 9) + 7;
    static long[] fact, factInv;
    static long[] power2, power2Inv;
    static long[] power3, power3Inv;
    static int U = (int) Math.pow(10, 6);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        init();

        long[] x = new long[N + M + 1];
        x[1] = -1 * power2[N + M] * power3Inv[K + 1] % MOD;
        x[1] = x[1] * fact[K + 1] % MOD * factInv[K] % MOD * factInv[1] % MOD;
        x[1] %= MOD;

        for (int i = 2; i <= N + M; i++) {
            x[i] = x[i - 1] * (N + M - i + 2) % MOD * power2Inv[i - 1] % MOD;
            x[i] = x[i] * power3[i - 1] % MOD;
            x[i] %= MOD;
        }

        long coef = fact[N] * factInv[M] % MOD * factInv[N] % MOD;
        coef = coef * power3[K] % MOD;
        for (int i = 0; i < M; i++) {
            coef = coef * power2Inv[i + 1] % MOD;
        }
        coef %= MOD;

        long answer = 0;
        for (int i = N; i <= N + M; i++) {
            answer = (answer + coef * x[i] % MOD) % MOD;
        }

        System.out.println(answer);
    }

    static void init() {
        fact = new long[U + 1];
        factInv = new long[U + 1];
        power2 = new long[U + 1];
        power2Inv = new long[U + 1];
        power3 = new long[U + 1];
        power3Inv = new long[U + 1];

        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        factInv[U] = pow(fact[U], MOD - 2);
        for (int i = U - 1; i >= 0; i--) {
            factInv[i] = factInv[i + 1] * (i + 1) % MOD;
        }

        power2[0] = 1;
        for (int i = 1; i <= U; i++) {
            power2[i] = power2[i - 1] * 2 % MOD;
        }

        power2Inv[U] = pow(power2[U], MOD - 2);
        for (int i = U - 1; i >= 0; i--) {
            power2Inv[i] = power2Inv[i + 1] * 2 % MOD;
        }

        power3[0] = 1;
        for (int i = 1; i <= U; i++) {
            power3[i] = power3[i - 1] * 3 % MOD;
        }

        power3Inv[U] = pow(power3[U], MOD - 2);
        for (int i = U - 1; i >= 0; i--) {
            power3Inv[i] = power3Inv[i + 1] * 3 % MOD;
        }
    }

    static long pow(long a, long b) {
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