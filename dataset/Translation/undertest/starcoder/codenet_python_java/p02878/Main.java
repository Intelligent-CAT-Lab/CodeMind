import java.util.*;
public class p02878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = 998244353;
        int P = N + 1;
        int[] F = new int[P];
        int[] I = new int[P];
        int z = 0;
        F[0] = 1;
        I[0] = 1;
        for (int n = 1; n < P; n++) {
            F[n] = F[n - 1] * n % M;
        }
        I[N] = 1;
        for (int n = N; n > 0; n--) {
            I[n - 1] = I[n] * n % M;
        }
        for (int k = Math.min(A + 1, N - B); k >= 0; k--) {
            int Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k];
        }
        System.out.println(z % M);
    }
}