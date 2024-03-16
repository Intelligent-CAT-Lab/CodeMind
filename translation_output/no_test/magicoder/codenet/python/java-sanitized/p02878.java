import java.util.*;

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
        long z = 0;
        F[0] = 1;
        I[N] = 1;
        for (int n = 1; n < P; n++) {
            F[n] = f = (f * n) % M;
        }
        for (int n = N; n > 0; n--) {
            I[n - 1] = (I[n] * n) % M;
        }
        for (int k = 0; k < Math.min(A + 1, N - B); k++) {
            int Q = N - B - k - 1;
            z = (z + (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k]) % M;
        }
        System.out.println(z % M);
    }
}