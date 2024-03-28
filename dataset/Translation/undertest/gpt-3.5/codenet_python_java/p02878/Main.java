import java.util.Scanner;

public class p02878 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int M = 998244353;
        int P = N + 1;
        int f = 1;
        long[] F = new long[P];
        long[] I = new long[P];
        long z = 0;

        for (int n = 1; n < P; n++) {
            F[n] = f = (f * n) % M;
        }
        
        I[N] = pow(f, M - 2, M);

        for (int n = N; n > 1; n--) {
            I[n - 1] = (I[n] * n) % M;
        }

        for (int k = 0; k < Math.min(A + 1, N - B) || (N - B - A) == 0; k++) {
            int Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k];
        }

        System.out.println(z % M);
    }

    public static long pow(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}