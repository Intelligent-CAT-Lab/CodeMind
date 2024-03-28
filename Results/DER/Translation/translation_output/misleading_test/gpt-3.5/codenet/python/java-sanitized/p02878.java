import java.util.*;

public class p02878 {
    static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();

        long[] F = new long[N + 1];
        long[] I = new long[N + 1];
        long z = 0;

        long f = 1;
        for (int n = 1; n <= N; n++) {
            f = (f * n) % MOD;
            F[n] = f;
        }

        long i = pow(f, MOD - 2);
        I[N] = i;
        for (int n = N; n > 1; n--) {
            I[n - 1] = i = (i * n) % MOD;
        }

        for (int k = 0; k < Math.min(A + 1, N - B) || (N - B - A == 0 && k < A + 1); k++) {
            int Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k] % MOD;
            z = z % MOD;
        }

        System.out.println(B != 0 ? z : 1);
    }

    static long pow(long base, long exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }
        return result;
    }
}