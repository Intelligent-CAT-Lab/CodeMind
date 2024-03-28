import java.util.Scanner;

public class p02878 {
    private static final int M = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int[] F = new int[N + 1];
        int[] I = new int[N + 1];
        long f = 1;
        F[0] = 1;

        for (int n = 1; n <= N; ++n) {
            f = f * n % M;
            F[n] = (int) f;
        }

        long i = pow(f, M - 2, M);
        I[N] = (int) i;

        for (int n = N; n > 0; --n) {
            i = i * n % M;
            I[n - 1] = (int) i;
        }

        long z = 0;
        int minAB = Math.min(A + 1, N - B);

        if (N - B - A < 0) {
            minAB = A + 1;
        }

        for (int k = 0; k < minAB; ++k) {
            long Q = N - B - k - 1;
            z = (z + (long) (B - k) * F[B + k - 1] * I[B] % M * I[k] % M * F[(int) (Q + A - k)] % M * I[(int) Q] % M * I[A - k]) % M;
        }
        System.out.println(B == 0 ? 1 : z);
    }

    private static long pow(long base, int exponent, int modulus) {
        long result = 1;
        base = base % modulus;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            exponent >>= 1;
            base = (base * base) % modulus;
        }
        return result;
    }
}