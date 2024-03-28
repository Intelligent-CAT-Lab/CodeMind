import java.util.*;

public class p02878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        long M = 998244353;
        long P = N + 1;
        long f = 1;
        long[] F = new long[P];
        long[] I = new long[P];
        long z = 0;
        for (int n = 1; n <= P; n++) {
            F[n] = f = f * n % M;
        }
        I[N] = (long) Math.pow(f, M - 2, M);
        for (int n = N; n >= 1; n--) {
            I[n - 1] = I[n] * n % M;
        }
        for (int k = Math.min(A + 1, N - B); k >= 1; k--) {
            long Q = N - B - k;
            z += (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k];
        }
        System.out.println(z % M == 0 ? z : 1);
    }
}