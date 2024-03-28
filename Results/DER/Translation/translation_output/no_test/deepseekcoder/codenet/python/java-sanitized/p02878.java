import java.util.Scanner;

public class p02878 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        long M = 998244353;
        int P = N + 1;
        long f = 1;
        long[] F = new long[P];
        long[] I = new long[P];
        long z = 0;
        F[0] = 1;
        I[N] = pow(F[N], M - 2, M);
        for (int n = 1; n < P; n++) {
            F[n] = f = (f * n) % M;
            I[N - n] = (I[N - n + 1] * (N - n + 1)) % M;
        }
        for (int k = 0; k <= Math.min(A, N - B); k++) {
            int Q = N - B - k - 1;
            z = (z + ((B - k) * F[B + k - 1] % M * I[B] % M * I[k] % M * F[Q + A - k] % M * I[Q] % M * I[A - k] % M) % M) % M;
        }
        System.out.println(z == 0 ? (int) M : (int) z);
    }

    public static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b = b / 2;
        }
        return result;
    }
}