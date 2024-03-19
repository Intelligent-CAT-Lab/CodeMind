import java.util.*;

public class p02878 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        long M = 998244353;
        int P = N + 1;
        long[] F = new long[P];
        long[] I = new long[P];
        F[0] = I[0] = 1;
        for (int n = 1; n < P; n++) {
            F[n] = (F[n - 1] * n) % M;
            I[n] = pow(F[n], M - 2, M);
        }
        long z = 0;
        int minAB = Math.min(A + 1, N - B);
        for (int k = 1; k <= (minAB == 0 ? A + 1 : minAB); k++) {
            int Q = N - B - k;
            z = (z + ((B - k) * F[B + k - 1] % M * I[B] % M * I[k] % M * F[Q + A - k] % M * I[Q] % M * I[A - k] % M) % M) % M;
        }
        System.out.println(z);
    }

    private static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return result;
    }
}