import java.util.*;

public class p02878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = 998244353;
        int P = N + 1;
        int f = 1;
        int[] F = new int[P];
        int[] I = new int[P];
        int z = 0;

        for (int n = 1; n < P; n++) {
            F[n] = f = (f * n) % M;
        }

        I[N] = (int) Math.pow(f, M - 2, M);

        for (int n = N; n > 0; n--) {
            I[n - 1] = (int) (I[n] * n % M);
        }

        for (int k = Math.min(A + 1, N - B) == 0? A + 1 : Math.min(A + 1, N - B); k <= A + 1; k++) {
            int Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k];
        }

        System.out.println(z % M == 0? 1 : z % M);
    }
}