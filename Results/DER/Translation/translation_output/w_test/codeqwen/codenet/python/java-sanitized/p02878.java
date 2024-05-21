import java.util.Scanner;

public class p02878 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int M = 998244353;
        int P = N + 1;
        long f = 1;
        long[] F = new long[P];
        long[] I = new long[P];
        int z = 0;
        for (int n = 1; n < P; n++) {
            F[n] = f = (f * n) % M;
        }
        I[N] = 1;
        for (int n = N; n > 0; n--) {
            I[n - 1] = 1;
            for (int k = 1; k <= n; k++) {
                I[n - 1] = (I[n - 1] * k) % M;
            }
            I[n - 1] = pow(I[n - 1], M - 2, M);
        }
        for (int k = 0; k < Math.min(A + 1, N - B) && N - B - A != 0; k++) {
            int Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k];
            z %= M;
        }
        System.out.println(z);
    }

    public static long pow(long a, long b, long m) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }