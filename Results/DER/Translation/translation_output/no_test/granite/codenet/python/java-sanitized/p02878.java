import java.util.*;

public class p02878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = 998244353;
        int P = N + 1;
        long f = 1;
        long[] F = new long[P];
        long[] I = new long[P];
        long z = 0;
        for (int n = 1; n < P; n++) {
            F[n] = f = f * n % M;
        }
        I[N] = (long) Math.pow(f, M - 2, M);
        for (int n = N; n > 0; n--) {
            I[n - 1] = I[n] * n % M;
        }
        for (int k = Math.min(A + 1, N - B) == 0? A + 1 : Math.min(A + 1, N - B); k < N - B + 1; k++) {
            int Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] % M * I[B] % M * I[k] % M * F[Q + A - k] % M * I[Q] % M * I[A - k] % M;
        }
        System.out.println(z % M == 0? 1 : z % M);
    }
}